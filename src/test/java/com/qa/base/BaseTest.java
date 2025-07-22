package com.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.qa.ecommerse.factory.DriverFactory;
import com.qa.ecommerse.pages.Account;
import com.qa.ecommerse.pages.EditPage;
import com.qa.ecommerse.pages.LoginPage;

public class BaseTest {
	
	WebDriver driver;
	DriverFactory df;
	protected Properties prop;
	protected LoginPage login;
	protected Account account;
	protected EditPage edit;
	
	@BeforeTest
	@Parameters({"browser"})
	public void setup(String browserName)
	{
		
		df=new DriverFactory();
		
		
		prop=df.initProp();
		
		if (browserName!=null)
		{
			prop.setProperty("Browser", browserName);
		}
		driver=df.initDriver(prop);
		login=new LoginPage(driver);
		
	}
	
    @AfterTest
    public void tearDown()
    {
    	driver.close();
    }
}
