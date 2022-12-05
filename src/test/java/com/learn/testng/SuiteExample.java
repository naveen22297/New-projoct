package com.learn.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class SuiteExample {
	//Aim : Open chrome and go on ,
	//1.google.co.in  2.bing.com and 3.yahoo.com and the close the browser 
@BeforeSuite            // // It will run only once, before all tests in the suite are executed.
	public void launchBrowser() {
	BaseClass.browserOpen();
}
	@Test
public void openGoogle() {
	long Starttime =System.currentTimeMillis();
//	BaseClass.browserOpen();
	BaseClass.launchUrl("https://www.google.co.in/");
	//BaseClass.quit();
	long endtime =System.currentTimeMillis();
	long totaltime = endtime-Starttime;
	System.out.println("totaltime = "+totaltime);
}
@Test
public void openBing() {
	// BaseClass.browserOpen();
	BaseClass.launchUrl("https://www.bing.com/");
	//BaseClass.quit();
}
@Test
public void openYahoo() {
//	BaseClass.browserOpen();
	BaseClass.launchUrl("https://www.yahoo.com/");
	//BaseClass.quit();
}
@AfterSuite
public void closeBrowser() {
	BaseClass.quit();
}
}
