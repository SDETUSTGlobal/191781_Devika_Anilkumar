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
driver.get("https://www.amazon.in/")  
#identify the user name text box and enter the value  
driver.find_element_by_id("twotabsearchtextbox").send_keys("shoe stand")  
time.sleep(2) 
driver.find_element_by_id("nav-search-submit-button").click()
time.sleep(2)  
driver.find_element_by_xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[1]/span/div/div/div[1]/div[2]/div[1]/div/div[1]/a/div/img").click()
time.sleep(2) 
driver.find_element_by_id("add-to-cart-button").click()
time.sleep(2)
driver.find_element_by_id("hlb-view-cart-announce").click()
time.sleep(2)
driver.close()  
print("successfully completed")  
