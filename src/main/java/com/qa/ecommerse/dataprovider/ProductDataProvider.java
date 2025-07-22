package com.qa.ecommerse.dataprovider;

import org.testng.annotations.DataProvider;

public class ProductDataProvider {

	
	@DataProvider(name="editDetails")
	public Object[][] editAccountPage()
	{
		
		return new Object[][] {
			
			{"tripathi","Pransi","pr@gmail.com","6787907656"},
			{"tripathi123","Pransi123","p12r@gmail.com","6787907656"}
			
		};
	}
}
