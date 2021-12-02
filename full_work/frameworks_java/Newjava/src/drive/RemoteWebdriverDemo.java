package drive;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebdriverDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		String baseUrl = "https://www.google.com";
		String expectedTitle = "Google";
		String actualTitle = null;
		WebDriver driver = null;
		
		
		//how the script should be executed => what OS, what browser etc
		//where is my server
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.WIN10);
		capabilities.setBrowserName("chrome");
		
		URL url = new URL("http://192.168.1.3:4444/wd/hub");
		
		driver = new RemoteWebDriver(url, capabilities);
driver.manage().window().maximize();		
		driver.get(baseUrl);
					
		actualTitle = driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test case passed!");
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(1500);
			driver.quit();
		} else {
			System.out.println("Test case failed!");
			driver.quit();
		}

	}

}