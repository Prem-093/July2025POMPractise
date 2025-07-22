package com.qa.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.ecommerse.dataprovider.ProductDataProvider;


public class EditPageTest extends BaseTest {
	
	@BeforeClass
	
	public void doAccSetup() {
		account = login.doLogin(prop.getProperty("userName"), prop.getProperty("password"));
	}
	
	/*
	 * @DataProvider(name="editDetails")
	 * 
	 * public Object [][] editdetailsData() {
	 * 
	 * return new Object [][] { {"kartik",
	 * "tripathi","edit12f@gmail.com","9878098756"} };
	 * 
	 * }
	 */
	
	@Test(dataProvider="editDetails", dataProviderClass=ProductDataProvider.class)
	public void verifyEditDetails(String firstName , String lastName , String email, String telephone  )
	{
		edit=account.clickEditLink();
		edit.editDetails(firstName, lastName, email, telephone);
	}
	
	

}
