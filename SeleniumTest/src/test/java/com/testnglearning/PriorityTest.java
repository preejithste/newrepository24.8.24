package com.testnglearning;

import org.testng.annotations.Test;

public class PriorityTest {

	
	
	@Test(priority = 1)
	public void testOne() {
		System.out.println("testone");
		
	}
	
	@Test(priority = 0)
	public void testTwo() {
		System.out.println("test two");

	
	}

}
