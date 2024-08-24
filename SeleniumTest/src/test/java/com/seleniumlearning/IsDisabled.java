package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisabled {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		boolean val = driver.findElement(By.xpath("//*[@id='isDisabled']")).isEnabled();
		System.out.println(val);

	}

}
