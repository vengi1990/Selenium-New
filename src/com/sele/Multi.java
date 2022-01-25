package com.sele;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get ("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	driver.manage().window().maximize();
	
	WebElement Drop = driver.findElement(By.id("multi-select"));
		
	Select s = new Select(Drop);
	
	boolean mul = s.isMultiple();
	
	System.out.println(mul);

	
		//s.selectByVisibleText("Texas");
		
		System.out.println("-----------------------------------");
		
		List<WebElement> all = s.getOptions();
		
		for (WebElement print : all)
		
		{
		System.out.println(print.getText());	
		} 
		
		System.out.println("------------------");
		
		
		int size = all.size();
		
		System.out.println(size);
		 
		
		System.out.println("--------------");
		
		for (int i = 0; i <= size; i++)
		
		{
			if(i==2 | i==6)
			{
				s.selectByIndex(i);
				
			}
		}
		
		
	}
		
}	
		
		
	
	
	
	
	

