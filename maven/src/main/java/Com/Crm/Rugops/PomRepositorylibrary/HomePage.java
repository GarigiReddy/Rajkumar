package Com.Crm.Rugops.PomRepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Crm.Rugops.Genericutility.WebDriverUtility_;

public class HomePage extends WebDriverUtility_{ 
	WebDriver driver;
public 	HomePage(WebDriver driver) {
	this.driver=driver; 
PageFactory.initElements(driver, this);	
}

@FindBy(linkText = "Organizations")
private WebElement organisationLnk;

@FindBy(linkText = "Products")
private WebElement productsLnk;

@FindBy(linkText = "Contacts")
private WebElement contactsLnk;


public WebElement getMorelnk() {
	return morelnk;
}

@FindBy(linkText = "More")
private WebElement morelnk;

@FindBy(linkText = "Campaigns")
private WebElement campaignlnk;

@FindBy(linkText = "Purchase Order")
private WebElement purchaseoderlnk;

@FindBy(linkText = "Vendors")
private WebElement vendorslink;


@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
private WebElement administratorimg;

@FindBy(linkText = "Sign Out")
private WebElement signoutLnk;

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
public void logou() {
	
	mouseOverOnElement(driver, administratorimg);
	signoutLnk.click();
}
public void setcampaign() {
	mouseOverOnElement(driver, morelnk);
	campaignlnk.click();
	
}
public void setpurchaseorder() {
	mouseOverOnElement(driver, morelnk);
	purchaseoderlnk.click();
}
public  void setvendorlink() {
	mouseOverOnElement(driver, morelnk);
	vendorslink.click();
	
}
public   WebElement mouseonmore() {
	WebElement more = morelnk;
	return more;
}

	// TODO Auto-generated method stub
	
}
