package com_selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetCurrentWindowHandle;

public class BrowserLaunch {
public static void main(String[] args) throws InterruptedException, Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver2.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(4000);
	driver.get("https://www.google.com/");
	Thread.sleep(4000);
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Current URL is = " +currentUrl);
	String title = driver.getTitle();
	System.out.println("Current title is ="  +title);
	String pageSource = driver.getPageSource();
	//System.out.println("The Pagesource is = " +pageSource);
	Thread.sleep(4000);
	String windowHandle = driver.getWindowHandle();
	System.out.println("The window handle is = " +windowHandle);
	Robot r =new Robot();
	Actions a=new Actions(driver);
	Thread.sleep(4000);
	WebElement fe = driver.findElement(By.xpath("//a[text()='Gmail']"));
	a.contextClick(fe).build().perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(4000);
	WebElement im = driver.findElement(By.xpath("//div[@class='gb_e gb_f']/following-sibling::div[1]//a"));
	a.contextClick(im).build().perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	
	Set<String> windowHandles = driver.getWindowHandles();
	Iterator<String> s=windowHandles.iterator();
	for (String wh : windowHandles) {
		System.out.println(wh);
		
	}
	while(s.hasNext())
	{
		String child1=s.next();
	
		WebDriver window = driver.switchTo().window(child1);
		System.out.println(window.getTitle());
		
	}
	
	
	
}
}
