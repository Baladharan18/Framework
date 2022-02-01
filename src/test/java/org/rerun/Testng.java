package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng {
	
	@Test
	private void tc1() {
		System.out.println("Test1");
	}
	@Test
	private void tc3() {
		Assert.assertTrue(false, "Check tc3");
      System.out.println("Test3");
	}
	@Test
	private void tc2() {
     System.out.println(30/0);
     System.out.println("Test2");
	}
//	@Test(retryAnalyzer =ToRerunFailedTc.class)
//	private void tc1() {
//		System.out.println("Test1");
//	}
//	@Test
//	private void tc3() {
//		Assert.assertTrue(false, "Check tc3");
//      System.out.println("Test3");
//	}
//	@Test(retryAnalyzer = ToRerunFailedTc.class)
//	private void tc2() {
//     System.out.println(30/0);
//     System.out.println("Test2");
//	}

}
