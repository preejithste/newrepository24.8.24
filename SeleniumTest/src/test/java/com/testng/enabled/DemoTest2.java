package com.testng.enabled;

import org.testng.annotations.Test;

public class DemoTest2 {

	// Assume this class has logout related TC's

	@Test(enabled = true)
	public void test5() {
		System.out.println("Test 5");
	}

	@Test
	public void test6() {
		System.out.println("Test 6");
	}

	@Test
	public void test7() {
		System.out.println("Test 7");
	}

	@Test

	public void test8() {
		System.out.println("Test 8");
	}

}