package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.ecommerse.pages.Account;

public class LoginpageTest extends BaseTest {
	
	
	
	@Test
	public void verifyTitle()
	{
		String tirle=login.getTitle();
		Assert.assertEquals(tirle, "Account Login");
		
	}
	
	@Test
	public void verifydoLogin()
	{
		Account account=login.doLogin(prop.getProperty("userName"), prop.getProperty("password"));
		String accountTitle=account.getTitle();
		Assert.assertEquals(accountTitle, "My Account");
	}
	
	

}
