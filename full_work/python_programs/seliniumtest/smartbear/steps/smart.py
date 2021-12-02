import time
from behave import given, when, then
from selenium import webdriver
@given('User is on Home Page')
def user_on_homepage(context):
    context.driver = webdriver.Chrome(executable_path="G://pythonProject//seliniumtest//browser//chromedriver.exe")
    context.driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx")

@when('User enters Credentials to Login')
def enters_credentials(context):
    context.driver.find_element_by_id("ctl00_MainContent_username").send_keys("Tester")
    time.sleep(1)
    context.driver.find_element_by_id("ctl00_MainContent_password").send_keys("test")
    time.sleep(1)
    context.driver.find_element_by_id("ctl00_MainContent_login_button").click()
    time.sleep(1)


@then('user should see Web Orders')
def see_web_orders(context):
   context.driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx")
   time.sleep(1)
