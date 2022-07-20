package Com.Crm.Rugops.PomRepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignInformationPage {
	
		WebDriver driver;
		
		   public CampaignInformationPage(WebDriver driver) {             //R3
			this.driver = driver;
			PageFactory.initElements(driver, this);
		  }
		@FindBy(xpath =  "//span[@class='dvHeaderText']")
	   private WebElement  campaigninformationtext;

		public WebDriver getDriver() {
			return driver;
		}
		public WebElement getOrgHeaderSucMsg() {
			return campaigninformationtext;
		}
public String verifyCampign()
{
	String actCamp = campaigninformationtext.getText();
	return actCamp;
	
}
		
}


