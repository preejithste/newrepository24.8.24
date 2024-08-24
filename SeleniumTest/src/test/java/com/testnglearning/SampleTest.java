package com.testnglearning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is before test");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is before method");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is after test");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is after method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("this is test one");
	}
	@Test
	public void test2()
	{
		System.out.println("this is test two");
	}

}
