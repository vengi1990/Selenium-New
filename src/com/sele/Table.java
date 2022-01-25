package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");

List<WebElement> headers = driver.findElements(By.xpath("//*[@id=\"example\"]/thead/tr"));
         for(WebElement head : headers ) {
        	 System.out.println(head.getText());
System.out.println("------------------------------------------------------------");

List<WebElement> all = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody"));
         for(WebElement list : all ) {
System.out.println(list.getText());
         System.out.println("-------------------------------");
         
         }
}
}
} 