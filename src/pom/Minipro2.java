package pom;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Minipro2 {
	
	public static  WebElement email(WebDriver driver) 
	{
	return driver.findElement(By.xpath("//*[@id=\"email\"]"));
	}
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		}
   public static WebElement login(WebDriver driver) 
   {
		return driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
   }
    public static WebElement menu(WebDriver driver)
   {
  	return driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
    }
    public static WebElement addcart(WebDriver driver)
    {
    return driver.findElement(By.xpath("//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a/span"));
    }
    public static WebElement column(WebDriver driver)
    {
    return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
    }
    public static WebElement button(WebDriver driver)
    {
    	 return driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
    }
    public static WebElement agree(WebDriver driver)
    {
    return	driver.findElement(By.xpath("//*[@id=\"uniform-cgv\"]"));
    }
    public static WebElement checkout(WebDriver driver)
    {
    	return driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
    }
    public static WebElement payment(WebDriver driver) {
    	return driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
    }
    public static WebElement confirm(WebDriver driver)
    {
    return	driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
    }
    public static WebElement backtoorder(WebDriver driver)
    {
    return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a"));
    }
   
    
	
   
   
   
   
   
   
   
   
   
   
   
}
