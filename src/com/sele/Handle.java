package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(7000);
	WebElement Grocery = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
	
	Actions a = new Actions(driver);
	a.contextClick(Grocery).build().perform();
	Thread.sleep(5000);
	Robot robo = new Robot();
	robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	
    WebElement air = driver.findElement(By.xpath("(//div[@class='xtXmba'])[8]"));
	a.contextClick(air).build().perform();
	Thread.sleep(5000);
	robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);


	
	
	
	 
	
	int size = driver.getWindowHandles().size();
	System.out.println(size);
	System.out.println("--------------------------");
	
	 String pw = driver.getWindowHandle();
	System.out.println(pw);
	System.out.println("---------------------------");
	
	Set<String> allwindow = driver.getWindowHandles();
    for (String cp : allwindow) {
	String title = driver.switchTo().window(cp).getTitle();
	System.out.println(title);
    }
     String pw1 =	"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
	String cp1 ="Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com";
	
	String Groceries = "Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
	
	for (String cp : allwindow) 
	{
		if(driver.switchTo().window(cp).getTitle().equals(Groceries)) {
			
			driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("honey");
	        driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg")).click();
		//Thread.sleep(5000);
		TakesScreenshot photo = (TakesScreenshot)driver;
				File s1 = photo.getScreenshotAs(OutputType.FILE);
				File D1 = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\groser.png");
				FileUtils.copyFile(s1,D1);
				}
			

		{
			if(driver.switchTo().window(cp).getTitle().equals(cp1)) {
		driver.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div[1]/div/div[2]/div/div[2]/form/div/div[1]/div[3]/div[1]/div[1]/input")).sendKeys("mumbai");
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/form/div/button/span")).click();
			Thread.sleep(5000);
			TakesScreenshot ts2 = (TakesScreenshot)driver; 
				File s2 = ts2.getScreenshotAs(OutputType.FILE);
			    File D2 = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\air1.png");
				FileUtils.copyFile(s2, D2);
			
			
			}
	}
	
	
}
	}
}


