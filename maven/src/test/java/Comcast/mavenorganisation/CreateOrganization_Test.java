package Comcast.mavenorganisation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.Crm.Rugops.Genericutility.BaseClass;
import Com.Crm.Rugops.Genericutility.ExcelUtility;
import Com.Crm.Rugops.Genericutility.FileUtility;
import Com.Crm.Rugops.Genericutility.JavaUtility;
import Com.Crm.Rugops.Genericutility.WebDriverUtility_;
import Com.Crm.Rugops.PomRepositorylibrary.CreateNewOrganisationPage;
import Com.Crm.Rugops.PomRepositorylibrary.HomePage;
import Com.Crm.Rugops.PomRepositorylibrary.LoginPage;
import Com.Crm.Rugops.PomRepositorylibrary.OrganisationinformationPage;
import Com.Crm.Rugops.PomRepositorylibrary.OrganizationPage;
@Listeners(Com.Crm.Rugops.Genericutility.ilistImplementation.class)
public class CreateOrganization_Test extends BaseClass{
	//public static void main(String[] args) throws Throwable {
		
	
	//ExcelUtility elib=new ExcelUtility();
	//FileUtility flib=new FileUtility();
	//JavaUtility jlib=new JavaUtility();
	//WebDriverUtility_ wlib=new WebDriverUtility_();
	//String browser = flib.getPropertyKeyValue("BROWSER");
	//String URL = flib.getPropertyKeyValue("url");
	//String username = flib.getPropertyKeyValue("username");
	//String password = flib.getPropertyKeyValue("password");
	//int random = jlib.gerRanDomNumber();
	//String organizationame = elib.getDataFromExcel("sheet1", 1, 4)+random;
	//System.out.println(organizationame);
	//WebDriver driver=null;
	//if(browser.equalsIgnoreCase("Chrome")) {
		//driver=new ChromeDriver();
	//}
	//else if(browser.equals("firebox")) {
		//driver=new FirefoxDriver();
	//}else if(browser.equals("safari")) {
		//driver=new SafariDriver();
	//}
		//driver.get(URL);
		//LoginPage log=new LoginPage(driver);
		//log.LoginToApp(username, password, URL);
	@Test(groups = {"regressionTest"})
		public void CreateOrganisationTest() throws Throwable {
			int random=jlib.gerRanDomNumber();
			//test script dat
			String organizationame = elib.getDataFromExcel("sheet1", 1, 4)+random;
		
		//step 2 navigate to organisation
		HomePage hp1 = new HomePage(driver);																																																HomePage hp=new HomePage(driver);
		hp1.setorganization();
		OrganizationPage op=new OrganizationPage(driver);
		op.setOrganisation();
		CreateNewOrganisationPage cnop=new CreateNewOrganisationPage(driver);
		cnop.organizationmandatory(organizationame);
		OrganisationinformationPage oi=new OrganisationinformationPage(driver);
		String actorganisation = oi.Verifyorganusation();
//		
//		  if(actorganisation.contains(organizationame)) {
//			  System.out.println("organisation is added and pass");
//		  }
//		  else {
//			  System.out.println("organisation is not added and fail");
//		  }
		  //hp.logou();
		Assert.assertTrue(actorganisation.contains(organizationame));
		}
}
