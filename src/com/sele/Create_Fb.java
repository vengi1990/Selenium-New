package com.sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Fb {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String url = "https://en-gb.facebook.com/r.php?locale=en_GB&display=page";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);	
		
		
		driver.findElement(By.xpath("(//input[@name='firstname'])[1]")).sendKeys("Parthiban");
		driver.findElement(By.xpath("(//input[@name='lastname'])[1]")).sendKeys("Gunaseelan");
		driver.findElement(By.xpath("(//input[@name='reg_email__'])[1]")).sendKeys("9042774330");
		driver.findElement(By.xpath("(//input[@name='reg_passwd__'])[1]")).sendKeys("Parthi@330");		
		
		WebElement date = driver.findElement(By.id("day"));
		Select dt = new Select (date);
		dt.selectByValue("22");
		
	
		WebElement month = driver.findElement(By.id("month"));
		Select mon = new Select (month);
		mon.selectByVisibleText("Feb");
		
		
		
		
		WebElement year = driver. findElement(By.id("year"));
		Select yr = new Select (year);
		yr.selectByValue("1990");
		
		
       driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
       
       driver.findElement(By.xpath("(//button[@name='websubmit'])")).click();
       
       Thread.sleep(5000);

       TakesScreenshot ts = (TakesScreenshot)driver; // casting   (narrow)
   	
   	File so = ts.getScreenshotAs(OutputType.FILE);
   	
   	File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\fbnewacc.png");
   	
   	FileUtils.copyFile(so, Dec);


	}

	
	}
	
		
	


