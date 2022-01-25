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
import org.openqa.selenium.support.PageFactory;

public class Profindby1 {
	
	private static final String  TakesScreenshot = null;

	public static void main(String[] args) throws InterruptedException, IOException              {
	    String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
	PageFactory.initElements(driver, Profindby2.class);

    Profindby2.email.sendKeys("demo307@gmail.com");
    Profindby2.password.sendKeys("Project@123");
    Profindby2.login.click();
    Profindby2.menu.click();
//add to cart
    WebElement cart = driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li/div/div[2]/div[2]/a[1]"));
	jse.executeScript("arguments[0].scrollIntoView(true)",cart);
	jse.executeScript("arguments[0].click();",cart);
	Thread.sleep(7000);   
  Profindby2.addcart.click();  
  //  Profindby2.column.click();
  Profindby2.button.click();
  Profindby2.agree.click();
  Profindby2.checkout.click();
  Profindby2.payment.click();
  Profindby2.confirm.click();
  Thread.sleep(5000);
    
	TakesScreenshot ts = (TakesScreenshot)driver;
	File so = ts.getScreenshotAs(OutputType.FILE);
	File Dec = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\orderfindby1.png");
	FileUtils.copyFile(so, Dec);
  Profindby2.backtoorder.click();
  TakesScreenshot ts2 = (TakesScreenshot)driver;
  File so2 = ts2.getScreenshotAs(OutputType.FILE);
  File Dec2 = new File("C:\\Users\\PARTHIBAN\\eclipse-workspace\\Selenium\\Screenshot\\orderfindby2.png");
  FileUtils.copyFile(so2, Dec2);
  
	}
}
