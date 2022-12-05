package com.learn.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {
	@Parameters({"emailId","password"})
@Test
public void Login(String email,String pass) {
	BaseClass.browserOpen();
	BaseClass.launchUrl("https://www.flipkart.com/");
	BaseClass.findElementclassname("_1_3w1N").click();
	BaseClass.findElementXpath("//*[text()='Enter Email/Mobile number']").sendKeys(email);
	BaseClass.findElementXpath("//input[@type='password']").sendKeys(pass);
	BaseClass.findElementXpath("(//button[@type=\"submit\"])[2]").click();
	BaseClass.getTitle();
	
}
}
