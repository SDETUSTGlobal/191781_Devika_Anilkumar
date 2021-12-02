from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys
print("test case started")
#open Google Chrome browser
driver = webdriver.Chrome()
#maximize the window size
driver.maximize_window()
#delete the cookies
driver.delete_all_cookies()
#navigate to the url
driver.get("http://127.0.0.1:5000/")
#identify the user name text box and enter the value
driver.find_element_by_id("fn").send_keys("devi")
time.sleep(1)

driver.find_element_by_class_name("b").send_keys("1234")
time.sleep(1)
driver.find_element_by_name("cna").send_keys("ust")
time.sleep(1)
driver.find_element_by_name("email").send_keys("devi123@gmail.com")
time.sleep(1)
driver.find_element_by_xpath("/html/body/form/table/tbody/tr[5]/td/center/input").click()
time.sleep(2)
driver.close()