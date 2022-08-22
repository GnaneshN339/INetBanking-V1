package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	
	WebDriver ldriver;
	
	public AddNewCustomer(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a") 
	WebElement newCust;
	
	@FindBy(name="name")
	WebElement cname;
	
	@FindBy(name="rad1")
	WebElement radbtn;
	
	@FindBy(name="dob")
	WebElement dob;
	
	@FindBy(name="addr")
	WebElement addr;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="pinno")
	WebElement pinno;
	
	@FindBy(name="telephoneno")
	WebElement telephoneno;
	
	@FindBy(name="emailid")
	WebElement emailid;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="sub")
	WebElement sub;
	
	public void clickCust() {
		newCust.click();
	}
	public void addCName(String cName) {
		cname.sendKeys(cName);
	}
	
	public void clickFemale() {
		radbtn.click();
	}
	
	public void enterDob(String dd,String mm, String yyyy) {
		dob.sendKeys(dd);
		dob.sendKeys(mm);
		dob.sendKeys(yyyy);
	}
	public void addAddress(String address) {
		addr.sendKeys(address);
	}
	
	public void addcity(String ecity) {
		city.sendKeys(ecity);
	}
	
	public void addstate(String estate) {
		state.sendKeys(estate);
	}
	public void addpin(String pin) {
		pinno.sendKeys(pin);
	}
	public void addphoneno(String phoneno) {
		telephoneno.sendKeys(phoneno);
	}
	public void addEmailId(String emailId) {
		emailid.sendKeys(emailId);
	}
	public void addpwd(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickSubmit() {
		sub.click();;
	}
	
}
