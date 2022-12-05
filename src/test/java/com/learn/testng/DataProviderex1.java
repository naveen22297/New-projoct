package com.learn.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderex1 {
	@Test(dataProvider="testdata")
	public void data(String username , String password) {
		System.out.println(username);
		System.out.println(password);
		
	}
	
	// data provider
	@DataProvider(name="testdata")
	public Object [][] getData() {
		return new Object [][] {{"Naveen","12345"},{"Naveen2","12345"},{"Naveen3","12345"},{"Naveen4","12345"}};
	}
}
