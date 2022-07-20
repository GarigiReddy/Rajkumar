package Com.Crm.Rugops.PomRepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProductPage {
	WebDriver driver;
	
	
	public NewProductPage(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProductnametf() {
		return productNameEdt;
	}

	public WebElement getProsavebt() {
		return Prosavebt;
	}

	
	@FindBy(name = "productname")
	   private WebElement productNameEdt;


@FindBy(xpath = "//input[@title='Save [Alt+S]']")
private WebElement Prosavebt;

public void productmadatory(String productname) {
	productNameEdt.sendKeys(productname);
	Prosavebt.click();
	
}
}
