package com.learn.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("b4 method");
	}

	@Test
	public void test() {
		System.out.println("test");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("AFTERMETHOD");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AFTER CLASS");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
}
