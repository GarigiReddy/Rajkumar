package Com.Crm.Rugops.PomRepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Crm.Rugops.Genericutility.ExcelUtility;

public class CreateNewContactPage {
	
	WebDriver driver;
	public 	CreateNewContactPage(WebDriver driver) {
		this.driver=driver; 
	PageFactory.initElements(driver, this);	
	}

	@FindBy(linkText = "Organizations")
	private WebElement organisationLnk;

	@FindBy(linkText = "Products")
	private WebElement productsLnk;

	@FindBy(linkText = "Contacts")
	private WebElement contactsLnk;
	

	@FindBy(linkText = "Campaigns")
	private WebElement campaignlnk;

	@FindBy(linkText = "Purchase Order")
	private WebElement purchaseoderlnk;

	@FindBy(linkText = "Vendors")
	private WebElement vendorslink;
	
	@FindBy(name = "lastname")
	private WebElement lastnametf;
	
	@FindBy(name = "button")
	private WebElement contactsavebt;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrganisationLnk() {
		return organisationLnk;
	}

	public WebElement getProductsLnk() {
		return productsLnk;
	}

	public WebElement getContactsLnk() {
		return contactsLnk;
	}

	public WebElement getCampaignlnk() {
		return campaignlnk;
	}

	public WebElement getPurchaseoderlnk() {
		return purchaseoderlnk;
	}

	public WebElement getVendorslink() {
		return vendorslink;
	}

	public WebElement getLastnametf() {
		return lastnametf;
	}

	public WebElement getContactsavebt() {
		return contactsavebt;
	}
	public void Contactmandatory(String lastname) 
	{
		
		
		lastnametf.sendKeys(lastname);
		contactsavebt.click();
	}
	
}
