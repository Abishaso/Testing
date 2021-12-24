package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(WithoutKnown.class)
public class ReRun {

	@Test
	private void test() {
	System.out.println("test 1");
	}
	
	@Test
	private void test2() {
	Assert.assertTrue(false);
	System.out.println("test 2");
	}
	
	
	
	
	
}
