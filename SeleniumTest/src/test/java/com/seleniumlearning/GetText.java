package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("//div[@class='login_logo']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		System.out.println("The error message is" + driver
				.findElement(By.xpath("//h3[normalize-space()='Epic sadface: Username is required']")).getText());

	}

}
