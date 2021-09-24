package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.vtiger.pom.Login;

public class Repository {
	
	@Test
	public void repotest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		Login repo=new Login(driver);
		repo.login();
	}

}
