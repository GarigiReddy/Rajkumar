package Com.Crm.Rugops.PomRepositorylibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Crm.Rugops.Genericutility.WebDriverUtility_;

public class OrganisationinformationPage {
	WebDriver driver;
	public 	OrganisationinformationPage(WebDriver driver) {
		this.driver=driver; 
	PageFactory.initElements(driver, this);	
	}
	
public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrginformation() {
		return orginformation;
	}

@FindBy(xpath = "//span[@class='dvHeaderText']")
private WebElement orginformation;

public String Verifyorganusation() {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String actoranisation = orginformation.getText();
	return actoranisation;
			
}
}
