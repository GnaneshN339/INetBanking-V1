package com.inetbanking.testCases;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BaseClassForProject {
	
	ReadConfig rc = new ReadConfig();
	public String url = rc.getUrl();
	public String uName= rc.getUsername();
	public String pword = rc.getpassword();
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws InterruptedException {
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", rc.getChromePath());
		driver = new ChromeDriver();
	    }
		
		else if(br.equals("ie")){
			System.setProperty("webdriver.ie.driver", rc.getIEPath());
			driver = new InternetExplorerDriver();
		}
		else if(br.equals("edge")){
			System.setProperty("webdriver.edge.driver", rc.getedgePath());
			driver = new EdgeDriver();
		}
		driver.get(url);
		Thread.sleep(3000);
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	 
	public void captureshot(WebDriver driver, String tname) throws IOException {
		String sp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repname = sp+"  "+ tname;
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	//	File target = new File(".\\Screenshots\\repname.png");
	//	OR
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+ repname+ ".png");
		FileUtils.copyFile(src, target);
	}
	
	public static String randomString() {
		String alphabeticString = RandomStringUtils.randomAlphabetic(8);
		return alphabeticString;
	}
	
	public static String randomNumString() {
		String numString = RandomStringUtils.randomNumeric(5);
		return numString;
	}

}
