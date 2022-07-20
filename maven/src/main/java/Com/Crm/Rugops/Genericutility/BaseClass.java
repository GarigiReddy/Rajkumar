package Com.Crm.Rugops.Genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Com.Crm.Rugops.PomRepositorylibrary.HomePage;
import Com.Crm.Rugops.PomRepositorylibrary.LoginPage;

public class BaseClass {
	public WebDriver driver;
	//reinitialize driver
	//public static WebDriver driver;
	 /*Object Creation for Lib*/
	
	public JavaUtility jlib = new JavaUtility();
	public WebDriverUtility_ wlib = new WebDriverUtility_();
	public FileUtility flib = new FileUtility();
	public ExcelUtility elib = new ExcelUtility();
	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void configBS() {
	 
	System.out.println("========================connect to DB========================");
	 
	}
	//@Parameters("BROWSER")
	@BeforeClass(groups= {"smokeTest","regressionTest"})
//	public void configBC(String	BROWSER) throws Throwable {
		//String Browser = flib.getPropertyKeyValue("BROWSER");
		//driver=new FirefoxDriver();
	
//		if(BROWSER.equals("Chrome")) {
//			 driver = new ChromeDriver();
//			}else if(BROWSER.equals("Firefox")) {
//			driver = new FirefoxDriver();
//			}else {
//		driver = new ChromeDriver();
//			}
	public void configBC() throws Throwable {
	System.out.println("=== 	==========Launch the Browser=======");
	//String Browser = flib.getPropertyKeyValue("BROWSER");
	//**for cmd maven parameter**//
	String Browser = System.getProperty("BROWSER");
	System.out.println(Browser);
	 driver = new ChromeDriver();
	wlib.waitForElementInDOM(driver);
	driver.manage().window().maximize();
	}
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void configBM() throws Throwable {
	/*common Data*/
	String USERNAME = flib.getPropertyKeyValue("username");
	String PASSWORD = flib.getPropertyKeyValue("password");
	String URL = flib.getPropertyKeyValue("url");
	//String BROWSER = flib.getPropertyKeyValue("BROWSER");
	/* Navigate to app*/
	 driver.get(URL);
	 /* step 1 : login */
	 LoginPage lp = new LoginPage(driver);
	 lp.LoginToApp(USERNAME, PASSWORD, URL);
	}
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void configAM() {
	 /*step 6 : logout*/
	HomePage hp = new HomePage(driver);
	 hp.logou();
	}
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void configAC() {
	System.out.println("=============Close the Browser=======");
	driver.quit();
	}
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void configAS() {
	System.out.println("========================close DB========================");
	}
}
