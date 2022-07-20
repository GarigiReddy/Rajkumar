package Com.Crm.Rugops.PomRepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
	WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreatenewCamapaignBtn() {
		return createnewCamapaignBtn;
	}

	public CampaignPage(WebDriver driver) {             //R3
		this.driver = driver;
		PageFactory.initElements(driver, this);
	  }

	   @FindBy(xpath = "//img[@alt='Create Campaign...']")
	   private WebElement createnewCamapaignBtn;

public void CreateCampaign()
{
	createnewCamapaignBtn.click();
}
}
