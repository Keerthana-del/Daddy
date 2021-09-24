package pClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadInformationPage {
	WebDriver driver;
	public LeadInformationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@title='Delete [Alt+D]'])[1]")
	private WebElement deleteBtn;
	@FindBy(xpath="(//input[@title='Edit [Alt+E]'])[1]")
	private WebElement editBtn;
	@FindBy(xpath="(//input[@title='Duplicate [Alt+U]'])[1]")
	private WebElement duplicateBtn;
	@FindBy(xpath="(//a[.='Leads'])[1]")
	private WebElement leadInfo;
	public WebElement getLeadInfo() {
		return leadInfo;
	}
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	public WebElement getEditBtn() {
		return editBtn;
	}
	public WebElement getDuplicateBtn() {
		return duplicateBtn;
	}
	
	public void LeadInfo()
	{
		deleteBtn.click();
		Alert a= driver.switchTo().alert();
		a.accept();
		leadInfo.click();

	}
	public String LeadInfoo()
	{
		return leadInfo.getText();
	}
}
