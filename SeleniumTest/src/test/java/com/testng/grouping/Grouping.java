package com.testng.grouping;

import org.testng.annotations.Test;

@Test(groups={"Alltests"})
public class Grouping {

	@Test(groups={"smoke","regreesion"})
	public void test1() {
		System.out.println("Test 1");
	}

	@Test(groups={"sanity"})
	public void test2() {
		System.out.println("Test 2");
	}

	@Test(groups={"smoke","sanity"})
	public void test3() {
		System.out.println("Test 3");
	}

	@Test(groups={"smoke"})
	public void test4() {
		System.out.println("Test 4");
	}

	@Test(groups={"regression"})
	public void test5() {
		System.out.println("Test 5");
	}

	@Test
	public void test6() {
		System.out.println("Test 6");
	}

}
