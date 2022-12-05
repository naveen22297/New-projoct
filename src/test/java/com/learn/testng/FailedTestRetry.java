package com.learn.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTestRetry implements IRetryAnalyzer {

	int retrycount =0;
	int maxretrycount=5;
	public boolean retry(ITestResult result) {
		if(retrycount<=maxretrycount) {
			retrycount++;
			return true;
		}
		return false;
	}

}
