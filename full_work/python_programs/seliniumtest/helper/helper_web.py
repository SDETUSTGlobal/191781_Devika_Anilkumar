from selenium import webdriver
from helper.helper_base import HelperFunc

caps = {}


def get_browser(browser, browser_version, platform, user_name, access_key):
    remote_url = "https://" + user_name + ":" + access_key + "@hub.lambdatest.com/wd/hub"
    caps['name'] = "[LambdaTest] [Behave] ToDo Application using Behave and Selenium"
    caps['build'] = "[LambdaTest] [Behave] ToDo Application using Behave and Selenium"
    caps['browserName'] = browser
    caps['version'] = browser_version
    caps['platform'] = platform
    caps['network'] = True
    caps['visual'] = True
    caps['video'] = True
    caps['console'] = True
    if browser == "chrome":
        # return Web(webdriver.Chrome())
        return HelperFunc(webdriver.Remote(command_executor=remote_url, desired_capabilities=caps))

