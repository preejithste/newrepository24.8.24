package com.testngpractice;

import org.testng.annotations.Test;

public class FIrstTesngTestcase {

	@Test(priority=1)
	void openapp()
	{
		System.out.println("Opening the application");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("Login in to the application");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logout from the application");
	}
}
