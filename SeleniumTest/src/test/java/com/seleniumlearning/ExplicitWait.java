package com.seleniumlearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Disable']")).click();
		
		WebElement textmessage=new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
			String message=textmessage.getText();	
		
		//String val = driver.findElement(By.xpath("//p[@id='message']")).getText();
		
		
		System.out.println("Text Value is" + message);

	}

}
