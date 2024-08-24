package com.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTileandUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		//String titleValue=driver.getTitle();
		System.out.println("Title is"+ driver.getTitle());
		String urlValue=driver.getCurrentUrl();
		System.out.println("URL Value is" + urlValue);
		driver.close();
		
	}

}
