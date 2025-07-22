package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;

public class AccountTest extends BaseTest {

	@BeforeClass

	public void doAccSetup() {
		account = login.doLogin(prop.getProperty("userName"), prop.getProperty("password"));
	}

	@Test
	public void verifyEditLinkTitle() {
		edit = account.clickEditLink();
		String editTitle = edit.verifyTitleEdit();
		Assert.assertEquals(editTitle, "Ny Account Information");

	}

}
