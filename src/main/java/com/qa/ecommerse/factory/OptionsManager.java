package com.qa.ecommerse.factory;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsManager {
	
	private Properties prop;
	private ChromeOptions co;
	public OptionsManager(Properties prop) {
		this.prop = prop;
	}
	
	public ChromeOptions getCromeOption()
	{
		co=new ChromeOptions();
		if (Boolean.parseBoolean(prop.getProperty("headless")))
		{
			co.addArguments("---headless");
		}
		if (Boolean.parseBoolean(prop.getProperty("incongnito")))
		{
			co.addArguments("---incongnito");
		}
		return co;
	}
	
	

}
