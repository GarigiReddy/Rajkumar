package Crm.COmcast.maveCreateCotact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.Crm.Rugops.Genericutility.BaseClass;
import Com.Crm.Rugops.Genericutility.ExcelUtility;
import Com.Crm.Rugops.Genericutility.FileUtility;
import Com.Crm.Rugops.Genericutility.JavaUtility;
import Com.Crm.Rugops.Genericutility.WebDriverUtility_;
import Com.Crm.Rugops.PomRepositorylibrary.ContactInformationPage;
import Com.Crm.Rugops.PomRepositorylibrary.ContactPage;
import Com.Crm.Rugops.PomRepositorylibrary.CreateNewContactPage;
import Com.Crm.Rugops.PomRepositorylibrary.HomePage;
import Com.Crm.Rugops.PomRepositorylibrary.LoginPage;
@Listeners(Com.Crm.Rugops.Genericutility.ilistImplementation.class)
public class CreateContact_Delete_Verify_Test extends BaseClass {

	//public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//ExcelUtility elib=new ExcelUtility();
		//FileUtility flib=new FileUtility();
		//JavaUtility jlib=new JavaUtility();
	//WebDriverUtility_ wlib=new WebDriverUtility_();
		//WebDriver driver=new ChromeDriver();
		//String URL = flib.getPropertyKeyValue("url");
		//String username = flib.getPropertyKeyValue("username");
		//String password = flib.getPropertyKeyValue("password");	
		//String lastname = elib.getDataFromExcel("sheet1", 1, 3);
		//driver.get(URL);
		//driver.findElement(By.name("user_name")).sendKeys(username);
		//driver.findElement(By.name("user_password")).sendKeys(password);
		//driver.findElement(By.id("submitButton")).click();
	@Test(groups = {"smokeTest"})
	public void CreateContactsaveAnddeleteTest() throws Throwable
	{
		int random=jlib.gerRanDomNumber();
		String lastname = elib.getDataFromExcel("sheet1", 1, 3)+random;
		//LoginPage log=new LoginPage(driver);
		//log.LoginToApp(username, password, URL);
		HomePage hp=new HomePage(driver);
				hp.setcontact();
				ContactPage cp=new ContactPage(driver);
				cp.setcontactimg();
		Thread.sleep(2000);
		CreateNewContactPage ncp=new CreateNewContactPage(driver);
		ncp.Contactmandatory(lastname);
		ncp.getContactsavebt();
		ContactInformationPage ci=new ContactInformationPage(driver);
		ci.SaveAndDeletcontact();
		//driver.findElement(By.linkText("Contacts")).click();
		//driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		//driver.findElement(By.name("lastname")).sendKeys(lastname);
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		//driver.findElement(By.name("Delete")).click();
		wlib.withToAlertWindowAndAccep(driver,"Are you sure you want to delete this record?");
		
		 //WebElement e = driver.findElement(By.id("bas_searchfield"));
		 WebElement e = cp.dropdown();
		wlib.select(e, 2);
		 wlib.WaitForElement(driver, e);
		// driver.findElement(By.name("search_text")).sendKeys(lastname);
			//driver.findElement(By.name("submit")).click();
		 cp.searchcontact(lastname);
		 Thread.sleep(2000);
	//String actlastname = driver.findElement(By.className("small")).getText();
		 String contact= cp.Contactpresentverify();
		// System.out.println(contact);
		//if(contact.contains(lastname))
			//System.out.println("contact present");
		//else
		//System.out.println("no contact");
		// Assert.assertTrue(contact.contains(lastname));
		// Reporter.log(lastname, true);
			Thread.sleep(2000);
			//WebElement e1 = driver.findElement(By.xpath("(//td[@class='small'])[2]"));
			//wlib.mouseOverOnElement(driver, e1);
			//driver.findElement(By.linkText("Sign Out")).click();
			//driver.close();
			//HomePage h=new HomePage(driver);
			//h.logou();
			
	}

}
