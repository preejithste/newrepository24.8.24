package com.seleniumlearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		Thread.sleep(3000);
		promptAlert.sendKeys("Hello");
		promptAlert.accept();
		// confirmAlert.accept();
		// confirmAlert.dismiss();
        
		
	}

}
