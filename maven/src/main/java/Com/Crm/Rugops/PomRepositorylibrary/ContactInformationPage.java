package Com.Crm.Rugops.PomRepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Crm.Rugops.Genericutility.WebDriverUtility_;

public class ContactInformationPage extends WebDriverUtility_{
	
	WebDriver driver;
	public 	ContactInformationPage(WebDriver driver) {
		this.driver=driver; 
	PageFactory.initElements(driver, this);	
	}

	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getActlast() {
		return actlast;
	}

	public WebElement getDeletebt() {
		return deletebt;
	}

	@FindBy(xpath = "//span[contains(text(),'Contact Information')]")
	private WebElement confirmationmsg;

	public WebElement getConfirmationmsg() {
		return confirmationmsg;
	}

	@FindBy(className = "button")
	private WebElement actlast;
	
	@FindBy(name = "Delete")
	private WebElement deletebt;
	
public void SaveAndDeletcontact() {
	deletebt.click();
//withToAlertWindowAndAccep(driver, "delete");

}

public String Confirmationsavemsg() {
	 String act = confirmationmsg.getText();
	return act;
}
}

