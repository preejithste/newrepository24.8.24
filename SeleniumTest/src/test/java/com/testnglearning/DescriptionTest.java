package com.testnglearning;

import org.testng.annotations.Test;

public class DescriptionTest {
	

	@Test(description = "This method prints test one")
	public void testOne() {
		System.out.println("testone");
		
	}
	
	@Test(description = "This method prints test two")
	public void testTwo() {
		System.out.println("test two");

	
	}


}
