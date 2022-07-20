package Com.Crm.Rugops.PomRepositorylibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//Rule 1create seperate java class for every page in aapplication
public LoginPage(WebDriver driver) {//Rule 3 execute all the elements  & initialize the elements pagefactory.initelements(initilization)
PageFactory.initElements(driver, this);
}
public WebElement getUsernameed() {//rule 4 Declare all the elments as private &provide getter methods ,bussiness methods(utilization) 
	return usernameet;
}
public WebElement getPasswordet() {
	return passwordet;
}
public WebElement getSubmitbt() {
	return loginbt;
}
@FindBy(name = "user_name")//R-2 identify all the elements using @findBy & findBys,FindAll(declaration)
private WebElement usernameet;

@FindBy(name = "user_password")
private WebElement passwordet;

@FindBy(id = "submitButton")
private WebElement loginbt;
public void LoginToApp(String username,String password,String URL) {
	usernameet.sendKeys(username);
	passwordet.sendKeys(password);
	loginbt.click();
	
}
}
