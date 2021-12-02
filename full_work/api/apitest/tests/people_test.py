import random
from json import loads

import pytest
import requests
from assertpy.assertpy import assert_that
from jsonpath_ng import parse

from clients.people.people_client import PeopleClient
from config import BASE_URI
from tests.helpers.people_helpers import search_created_user_in
from utils.file_reader import read_file

client = PeopleClient()


def test_read_all_has_kent():
   response = client.read_all_persons()

   assert_that(response.status_code).is_equal_to(requests.codes.ok)
   assert_that(response.as_dict).extracting('fname').is_not_empty().contains('Kent')


def test_new_person_can_be_added():
   last_name, response = client.create_person()
   peoples = client.read_all_persons().as_dict

   is_new_user_created = search_created_user_in(peoples, last_name)
   assert_that(is_new_user_created).is_not_empty()