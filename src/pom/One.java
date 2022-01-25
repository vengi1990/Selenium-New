package pom;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");	
		
		two pom = new two () ;
	    
	    pom.username(driver).sendKeys("9894156385");
	    
	    pom.password(driver).sendKeys("PARTHIban@77");
	    
		pom.button(driver).click();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		TakesScreenshot ts = (TakesScreenshot)driver; // casting   (narrow)
		File so = ts.getScreenshotAs(OutputType.FILE);
		File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\flipkartss1.png");
		FileUtils.copyFile(so, Dec);
		Thread.sleep(10000);
		*/
		
		
	}

}
