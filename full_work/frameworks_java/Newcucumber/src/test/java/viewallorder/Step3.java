package viewallorder;

import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver;  
import cucumber.annotation.en.Given;   
import cucumber.annotation.en.Then;   
import cucumber.annotation.en.When;  

 
public class Step3 {   
	 
	    WebDriver driver=null;
	  
   @Given("^Ordered product details$")   
   public void Ordered_product_details() { 
	  
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");  
   }   
      
   @When("^user clicks on view all orders$")   
   public void user_clicks_on_view_all_orders(){   
      
      
	   
          
      driver.findElement(By.linkText("View all orders")).click(); 
      
      
   }   
      
   @Then("^should display all ordered products details$")   
   public void should_display_all_ordered_products_details() {
if(driver.getCurrentUrl().equalsIgnoreCase("Web Orders")) 
{
         System.out.println("Test Pass");   
      } 
   else {   
         System.out.println("Test Failed");   
      }   
      driver.close();   
   }   
   
   @Given("^All orders to checks$")   
   public void All_orders_to_checks () { 
	  
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");  
   }   
      
   @When("^user clicks on check all$")   
   public void user_clicks_on_check_all(){   
      
      
	   
          
      driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click(); 
      
      
   }   
      
   @Then("^should select all  ordered products$")   
   public void should_select_all_ordered_products() {
if(driver.getCurrentUrl().equalsIgnoreCase("Web Orders")) 
{
         System.out.println("Test Pass");   
      } 
   else {   
         System.out.println("Test Failed");   
      }   
      driver.close();   
   }   
   @Given("^All orders to uncheck$")   
   public void All_orders_to_uncheck () { 
	  
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");  
   }   
      
   @When("^user clicks on uncheck all$")   
   public void user_clicks_on_uncheck_all(){   
      
      
	   
          
      driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click(); 
      
      
   }   
      
   @Then("^should uncheck all selected  ordered products$")   
   public void should_uncheck_all_ordered_products() {
if(driver.getCurrentUrl().equalsIgnoreCase("Web Orders")) 
{
         System.out.println("Test Pass");   
      } 
   else {   
         System.out.println("Test Failed");   
      }   
      driver.close();   
   }   
   
   @Given("^ All orders to delete$")   
   public void All_orders_to_delete () { 
	  
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");  
   }   
      
   @When("^ user clicks on selected products$")   
   public void user_clicks_on_selected_products(){   
      
      
	   
          
      driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector")).click();
      driver.findElement(By.name("ctl00$MainContent$btnDelete")).click();
      
    
   }   
      
   @Then("^should delete selected  ordered products")   
   public void should_delete_ordered_products() {
if(driver.getCurrentUrl().equalsIgnoreCase("Web Orders")) 
{
         System.out.println("Test Pass");   
      } 
   else {   
         System.out.println("Test Failed");   
      }   
      driver.close();   
   }   
   
   @Given("^Ordered product details to edit$")   
   public void Ordered_product_details_to_edit () { 
	  
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");  
   }   
      
   @When("^user clicks on edit button$")   
   public void user_clicks_on_edit_button(){   
      
      
	   
          
      
      driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td[13]/input")).click();
      
    
   }   
      
   @Then("^should navigate to edit order page$")   
   public void should_navigate_to_edit_order_page() {
if(driver.getCurrentUrl().equalsIgnoreCase("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx")) 
{
         System.out.println("Test Pass");   
      } 
   else {   
         System.out.println("Test Failed");   
      }   
      driver.close();   
   }   
}