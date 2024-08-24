package com.seleniumlearning;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeBrowserScreenSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		Thread.sleep(3000);
		//driver.manage().window().minimize();
		//Dimension dimension= new Dimension(800,600);
		driver.manage().window().setSize(new Dimension(800,600));
		
		
		
	}

}
