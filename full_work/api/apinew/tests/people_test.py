import json
from uuid import uuid4

import pytest
import requests
from assertpy import assert_that
from jsonpath_ng.ext import parse
from numpy import random

from config import BASE_URI
from utils.file_reader import read_file


@pytest.fixture
def create_data():
    payload = read_file('create_person.json')

    random_no = random.randint(0, 1000)
    last_name = f'Olabini{random_no}'

    payload['lname'] = last_name
    yield payload


def test_person_can_be_added_with_a_json_template(create_data):
    create_person_with_unique_last_name(create_data)

    response = requests.get(BASE_URI)
    peoples = json.loads(response.text)

    # Get all last names for any object in the root array
    # Here $ = root, [*] represents any element in the array
    # Read full syntax: https://pypi.org/project/jsonpath-ng/
    jsonpath_expr = parse("$.[*].lname")
    result = [match.value for match in jsonpath_expr.find(peoples)]

    expected_last_name = create_data['lname']
    assert_that(result).contains(expected_last_name)


def create_person_with_unique_last_name(body=None):
    if body is None:
        # Ensure a user with a unique last name is created everytime the test runs
        # Note: json.dumps() is used to convert python dict to json string
        unique_last_name = f'User {str(uuid4())}'
        payload = json.dumps({
            'fname': 'New',
            'lname': unique_last_name
        })
    else:
        unique_last_name = body['lname']
        payload = json.dumps(body)

    # Setting default headers to show that the client accepts json
    # And will send json in the headers
    headers = {
        'Content-Type': 'application/json',
        'Accept': 'application/json'
    }

    # We use requests.post method with keyword params to make the request more readable
    response = requests.post(url=BASE_URI, data=payload, headers=headers)
    assert_that(response.status_code, description='Person not created').is_equal_to(requests.codes.no_content)
    return unique_last_name