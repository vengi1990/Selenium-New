package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handle {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9894156385");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("PARTHIban@77");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(5000);
		WebElement Mobiles = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[3]/a/div[1]/div/img"));
		Actions a = new Actions(driver);
		a.contextClick(Mobiles).build().perform();
		Thread.sleep(3000);
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
WebElement Top_Offers = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[2]"));
		a.contextClick(Top_Offers).build().perform();
		Thread.sleep(3000);
        robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
WebElement Travel = driver.findElement(By.xpath("(//div[@class='xtXmba'])[8]"));
		a.contextClick(Travel).build().perform();
		Thread.sleep(3000);
        robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
WebElement Grocery = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
		a.contextClick(Grocery).build().perform();
		Thread.sleep(3000);
        robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("---------------------------");	
int size = driver.getWindowHandles().size();
		System.out.println(size);
		System.out.println("------------------------");
String pw = driver.getWindowHandle();
        System.out.println(pw);
        System.out.println("---------------------------");
Set<String> allwindows = driver.getWindowHandles();
        for (String pc : allwindows) {
              String title = driver.switchTo().window(pc).getTitle();
              System.out.println(title); 
              System.out.println("-----------------------");
         }    
            
     String pw1   =  "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
     String pc4   =  "Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
     String pc3   =  "Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com";
     String pcc   =  "Category Offer Store Online - Buy Category Offer Online at Best Price in India | Flipkart.com";
     String pc1   =  "Mobile Phones: Buy Mobiles Online at Best Prices in India";
        
        for (String pc : allwindows) {
            if(driver.switchTo().window(pc1).getTitle().equals(pc)) {
        	driver.findElement(By.xpath("//input[@type='text'])[1]")).sendKeys("realme");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(5000);
            TakesScreenshot ts1 = (TakesScreenshot)driver;
        	File so = ts1.getScreenshotAs(OutputType.FILE);
        	File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\mobile.png");
        	FileUtils.copyFile(so, Dec);        
        }
        	
           if(driver.switchTo().window(pcc).getTitle().equals(pc)) {
        	WebElement top = driver.findElement(By.xpath("//input[@type='text']"));
        	top.sendKeys("headphone");
        	driver.findElement(By.xpath("//button[@type='submit']")).click();
        	Thread.sleep(5000);
            TakesScreenshot ts2 = (TakesScreenshot)driver;
        	File so = ts2.getScreenshotAs(OutputType.FILE);
        	File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\top.png");
        	FileUtils.copyFile(so, Dec);
        	}
      
        if(driver.switchTo().window(pc3).getTitle().equals(pc)) {
        WebElement air = driver.findElement(By.xpath("(//input[@type='text'])[2]"));  
        air.sendKeys("delhi");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(5000);
        TakesScreenshot ts3 = (TakesScreenshot)driver;
    	File so = ts3.getScreenshotAs(OutputType.FILE);
    	File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\top.png");
    	FileUtils.copyFile(so, Dec);
              }
        
        if(driver.switchTo().window(pc4).getTitle().equals(pc)) {
        WebElement gro = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        gro.sendKeys("salt");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        TakesScreenshot ts4 = (TakesScreenshot)driver;
    	File so = ts4.getScreenshotAs(OutputType.FILE);
    	File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\groc.png");
    	FileUtils.copyFile(so, Dec);
        }
        
        
        
        
        
       if(driver.switchTo().window(pw1).getTitle().equals(pc)) {
        	Thread.sleep(3000);
            TakesScreenshot ts5 = (TakesScreenshot)driver;
        	File so = ts5.getScreenshotAs(OutputType.FILE);
        	File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\parent.png");
        	FileUtils.copyFile(so, Dec);	
        }
        
        }
        
        for(String pc :allwindows) {
        	if(!pc.equals(pw)) {
        		driver.switchTo().window(pc);
        		driver.close();
        		
        		
        	}
        
        }
        
        driver.switchTo().window(pw);
        Thread.sleep(5000);
        TakesScreenshot ts6 = (TakesScreenshot)driver;
    	File so = ts6.getScreenshotAs(OutputType.FILE);
    	File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\parent1.png");
    	FileUtils.copyFile(so, Dec);
        
        
        }
	}   
        
            	 
				
			       
	

	
	
	
	
	
	
	
	
	


	
	