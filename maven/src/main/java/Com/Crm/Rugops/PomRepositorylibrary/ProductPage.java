package Com.Crm.Rugops.PomRepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	public 	ProductPage(WebDriver driver) {
		this.driver=driver; 
	PageFactory.initElements(driver, this);	
	}
	
@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement productimg;

@FindBy(name = "search_text")
private WebElement productsearchtf;

@FindBy(id = "1")
private WebElement selectproduct;

@FindBy(name = "search")
private WebElement searchBtn;
public WebDriver getDriver() {
	return driver;
}

public WebElement getProductimg() {
	return productimg;
}

public WebElement getProductsearchtf() {
	return productsearchtf;
}

public WebElement getSearchBtn() {
	return searchBtn;
}
public void newproduct() {
	productimg.click();
	
}
public void productimg()
{
	productimg.click();
}
public void selectproduct() {
	selectproduct.click();
}
}
