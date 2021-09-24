package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ajio {
public static void main (String[] args)
{
	System.setProperty("webdriver.chrome.driver", "./chromedriver1.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ajio.com/");
	WebElement ele = driver.findElement(By.xpath("//a[.='MEN']"));
	mousehover(driver,ele);
	WebElement ele2 = driver.findElement(By.xpath("(//a[.='BRANDS'])[1]"));
    mousehover(driver, ele2);
    //driver.findElement(By.xpath("(//a[.='Armani Exchange'])[1]")).click();
    //driver.findElement(By.xpath("//div[@class='three-grid-container active']")).click();
    //driver.findElement(By.xpath("//div[@class='five-grid-container active']")).click();
    
}
public static void mousehover(WebDriver driver,WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}
}
