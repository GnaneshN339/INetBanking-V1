package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddNewCustomer;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddNewcustomer_003 extends BaseClassForProject {
	
	@Test
	public void AddNewCust() throws IOException, InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.setUName(uName);
		lp.setPwd(pword);
		lp.clickLogin();
		Thread.sleep(3000);

		AddNewCustomer anc = new AddNewCustomer(driver);
		driver.manage().window().maximize();
		anc.clickCust();
		anc.addCName("Pushpa");
		anc.clickFemale();
		anc.enterDob("11", "05", "2005");
		Thread.sleep(5000);
		anc.addAddress("Banjara Hills");
		anc.addcity("Hyderabad");
		anc.addstate("Telangana");
		anc.addpin("517266");
		anc.addphoneno("9595352515");
		String data = randomString()+"@gmail.com";
		anc.addEmailId(data);
		anc.addpwd("ancdef");
		anc.clickSubmit();
		if(driver.getTitle().equals("Guru99 Bank New Customer Entry Page")){
			Assert.assertTrue(true);
		}
		else {
			captureshot(driver, "Addnewcust");
			Assert.assertTrue(false);
		}
	}
	

}
