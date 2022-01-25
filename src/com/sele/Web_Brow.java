package com.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Brow {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	 driver.manage().window().maximize();
	 
	String cl = driver.getCurrentUrl();
	
	System.out.println(cl);
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	//driver.close();
	
	}
	
}