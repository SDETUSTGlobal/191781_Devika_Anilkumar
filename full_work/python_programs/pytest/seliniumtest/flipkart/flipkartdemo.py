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
driver.get("https://www.flipkart.com/")  
#identify the user name text box and enter the value  
driver.find_element_by_xpath("/html/body/div[2]/div/div/button").click() 
driver.find_element_by_xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input").send_keys("charger") 
driver.find_element_by_class_name("_34RNph").click()
driver.get("https://www.flipkart.com/flipkart-smartbuy-10-w-2a-mobile-charger-charge-sync-usb-cable/p/itmd88cc4a13ac58?pid=ACCG4XTXU4AJRJRM&lid=LSTACCG4XTXU4AJRJRM1GQRMA&marketplace=FLIPKART&q=charger&store=tyy%2F4mr%2Ftp2%2Floq&spotlightTagId=BestsellerId_tyy%2F4mr%2Ftp2%2Floq&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&fm=SEARCH&iid=dc04a7cb-22fd-4d81-adc9-befc1bf48030.ACCG4XTXU4AJRJRM.SEARCH&ppt=sp&ppn=sp&ssid=nx6e1x2p1s0000001637745919775&qH=b3b5a9831031686a")
#driver.find_element_by_id("nav-search-submit-button").click()
#time.sleep(2) 
#driver.find_element_by_xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[1]/span/div/div/div[1]/div[2]/div[1]/div/div[1]/a/div/img").click()
#time.sleep(2) 
#driver.find_element_by_id("add-to-cart-button").click()
#time.sleep(2)
#driver.find_element_by_id("hlb-view-cart-announce").click()
#time.sleep(2)
#driver.close()  
print("successfully completed")  
