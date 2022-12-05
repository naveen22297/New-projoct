package com.learn.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ParalletTest {
	@Test
	public void cricket() {
		BaseClass.browserOpen();
		BaseClass.launchUrl("https://www.google.co.in/");
		BaseClass.findElementname("q").sendKeys("cricket", Keys.ENTER);
		List<WebElement> crickets = BaseClass
				.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
		System.out.println(crickets.size());
		BaseClass.quit();

	}
	@Test
	public void vivo() {
		BaseClass.browserOpen();
		BaseClass.launchUrl("https://www.google.co.in/");
		BaseClass.findElementname("q").sendKeys("vivo", Keys.ENTER);
		List<WebElement> vivo = BaseClass
				.findElements(By.xpath("//*[contains(text(),'vivo')]"));
		System.out.println(vivo.size());
		BaseClass.quit();

	}
}
