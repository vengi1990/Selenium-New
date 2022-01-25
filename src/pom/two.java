package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class two {
	
	public static    WebElement username(WebDriver driver)
	{
	return driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	}
	public static   WebElement password(WebDriver driver) 
	{
	return driver.findElement(By.xpath("//input[@type='password']"));
	}
	public static   WebElement button(WebDriver driver)
	{
	return driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	}
}
