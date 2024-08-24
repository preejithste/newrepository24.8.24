package com.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowserTesting {

	static WebDriver driver;

	public static void main(String[] args) {
		HeadLessBrowserTesting hbt = new HeadLessBrowserTesting();
		hbt.headlessChrome();
		driver.get("https://www.saucedemo.com/");
		// String titleValue=driver.getTitle();
		System.out.println("Title is" + driver.getTitle());
		//String urlValue = driver.getCurrentUrl();
		System.out.println("URL Value is" + driver.getCurrentUrl());

	}

	public void headlessChrome() {
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.setHeadless(true);
		
		chromeOptions.addArguments("--headless=new");
		//chromeOptions.addArguments("--headless=chrome");
		//chromeOptions.addArguments("--headless");
		
		driver = new ChromeDriver(chromeOptions);

	}

}
