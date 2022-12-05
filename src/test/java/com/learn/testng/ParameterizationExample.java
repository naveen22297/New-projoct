package com.learn.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
/* We may have to send data to our test cases via our testNG.xml.file
 * in order to  send the test data or other data to our test cases,
 * Testng provides an option called PARAMETERIZATION 
 */
	@Test
	@Parameters("Name")
	public void printName(String name) {
		System.out.println("name is "+name);
	}
}
