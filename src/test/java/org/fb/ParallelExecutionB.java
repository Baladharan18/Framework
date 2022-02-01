package org.fb;

import org.testng.annotations.Test;

public class ParallelExecutionB {
	@Test
	private void tc7() {
		System.out.println("Test7:"+Thread.currentThread().getId());
	}
	@Test
	private void tc8() {
		System.out.println("Test8:"+Thread.currentThread().getId());
		}
	

}
