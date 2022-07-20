package Com.Crm.Rugops.PomRepositorylibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Crm.Rugops.Genericutility.WebDriverUtility_;

public class CreateNewCampaignPage extends WebDriverUtility_ {
	WebDriver driver;
	
	   public CreateNewCampaignPage(WebDriver driver) {             //R3
		this.driver = driver;
		PageFactory.initElements(driver, this);
	  }
	   @FindBy(name = "campaignname")
	   private WebElement campaignEdt;
	
	   @FindBy(xpath = "//input[@title='Save [Alt+S]']")
	   private WebElement saveBtn;
	
	   @FindBy(xpath = "//input[@name='product_name']/following-sibling::img")
	   private WebElement productLookUpImg;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCampaignEdt() {
		return campaignEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getProductLookUpImg() {
		return productLookUpImg;
	}

	public void createNewCampaign(String campaginName) {
		campaignEdt.sendKeys(campaginName);
		saveBtn.click();
	}

	   /**
	    *  create a campaign with mandatory field
	 * @throws InterruptedException 
	    * @paramcampaginName
	    */
	public void lookupCampaign(String campaginName, String productname) throws InterruptedException {
		campaignEdt.sendKeys(campaginName);
		
		productLookUpImg.click();
		switchToWindow(driver, "Products&action");
		ProductPage pp = new ProductPage(driver);
		pp.getProductsearchtf().sendKeys(productname);
		pp.getSearchBtn().click();
		Thread.sleep(2000);
		pp.selectproduct();
		//productLookUpImg.click();
		switchToWindow(driver, "Campaigns&action");
		saveBtn.click();
		
	}

}
