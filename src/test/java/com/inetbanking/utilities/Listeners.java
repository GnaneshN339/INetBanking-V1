package com.inetbanking.utilities;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter{
	
	public void onTestStart(ITestResult tr) {
		System.out.println("Test is passed");
	}
	 public void onTestSuccess(ITestResult tr) {
		 System.out.println("Test is passed");
	 }
	 public void onTestFailure(ITestResult tr) {
		 System.out.println("Test is failed");
	 }
	 public void onTestSkipped(ITestResult tr) {
		 System.out.println("Test is skipped");
	 }

}
