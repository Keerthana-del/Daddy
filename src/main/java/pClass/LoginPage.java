package pClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(name="user_name")
	private WebElement userNameTf;
	@FindBy(name="user_password")
	private WebElement passwordTf;
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	public WebElement getUserNameTf() {
		return userNameTf;
	}
	public WebElement getPasswordTf() {
		return passwordTf;
	}
	public WebElement getSubmitBtn() {
		return loginBtn;
	}
	public HomePage Login(String username,String password)
	{
		userNameTf.sendKeys(username);
		passwordTf.sendKeys(password);
		loginBtn.click();
	return new HomePage(driver);
		
	}
	

}
