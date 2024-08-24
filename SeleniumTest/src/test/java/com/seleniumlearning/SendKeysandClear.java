package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysandClear {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath("//input[@id='user-name']"));
		user.sendKeys("standard_user");
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("secret_sauce");
		Thread.sleep(2000);
		user.clear();
		pass.clear();

	}

}