package com.experitest.auto;

import java.net.URL;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class AndroidDemoTest extends BaseTest {
	protected AndroidDriver<AndroidElement> driver = null;
	
	@BeforeMethod
	@Parameters("deviceQuery")
	public void setUp(@Optional("@os='android'") String deviceQuery) throws Exception{
		init(deviceQuery);
		// Init application / device capabilities
		//dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank/.LoginActivity");
		//dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
		//dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
		dc.setCapability("testName", "AndroidDemoTest");
		driver = new AndroidDriver<>(new URL(getProperty("url",cloudProperties) + "/wd/hub"), dc);
	}
	
	@Test
	public void test(){
		// Enter the test code
		dc.setCapability(MobileCapabilityType.APP, "cloud:hibernate.v2.testyourandroid/.MainActivity");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "hibernate.v2.testyourandroid");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".MainActivity");
		dc.setCapability("appVersion", "3.0");
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
