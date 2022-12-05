package com.learn.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InvocationCountEx {
	 @Test(invocationCount = 3,invocationTimeOut=30000)
	public void cricket() {
		BaseClass.browserOpen();
		BaseClass.launchUrl("https://www.google.co.in/");
		BaseClass.findElementname("q").sendKeys("cricket", Keys.ENTER);
		List<WebElement> crickets = BaseClass
				.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
		System.out.println(crickets.size());
		BaseClass.quit();

	}
	
}
