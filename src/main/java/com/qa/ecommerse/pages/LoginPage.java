package com.qa.ecommerse.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	public LoginPage(WebDriver driver) {
	
		this.driver = driver;
	}

	Account account;
	private By firstName = By.name("email");
	private By password = By.name("password");
	private By login = By.xpath("//input[@value='Login']");

	public String getTitle() {
		return driver.getTitle();
	}

	public String geturl() {
		return driver.getCurrentUrl();

	}

	public Account doLogin(String userName, String Password) {
		driver.findElement(firstName).sendKeys(userName);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(login).click();

		return new Account(driver);

	}
}
