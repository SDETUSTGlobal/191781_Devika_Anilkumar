import time
from behave import given, when, then
from selenium import webdriver
@given('User is on Home Page')
def user_is_on_homepage(context):
    context.driver = webdriver.Chrome(executable_path="G://pythonProject//seliniumtest//browser//chromedriver.exe")
    context.driver.get("https://www.amazon.in/")


@when('User enters shoe stand')
def user_enters_shoe_stand(context):
    context.driver.find_element_by_id("twotabsearchtextbox").send_keys("shoe stand")
    time.sleep(1)
    context.driver.find_element_by_id("nav-search-submit-button").click()
    time.sleep(1)


@then('user add shoe stand to cart')
def user_add_to_cart(context):
    context.driver.find_element_by_xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[1]/span/div/div/div[1]/div[2]/div[1]/div/div[1]/a/div/img").click()
    time.sleep(1)
    context.driver.find_element_by_id("add-to-cart-button").click()
    time.sleep(1)
