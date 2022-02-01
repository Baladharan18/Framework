package org.fb;

import org.testng.annotations.Test;

public class ParallelExecutionA {
	@Test
	private void tc4() {
     Thread t = Thread.currentThread();
     long l = t.getId();
     System.out.println("Test4:"+l);	
     }
	@Test
	private void tc5() {
		System.out.println("Test5:"+Thread.currentThread().getId());
	}
	@Test
	private void tc6() {
		System.out.println("Test6:"+Thread.currentThread().getId());
		}

}
