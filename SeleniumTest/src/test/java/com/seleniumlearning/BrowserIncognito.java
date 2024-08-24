package com.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserIncognito {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserIncognito hbt = new BrowserIncognito();
		hbt.incognitoChrome();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Title is" + driver.getTitle());
		System.out.println("URL Value is" + driver.getCurrentUrl());
		
		hbt.incognitoFirefox();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Title is" + driver.getTitle());
		System.out.println("URL Value is" + driver.getCurrentUrl());

		hbt.incognitoEdge();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Title is" + driver.getTitle());
		System.out.println("URL Value is" + driver.getCurrentUrl());
	}

	public void incognitoChrome() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--incognito");
		driver = new ChromeDriver(chromeOptions);

	}

	public void incognitoFirefox() {
		FirefoxOptions fireOptions = new FirefoxOptions();
		fireOptions.addArguments(".private");
		driver = new FirefoxDriver(fireOptions);

	}

	public void incognitoEdge() {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("InPrivate");
		driver = new EdgeDriver(edgeOptions);

	}
}
