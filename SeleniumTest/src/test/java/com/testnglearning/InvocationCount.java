package com.testnglearning;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 3)
	public void testOne()
	{
		System.out.println("Test One");
	}

}
