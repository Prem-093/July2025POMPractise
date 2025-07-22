package com.qa.ecommerse.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class EditPage {

	private WebDriver driver;
	
	private By first_loc=By.name("firstname");
	private By last_loc=By.name("lastname");
	private By emailloc=By.name("email");
	private By telephone_loc=By.name("telephone");

	public EditPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public String verifyTitleEdit()
	{
		return driver.getTitle();
		
	}
	
	
	
	
	public void editDetails(String firstName , String lastName , String email, String telephone  )
	{
		WebElement firtsname=driver.findElement(first_loc);
		firtsname.clear();
		firtsname.sendKeys(firstName);
		WebElement lastname=driver.findElement(last_loc);
		lastname.clear();
		lastname.sendKeys(lastName);
		WebElement emailfield=driver.findElement(emailloc);
		emailfield.clear();
		emailfield.sendKeys(email);
		WebElement telephone1=driver.findElement(telephone_loc);
		telephone1.clear();
		telephone1.sendKeys(email);
		
	}
	
}
