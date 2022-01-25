package pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Baseclass {
     static WebDriver driver;
     static TakesScreenshot ts;
     static JavascriptExecutor jse;
     static Actions a;
     
     public static void getdriver(String drivername) 
     {
    	 if(drivername.equalsIgnoreCase("chrome")) 
    	 {
    		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    			driver = new ChromeDriver();
    			driver.manage().window().maximize();
    	 }
	}

//url
     public static void url(String link )
     {
           driver.get(link);
     }

//Click
     public static void clicks(WebElement clickelememt) 

     {
     	clickelememt.click();
     }

//checkbox
     public static void cb(WebElement checkboxclickelement) 
     {
    	 checkboxclickelement.click();
     }

 //sendkeys
     public static void sk(WebElement sendelement , String input) {


    	 sendelement.sendKeys(input);
     }
     
     //mouseover
     public static void mouseover(WebElement sendelement) {
     
    	a = new Actions(driver);
    	a.moveToElement(sendelement).build().perform();
     }
     
     //mouseoverandclick
     public static void mouseoverclick(WebElement sendelement) {
     
    	a = new Actions(driver);
    	a.moveToElement(sendelement).click().build().perform();
     }
     
 //screenshot
     public static void ss() throws IOException, InterruptedException
     {     
    	 Thread.sleep(5000);
    	 ts=(TakesScreenshot)driver;
    	 File so = ts.getScreenshotAs(OutputType.FILE);
    		File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\today" +System.currentTimeMillis()+".png");
    		FileUtils.copyFile(so, Dec);
     }
 //java
     public static void javascript (WebElement javascriptelement) 
     {
    	 jse=(JavascriptExecutor)driver;
    	 
		jse.executeScript("arguments[0].scrollIntoView(true)" , javascriptelement);
		
     }
     
     
     public static void driverclose()
     
     {
    	 driver.close();
     }
     
     
     
     
     }


