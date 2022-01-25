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
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String url = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Actions act = new Actions(driver);
		
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement norway = driver.findElement(By.id("box101"));
			act.dragAndDrop(oslo, norway).build().perform();
		
		WebElement madrid = driver.findElement(By.id("box7"));
		WebElement spain = driver.findElement(By.id("box107"));
	//	Actions act = new Actions(driver);
		act.dragAndDrop(madrid, spain).build().perform();
		
		
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement italy = driver.findElement(By.id("box106"));
			act.dragAndDrop(rome, italy).build().perform();
			
			
			WebElement copenhagen = driver.findElement(By.id("box4"));
			WebElement denmark = driver.findElement(By.id("box104"));
				act.dragAndDrop(copenhagen, denmark).build().perform();
				
				
				
				WebElement seoul = driver.findElement(By.id("box5"));
				WebElement southkorea = driver.findElement(By.id("box105"));
					act.dragAndDrop(seoul, southkorea).build().perform();
					
					
					
					WebElement stockholm = driver.findElement(By.id("box2"));
					WebElement sweden = driver.findElement(By.id("box102"));
						act.dragAndDrop(stockholm, sweden).build().perform();
						
						
						WebElement washington = driver.findElement(By.id("box3"));
						WebElement unitedstates = driver.findElement(By.id("box103"));
							act.dragAndDrop(washington, unitedstates).build().perform();
							
							
						
							TakesScreenshot ts = (TakesScreenshot)driver;
							
							File so = ts.getScreenshotAs(OutputType.FILE);
							
							File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\draganddrop1.png");
							
							FileUtils.copyFile(so, Dec);
							
							Thread.sleep(10000);
							
						//	driver.close();
			
		
			
			
			
			
			
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
