package vtiger.Testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RepositoryTest {
public static void main()
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");
	WebElement usernametxt = driver.findElement(By.name("user_name"));
	WebElement passwordtxt = driver.findElement(By.name("user_ppassword"));
	WebElement loginbtn = driver.findElement(By.id("submitButton"));
	usernametxt.sendKeys("admin");
	passwordtxt.sendKeys("admin");
	loginbtn.click();
}
}
