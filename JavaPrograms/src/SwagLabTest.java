package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabTest {

	@Test
	public void loginButtonTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.findElement(By.id("login-button")).isDisplayed(), true);
		driver.close();
	}

	@Test
	public void loginInvalidTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-button")).click();
		Assert.assertEquals(
				driver.findElement(By.xpath("//h3[normalize-space()='Epic sadface: Username is required']")).getText(),
				"Epic sadface: Username is required");
		driver.close();
	}

	@Test
	public void swagLabHeadingTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String heading = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
		Assert.assertEquals(heading, "Swag Labs");
		driver.close();
	}

	@Test
	public void productsHeadingTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String heading = driver.findElement(By.xpath("//span[@class='title']")).getText();
		Assert.assertEquals(heading, "Products");
		driver.close();
	}
}
