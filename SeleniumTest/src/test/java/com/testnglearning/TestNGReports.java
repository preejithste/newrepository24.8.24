package com.testnglearning;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGReports {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins-*");
		driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
				
	}
	@Test
	public void titleTest() {
		String actualTitle=driver.getTitle();
		String expectedTitle="Swagg Labs";
		assertEquals(actualTitle,expectedTitle,"Title does not match");		
	}
	
	@Test
	public void loginButtonDisplayTest() {
	assertEquals(driver.findElement(By.id("login-button")).isDisplayed(), true,"Button not displayed");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	

}
