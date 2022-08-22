package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClassDemo {
	
	public String url = "https://demo.guru99.com/v4/";
	public String uName= "mngr430550";
	public String pword = "ErYtEsE";
	public String title = "Guru99 Bank Manager HomePage";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
