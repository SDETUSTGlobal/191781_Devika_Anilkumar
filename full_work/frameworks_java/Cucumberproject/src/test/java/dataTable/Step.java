package dataTable;     
import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver;  
import cucumber.annotation.en.Given;   
import cucumber.annotation.en.Then;   
import cucumber.annotation.en.When;  

 
public class Step {   
	 
	    WebDriver driver=null;
	  
   @Given("^ User is on Home Page$")   
   public void User_is_on_Home_Page() { 
	   System.setProperty("webdriver.chrome.driver", "C://Users//DELL//eclipse//jee-2021-09//eclipse//chromedriver_win32//chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");  
   }   
      
   @When("^user enters valid data on page$")   
   public void user_enters_valid_data_on_page(){   
      
      
      driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");  
      driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
      driver.findElement(By.className("button")).click();
          
       
      
   }   
      
   @Then("^user should see Web Orders$")   
   public void user_should_see_Web_Orders() {
if(driver.getCurrentUrl().equalsIgnoreCase("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx")) 
{
         System.out.println("Test Pass");   
      } 
   else {   
         System.out.println("Test Failed");   
      }   
      driver.close();   
   }   
}