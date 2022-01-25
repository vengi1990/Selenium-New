package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Pro {
	
	public static void main(String[] args) throws InterruptedException  {
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
		
	
	WebElement login = driver. findElement (By.xpath("//input[@type='text']"));
	
     login.sendKeys("9894156385");
	
     Thread.sleep(5000);
   
    WebElement password = driver.findElement(By.xpath("(//input[@type='password'])"));
   
    password.sendKeys("hai@12");
     
	
	
	}

}
