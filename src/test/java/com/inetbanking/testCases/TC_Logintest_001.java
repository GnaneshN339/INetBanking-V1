package com.inetbanking.testCases;


import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_Logintest_001 extends BaseClassForProject {
	
	@Test
	public void loginTest() throws IOException  {
		
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		//in order to call methods in login test we need to create an object with name of that class
		//and also login test is in different package we need to import that package 
		//Since constructor is in different package change visibility of constructor to public
		lp.setUName(uName);
		lp.setPwd(pword);
		lp.clickLogin();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);  
		}
			else {
			captureshot(driver, "shot"); 
			//here we can use testcase name for better understanding
			Assert.assertTrue(false);
			}
		
		
	}
	

}
