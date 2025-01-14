package com.seleniumlearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleFrameDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);

		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	Alert alert = driver.switchTo().alert();
	//	alert.accept();		
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		Thread.sleep(2000);
		String text = driver.findElement(By.id("tinymce")).getText();
		System.out.println("Text is " + text);
		driver.findElement(By.id("tinymce")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("tinymce")).sendKeys("The Testing Instinct");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		String text1 = driver.findElement(By.xpath("//h3")).getText();
		System.out.println("Text is:" + text1);

	}

}
