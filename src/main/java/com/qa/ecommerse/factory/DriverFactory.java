package com.qa.ecommerse.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	WebDriver driver;
	OptionsManager om;

	public WebDriver initDriver(Properties prop) {

		String browser = prop.getProperty("Browser");

		om = new OptionsManager(prop);

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(om.getCromeOption());
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		else {
			System.out.println("Please pass correct Browser :" + browser);
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		return driver;
	}

	public Properties initProp() {
		Properties prop = new Properties();

		try {
			FileInputStream ip = new FileInputStream("./src/main/resources/Configuration/Config.Properties");

			prop.load(ip);

		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop;
	}

}
