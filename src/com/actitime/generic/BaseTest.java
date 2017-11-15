package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConstant
{
	
public static WebDriver driver=null;

@BeforeMethod
public void preconditions()
{
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com");
	
}

@AfterMethod
 public void postConditions()
	{
		driver.close();
		
	}
}

