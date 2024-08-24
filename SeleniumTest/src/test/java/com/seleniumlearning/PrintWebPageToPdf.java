package com.seleniumlearning;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;

import com.google.common.io.Files;

public class PrintWebPageToPdf {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		Pdf pdf= driver.print(new PrintOptions());
		Path printPage = Paths.get("./Screenshots/chrome1.pdf");
		
	//	Files.write(printPage,OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
		

	}

}
