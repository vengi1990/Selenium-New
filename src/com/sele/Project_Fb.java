package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Fb {
	
	public static void main(String[] args) throws InterruptedException { 
		
			String url = "https://twitter.com/login?lang=en";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get(url);
	
	WebElement email = driver.findElement(By.id("email"));
	
	email.sendKeys("parthibangt@hotmail.com");
	
	//Thread.sleep(8000);
	
	driver.findElement(By.name("pass")).sendKeys("parthi@1225");
	
	WebElement btn1 =driver.findElement(By.name("login"));
	
	btn1.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
