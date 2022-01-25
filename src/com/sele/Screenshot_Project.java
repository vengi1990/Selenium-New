package com.sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Project            {
	
	private Object utlis;

	public static void main(String[] args) throws  IOException, InterruptedException              {
		
	
	String url = "https://www.flipkart.com/";
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get(url);	
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9894156385");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("PARTHIban@77");

	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	Thread.sleep(5000);
	
	
	TakesScreenshot ts = (TakesScreenshot)driver; // casting   (narrow)
	File so = ts.getScreenshotAs(OutputType.FILE);
	File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\flipkartss1.png");
	FileUtils.copyFile(so, Dec);
	Thread.sleep(10000);
	
//	driver.close();
	
	
	
	
	}

}
