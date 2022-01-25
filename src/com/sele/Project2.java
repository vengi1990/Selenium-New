package com.sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project2 {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String url = "https://www.w3schools.com/java/java_for_loop.asp";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
	
	JavascriptExecutor proj =(JavascriptExecutor) driver;
	
	proj.executeScript("window.scroll(0,1000)", "");
	
   TakesScreenshot ts = (TakesScreenshot)driver;
	
	File so = ts.getScreenshotAs(OutputType.FILE);
	
	File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\project2.png");
	
	FileUtils.copyFile(so, Dec);
	
	
	Thread.sleep(6000);
	
	
	proj.executeScript("window.scroll(0,-1000)", "");
	
    TakesScreenshot ts1 = (TakesScreenshot)driver;
	
	File so1 = ts1.getScreenshotAs(OutputType.FILE);
	
	File Dec1 = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\project2-1.png");
	
	FileUtils.copyFile(so1, Dec1);
	
	 Thread.sleep(6000);
	 
	driver.close();
	}
}
