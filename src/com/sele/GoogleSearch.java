package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
		
		// options to open in private browser
		//ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--incognito");
	
		
		
		//--------->headless options
	//	options.setHeadless(true);
	//	WebDriver driver = new ChromeDriver(options);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		System.out.println("headless print"+ driver.getTitle());

		
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
		
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']"));
		
		
		System.out.println("Selenium search result  " + list.size());
		
		for (int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i).getText());
		
		if (list.get(i).getText().contains("selenium webdriver")) {
			list.get(i).click();
			break;
		
		}
		driver.close();
		}
	}

}


