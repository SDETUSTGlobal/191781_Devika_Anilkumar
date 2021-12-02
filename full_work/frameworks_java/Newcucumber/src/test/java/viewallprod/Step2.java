package viewallprod;

import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver;  
import cucumber.annotation.en.Given;   
import cucumber.annotation.en.Then;   
import cucumber.annotation.en.When;  

 
public class Step2 {   
	 
	    WebDriver driver=null;
	  
   @Given("^ User is on product page$")   
   public void User_is_on_product_page() { 
	  
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");  
   }   
      
   @When("^clicks on view all products$")   
   public void clicks_on_view_all_products(){   
      
      
      
          
      driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/ul/li[2]/a")).click(); 
      
      
   }   
      
   @Then("^user should see list of all products$")   
   public void user_should_see_list_of_all_products() {
if(driver.getCurrentUrl().equalsIgnoreCase("Web Orders")) 
{
         System.out.println("Test Pass");   
      } 
   else {   
         System.out.println("Test Failed");   
      }   
      driver.close();   
   }   
}