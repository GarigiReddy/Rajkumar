package Com.Crm.Rugops.PomRepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInformationPage {
	WebDriver driver;
	public ProductInformationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement productinformation;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getProductinformation() {
		return productinformation;
	}
	public String getproductinfor() {
		String product = productinformation.getText();
		return product;
	}
	
}
