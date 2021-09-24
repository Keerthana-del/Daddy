package pClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.Utils.BaseClass;
import vtiger.Utils.WebDriverUtility;

public class HomePage extends WebDriverUtility{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//a[.='Opportunities'])[1]")
	private WebElement opportunitiesLink;
	@FindBy(xpath="//a[.='Products']")
	private WebElement productLink;
	@FindBy(xpath="//a[.='Documents']")
	private WebElement documentsLink;
	@FindBy(xpath="//a[.='Leads']")
	private WebElement leadsLink;
	@FindBy(xpath="//a[.='More']")
	private WebElement moreLink;
	@FindBy(xpath="//a[.='Trouble Tickets']")
	private WebElement troubleTicketsLinks;
	@FindBy(xpath="//a[.='Purchase Order']")
	private WebElement purchaseOrderLink;
	@FindBy(xpath="//a[.='Sales Order']")
	private WebElement salesOrderLink;
	@FindBy(xpath="//a[.='Service Contracts']")
	private WebElement serviceContractsLink;
	@FindBy(xpath="//a[.='Project Tasks']")
	private WebElement projectTasksLink;
	@FindBy(xpath="//a[.='Vendors']")
	private WebElement VendorsLink;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstratorIMG;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutLink;

	public WebElement getAdminstratorIMG() {
		return adminstratorIMG;
	}
	public WebElement getSignOutLink() {
		return signOutLink;
	}
	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}
	public WebElement getProductLink() {
		return productLink;
	}
	public WebElement getDocumentsLink() {
		return documentsLink;
	}
	public WebElement getLeadsLink() {
		return leadsLink;
	}
	public WebElement getMoreLink() {
		return moreLink;
	}
	public WebElement getTroubleTicketsLinks() {
		return troubleTicketsLinks;
	}
	public WebElement getPurchaseOrderLink() {
		return purchaseOrderLink;
	}
	public WebElement getSalesOrderLink() {
		return salesOrderLink;
	}
	public WebElement getServiceContractsLink() {
		return serviceContractsLink;
	}
	public WebElement getProjectTasksLink() {
		return projectTasksLink;
	}
	public WebElement getVendorsLink() {
		return VendorsLink;
	}
	public void Opportunities()
	{
		opportunitiesLink.click();
		
	}
    public void Products()
    {
    	productLink.click();
    	
    }
    public void Documents()
    {
    	documentsLink.click();
    
    }
    public void Leads()
    {
    	leadsLink.click();
    	
    }
    public void TroubleTickets()
    {
     mouseOver(driver, moreLink);
     troubleTicketsLinks.click();
    }
    public void PurchaseOrder()
    {
    	mouseOver(driver, moreLink);
    	purchaseOrderLink.click();
    }
    public void SalesOrder()
    {
    	mouseOver(driver, moreLink);
    	salesOrderLink.click();
    }
    public void ServiceContracts()
    {
    	mouseOver(driver, moreLink);
    	serviceContractsLink.click();
    }
    public void ProjectTasks()
    {
    	mouseOver(driver, moreLink);
    	projectTasksLink.click();
    	
    }
    public void Vendors()
    {
    	mouseOver(driver, moreLink);
    	VendorsLink.click();
    }
    public void signOut() {
		mouseOver(driver, adminstratorIMG);
		signOutLink.click();
    }
}
