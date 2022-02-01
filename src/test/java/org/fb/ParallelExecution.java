package org.fb;

import org.testng.annotations.Test;

public class ParallelExecution {
	@Test(groups="@smoke")
	private void tc1() {
     Thread t = Thread.currentThread();
     long l = t.getId();
     System.out.println("Test1:"+l);	
     }
	@Test
	private void tc2() {
		System.out.println("Test2:"+Thread.currentThread().getId());
	}
	@Test(groups="@smoke")
	private void tc3() {
		System.out.println("Test3:"+Thread.currentThread().getId());
		}
	}
