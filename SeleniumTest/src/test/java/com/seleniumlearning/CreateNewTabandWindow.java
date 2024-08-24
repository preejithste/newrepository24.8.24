package com.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewTabandWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.saucedemo.com/");
		System.out.println("Title is "+ driver.getTitle());
		Thread.sleep(4000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://youtube.com");
		System.out.println("Title is "+ driver.getTitle());
		

	}

}
