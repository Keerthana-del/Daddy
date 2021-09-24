package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipcart {
public static void main(String[] args)	
{
	WebDriver driver=new FirefoxDriver();
	driver.get("url");
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("oneplus tv");
	
	
}

}
