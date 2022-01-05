package org.flipkart;

import java.util.List;

import org.fb.FbLogin;

//Method 1 @Run With
//import org.junit.runner.RunWith;
//import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;
//
//@RunWith(Suite.class)
//@SuiteClasses({FbLogin.class,FlipkartLogin.class})
//
//public class Runner {
//}

// Method 2 @JUnitCore.runClasses
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {
	@Test
	public void executeAll() {
		Result rs = JUnitCore.runClasses(FlipkartLogin.class,FbLogin.class);
        
		System.out.println("Run Count:"+rs.getRunCount());
		System.out.println("Failure Count:"+rs.getFailureCount());
		System.out.println("Ignore Count:"+rs.getIgnoreCount());
		System.out.println("Run Time:"+rs.getRunTime());
		List<Failure> failures = rs.getFailures();
		for (Failure x : failures) {
			System.out.println(x);
			
		}
		
	}

}