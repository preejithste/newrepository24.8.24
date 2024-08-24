package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSingleSelectDropdownUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("2");
		Thread.sleep(3000);
		select.selectByVisibleText("Yellow");
		Thread.sleep(3000);

	}

}
