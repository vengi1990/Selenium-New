package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fram {
    public static void main(String[] args) {
	
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://demo.automationtesting.in/Frames.html");	
	
	WebElement frame = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
	driver.switchTo().frame(frame);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hai");
	driver.switchTo().defaultContent();
     WebElement secondTab = driver.findElement(By.xpath("(//a[@class='analystic'])[2])"));
	secondTab.click();
	
	
}
    }
}