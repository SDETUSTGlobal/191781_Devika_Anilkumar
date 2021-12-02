package Testng;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;	

public class ExcelExample{
@Test(dataProvider="testdata")
public void demoClass(String username, String password) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C://Users//DELL//eclipse//jee-2021-09//eclipse//chromedriver_win32//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
driver.findElement(By.className("button")).click();
Thread.sleep(5000);
Assert.assertTrue(driver.getTitle().matches("Web Orders"), "valid credentials");
System.out.println("Login successful");
}

/*@AfterMethod
void ProgramTermination() {
	driver.quit();
} */

@DataProvider(name="testdata")
public Object[][] testDataExample(){
ReadExcelFile configuration = new ReadExcelFile("C://Users//DELL//eclipse//jee-2021-09//eclipse//Username.xlsx");
int rows = configuration.getRowCount(0);
Object[][]signin_credentials = new Object[rows][2];

for(int i=0;i<rows;i++)
{
signin_credentials[i][0] = configuration.getData(0, i, 0);
signin_credentials[i][1] = configuration.getData(0, i, 1);
}
return signin_credentials;
}
}