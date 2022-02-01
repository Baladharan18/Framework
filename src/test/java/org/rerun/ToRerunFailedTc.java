package org.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ToRerunFailedTc implements IRetryAnalyzer{
	
	int min=0,max=3;

	public boolean retry(ITestResult arg0) {
		if (min<max) {
			min++;
			return true;
			
		}
		return false;
	}
	

}
