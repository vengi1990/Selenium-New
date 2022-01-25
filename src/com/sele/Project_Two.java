package com.sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Two {
	
	public static void main(String[] args) throws InterruptedException, IOException              {

	
    String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("demo307@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Project@123");
    driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

    
    driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();

//add to cart
	WebElement cart = driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li/div/div[2]/div[2]/a[1]"));
	jse.executeScript("arguments[0].scrollIntoView(true)",cart);
	jse.executeScript("arguments[0].click();",cart);
    Thread.sleep(7000);
//Proceed to checkout--1	
    driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();	
//Proceed to checkout--2
    driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
//Proceed to checkout--3
    driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
//Agree
    driver.findElement(By.xpath("//*[@id=\"uniform-cgv\"]")).click();
    Thread.sleep(3000);
//Proceed to checkout--4
    driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
    Thread.sleep(3000);
//Pay    
	driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
//Confirm order
	driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
	Thread.sleep(5000);
	TakesScreenshot ts = (TakesScreenshot)driver;
	File so = ts.getScreenshotAs(OutputType.FILE);
	File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\order1.png");
	FileUtils.copyFile(so, Dec);
//Back to orders
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a")).click();
	TakesScreenshot ts2 = (TakesScreenshot)driver;
	File so2 = ts2.getScreenshotAs(OutputType.FILE);
	File Dec2 = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\order2.png");
	FileUtils.copyFile(so2, Dec2);

}


}
