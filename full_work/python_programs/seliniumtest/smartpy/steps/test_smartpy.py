import pytest

from pytest_bdd import scenarios, given, when, then, parsers
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

# Constants

Smart_HOME = 'http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx'

# Scenarios

scenarios('../smartpy.feature')


# Fixtures

@pytest.fixture
def browser():
    b = webdriver.Chrome(executable_path="G://pythonProject//seliniumtest//browser//chromedriver.exe")
    b.implicitly_wait(10)

    yield b
    b.quit()


# Given Steps

@given('the SmartBear login page is displayed')
def ddg_home(browser):
    browser.get(Smart_HOME)


# When Steps

@when(parsers.parse('the user enters the username and password'))
def search_phrase(browser):
    search_input = browser.find_element_by_id('ctl00_MainContent_username')
    search_input.send_keys('Tester')
    search_pass = browser.find_element_by_id('ctl00_MainContent_password')
    search_pass.send_keys('test')
    search = browser.find_element_by_id('ctl00_MainContent_login_button')
    search.click()

@then(parsers.parse('the user click on view all products'))
def search_product(browser):
    search_pro = browser.find_element_by_link_text('View all products')
    search_pro.click()
@then(parsers.parse('the user click on view all orders'))
def search_orders(browser):
    search_or = browser.find_element_by_link_text('View all orders')
    search_or.click()
@then(parsers.parse('the user click on orders'))
def search_Order(browser):
    search_Or = browser.find_element_by_link_text('Order')
    search_Or.click()


