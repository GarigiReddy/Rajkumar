package Crm.COmcast.maveCreateCotact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
public class CreateContactPOm_Test extends BaseClass {

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
		//LoginPage log=new LoginPage(driver);
		//log.LoginToApp(username, password, URL);
		@Test(groups = {"smokeTest"})
		public void CreateContactTest() throws Throwable {
			int random=jlib.gerRanDomNumber();
		
			String lastname = elib.getDataFromExcel("sheet1", 1, 3)+random;
		
		HomePage hp=new HomePage(driver);
				hp.setcontact();
				ContactPage cp=new ContactPage(driver);
				cp.setcontactimg();
				Thread.sleep(2000);
				CreateNewContactPage ncp=new CreateNewContactPage(driver);
				ncp.Contactmandatory(lastname);
				ncp.getContactsavebt();
				ContactInformationPage ci=new ContactInformationPage(driver);
				Thread.sleep(2000);
		String act = ci.Confirmationsavemsg();
		String expected = lastname;
		System.out.println(expected);
			System.out.println(act);
//			if(act.contains(expected))
//			{
//				System.out.println("contact successfull");
//				
//			}
//			else 
//			{
//				System.out.print("contact not successfull");
//			}
			Assert.assertTrue(act.contains(lastname));
			//driver.close();
	}

}
