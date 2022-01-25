package com_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe")
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
