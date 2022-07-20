package Com.Crm.Rugops.PomRepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}

	public 	OrganizationPage(WebDriver driver) {
		this.driver=driver; 
	PageFactory.initElements(driver, this);	
	}
	
@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement organisationimg;

public WebElement getOrganisationimg() {
	return organisationimg;
}
public void setOrganisation()
{
	organisationimg.click();
}
}
