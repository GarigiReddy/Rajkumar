package Com.Crm.Rugops.PomRepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator;

public class ContactPage {
	public WebElement getContactimg() {
		return contactimg;
	}

	public WebElement getContactsrc() {
		return contactsrc;
	}

	WebDriver driver;
	public 	ContactPage(WebDriver driver) {
		this.driver=driver; 
	PageFactory.initElements(driver, this);	
	}
	


@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement contactimg;
 
@FindBy(name = "search_field")
private WebElement dropcontact;

public WebElement getDropcontact() {
	return dropcontact;
}

@FindBy(name = "search_text")
private WebElement contactsrc;

@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement organisationimg;

@FindBy(linkText = "More")
private WebElement morelnk;


@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
private WebElement administratorimg;

@FindBy(linkText = "Sign Out")
private WebElement signoutLnk;

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

@FindBy(xpath = "//input[@class='crmbutton small create']")
private WebElement searchbt;

public WebElement getOrganisationimg() {
	return organisationimg;
}

public WebElement getSearchbt() {
	return searchbt;
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
public WebElement getAdministratorimg() {
	return administratorimg;
}
public WebElement getSignoutLnk() {
	return signoutLnk;
}
public void setcontact()
{
	contactsLnk.click();
}
public void setorganization() {
	organisationLnk.click();
}
public void setproduct() {
	productsLnk.click();
}
public WebDriver getDriver() {
	return driver;
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
public WebElement getMorelnk() {
	return morelnk;
}
@FindBy(className = "small")
private WebElement Contactpopup;

public WebElement getContactpopup() {
	return Contactpopup;
}

public void setcontactimg()
{
	contactimg.click();
}
public void searchcontact(String  lastname) throws InterruptedException
{
contactsrc.sendKeys(lastname);
Thread.sleep(2000);
searchbt.click();

}
public WebElement dropdown()
{
	WebElement ele = dropcontact;
	return ele;
}
public String Contactpresentverify( )

{
	String contact = Contactpopup.getText();
	return contact;
}
}
