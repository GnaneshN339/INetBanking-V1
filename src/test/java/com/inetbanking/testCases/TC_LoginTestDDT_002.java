package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;

public class TC_LoginTestDDT_002 extends BaseClassForProject {
	
	@Test(dataProvider="LoginData")
	public void getData(String user, String pwd) throws InterruptedException{
		
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.setUName(user);
		lp.setPwd(pwd);
		lp.clickLogin();
		Thread.sleep(3000);
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertTrue(true);
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
		
	}
	
	public boolean isAlertPresent() {
		try{
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e) {
			return false;
		}
		
	}
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException{
		
		String path = System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/Testdata.xlsx";
		int rowcount = XLUtils.getRowCount(path, "Sheet1");
		int cellcount = XLUtils.getCellCount(path, "Sheet1", 1);
		String logdata[][] = new String[rowcount][cellcount];
		for (int i=1; i<=rowcount; i++) {
			for (int j=0; j<cellcount; i++) {
				logdata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logdata;
		
	}
	

}
