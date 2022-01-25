package pom;

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

public class Minipro1 {
	
	public static void main(String[] args) throws InterruptedException, IOException              {
	    String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
	   Minipro2 pom = new Minipro2();
		
	    pom.email(driver).sendKeys("demo307@gmail.com");
        pom.password(driver).sendKeys("Project@123");
        pom.login(driver).click();
        pom.menu(driver).click();
      //add to cart
      		WebElement cart = driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li/div/div[2]/div[2]/a[1]"));
      		jse.executeScript("arguments[0].scrollIntoView(true)",cart);
      		jse.executeScript("arguments[0].click();",cart);
      		Thread.sleep(7000);
        pom.addcart(driver).click();
        
        pom.column(driver).click();
        pom.button(driver).click();
        pom.agree(driver).click();
        pom.checkout(driver).click();
        pom.payment(driver).click();
        pom.confirm(driver).click();
        Thread.sleep(5000);
    	TakesScreenshot ts = (TakesScreenshot)driver;
    	File so = ts.getScreenshotAs(OutputType.FILE);
    	File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\order11.png");
    	FileUtils.copyFile(so, Dec);
    pom.backtoorder(driver).click();
    TakesScreenshot ts2 = (TakesScreenshot)driver;
	File so2 = ts2.getScreenshotAs(OutputType.FILE);
	File Dec2 = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\order22.png");
	FileUtils.copyFile(so2, Dec2);
    	
    	
    	
	}
}
		