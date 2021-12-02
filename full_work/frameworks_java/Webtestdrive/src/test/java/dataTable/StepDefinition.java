package dataTable;   
import java.util.List;  
import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver;  
import cucumber.annotation.en.Given;   
import cucumber.annotation.en.Then;   
import cucumber.annotation.en.When;   
import cucumber.table.DataTable;  
public class StepDefinition {   
	 
	    WebDriver driver=null;
	  
   @Given("^the user is on the user registration page$")   
   public void the_user_on_the_user_registration_page() { 
	   
	   driver = new ChromeDriver();
	  
      driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");   
   }   
      
   @When("^user enters valid data on page$")   
   public void user_enters_valid_data_on_the_page(DataTable table){   
         
	   List<List<String>> data = table.raw(); 
      System.out.println(data.get(1).get(1));   
        
      //Enter data  
      driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(data.get(1).get(1));  
      driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(data.get(2).get(1));
      driver.findElement(By.className("button")).click();
          
       
         
   }   
      
   @Then("^the user registration should be successful$")   
   public void the_user_registration_should_be_successful() {
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