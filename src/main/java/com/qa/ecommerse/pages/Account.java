package com.qa.ecommerse.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Account {
	
	private WebDriver driver;
	
	private By editLOC=By.xpath("//a[text()='Edit Account']");

	public Account(WebDriver driver) {
		
		this.driver = driver;
	}
	
    public String getTitle()
    {
    	return driver.getTitle();
    }
    
    public EditPage clickEditLink()
    {
    	driver.findElement(editLOC).click();
    	return new EditPage(driver);
    }
}
