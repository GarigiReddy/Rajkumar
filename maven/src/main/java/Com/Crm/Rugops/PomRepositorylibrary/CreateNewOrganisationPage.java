package Com.Crm.Rugops.PomRepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganisationPage {
	WebDriver driver;
	public 	CreateNewOrganisationPage(WebDriver driver) {
		this.driver=driver; 
	PageFactory.initElements(driver, this);	
	}
	
@FindBy(name = "accountname")
private WebElement orgnametf;

@FindBy(xpath = "//input[@title='Save [Alt+S]']")
private WebElement orgsavebt;

public WebDriver getDriver() {
	return driver;
}

public WebElement getOrgnametf() {
	return orgnametf;
}

public WebElement getOrgsavebt() {
	return orgsavebt;
}

public void orgsavebt() {
	orgsavebt.click();
}
public void organizationmandatory(String organizationame) {
	orgnametf.sendKeys(organizationame);
	orgsavebt.click();
}

}


