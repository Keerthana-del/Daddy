package pClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.Utils.WebDriverUtility;

public class LeadsPage extends WebDriverUtility {
	
	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement leadImg;
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement firstnameSl;
	@FindBy(name="firstname")
	private WebElement firstnameTf;
	@FindBy(name="lastname")
	private WebElement lastnameTf;
	@FindBy(name="company")
	private WebElement companyTf;
	@FindBy(id="phone")
	private WebElement phoneTf;
	@FindBy(name="leadsource")
	private WebElement leadsourceSl;
	@FindBy(name="industry")
	private WebElement industrySl;
	@FindBy(name="leadstatus")
	private WebElement leadstatusSl;
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement streetTa;
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement descriptionTa;
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getDescriptionTa() {
		return descriptionTa;
	}
	public WebElement getStreetTa() {
		return streetTa;
	}
	public WebElement getLeadstatusSl() {
		return leadstatusSl;
	}
	public WebElement getIndustrySl() {
		return industrySl;
	}
	public WebElement getCompanyTf() {
		return companyTf;
	}
	public WebElement getPhoneTf() {
		return phoneTf;
	}
	public WebElement getLeadsourceSl() {
		return leadsourceSl;
	}
	public WebElement getLastnameTf() {
		return lastnameTf;
	}
	public WebElement getFirstnameSl() {
		return firstnameSl;
	}
	public WebElement getFirstnameTf() {
		return firstnameTf;
	}
	public WebElement getLeadImg() {
		return leadImg;
	}
	public void createLead(String firstname,String lastname,String company,String streett,String descriptionn)
	{
		leadImg.click();
		SelectOption(firstnameSl, 1);
		firstnameTf.sendKeys(firstname);
		lastnameTf.sendKeys(lastname);
		companyTf.sendKeys(company);
		phoneTf.sendKeys("888888888");
        SelectOption(leadsourceSl, 3);
        SelectOption(industrySl, 3);
        SelectOption(leadstatusSl, 4);
        streetTa.sendKeys(streett);
        descriptionTa.sendKeys(descriptionn);
        saveBtn.click();
	}

}
