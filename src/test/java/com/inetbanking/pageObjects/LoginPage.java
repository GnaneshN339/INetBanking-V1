package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
	}
	
	//Identifiaction of elements
	
	@FindBy(name="uid")
	WebElement txtUName;
	
	@FindBy(name="password")
	WebElement txtPasswrd;
	
	@FindBy(name="btnLogin")
	WebElement clickButton;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement logoutButton;
	
	//Action
	
	public void setUName(String uName) {
		txtUName.sendKeys(uName);
	}
	 public void setPwd(String pwd) {
		 txtPasswrd.sendKeys(pwd);
	 }
	 public void clickLogin() {
		 clickButton.click(); 
	 }
	 public void clickLogout() {
		 logoutButton.click();
	 }

}
