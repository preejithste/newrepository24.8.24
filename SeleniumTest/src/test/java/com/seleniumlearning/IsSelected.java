package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.manage().window().maximize();
		boolean val = driver.findElement(By.xpath("//label[normalize-space()='Bar']")).isSelected();
		System.out.println(val);

	}

}
