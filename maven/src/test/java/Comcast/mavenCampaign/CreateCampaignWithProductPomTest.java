package Comcast.mavenCampaign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Com.Crm.Rugops.Genericutility.BaseClass;
import Com.Crm.Rugops.Genericutility.ExcelUtility;
import Com.Crm.Rugops.Genericutility.FileUtility;
import Com.Crm.Rugops.Genericutility.JavaUtility;
import Com.Crm.Rugops.Genericutility.WebDriverUtility_;
import Com.Crm.Rugops.PomRepositorylibrary.CampaignInformationPage;
import Com.Crm.Rugops.PomRepositorylibrary.CampaignPage;
import Com.Crm.Rugops.PomRepositorylibrary.CreateNewCampaignPage;
import Com.Crm.Rugops.PomRepositorylibrary.HomePage;
import Com.Crm.Rugops.PomRepositorylibrary.LoginPage;
import Com.Crm.Rugops.PomRepositorylibrary.NewProductPage;
import Com.Crm.Rugops.PomRepositorylibrary.ProductInformationPage;
import Com.Crm.Rugops.PomRepositorylibrary.ProductPage;

public class CreateCampaignWithProductPomTest extends BaseClass {
		
	@Test(groups = {"smokeTest"})
	public void CreateproductwithCampaigtestngTest() throws Throwable
	{
	//LoginPage log=new LoginPage(driver);
	//log.LoginToApp(username, password);
	 String productname = elib.getDataFromExcel("sheet1", 2, 4);
	String campaignname = elib.getDataFromExcel("sheet1", 2, 5);
	HomePage hp=new HomePage(driver);
	hp.setproduct();
	ProductPage pp=new ProductPage(driver);
	pp.productimg();
	NewProductPage np=new NewProductPage(driver);
	np.productmadatory(productname);
	ProductInformationPage pi=new ProductInformationPage(driver);
	String act = pi.getproductinfor();
//	if(act.contains(productname))
//		System.out.println("test case passed");
//	else
//		System.out.println("test case failed");
	Assert.assertTrue(act.contains(productname));
	Reporter.log("testcase is pass,product successful",true);
	hp.mouseonmore();
	hp.setcampaign();
	CampaignPage cp=new CampaignPage(driver);
	cp.CreateCampaign();
	CreateNewCampaignPage cncp=new CreateNewCampaignPage(driver);
	 
	cncp.lookupCampaign(campaignname, productname);
	wlib.waitForElementInDOM(driver);
	CampaignInformationPage ci=new CampaignInformationPage(driver);
	String actcamp = ci.verifyCampign();
//	if(actcamp.contains(campaignname)) {
//		System.out.println("pass");
//		
//	}
//	else {
//		System.out.println("fail");
//	}
	Assert.assertTrue(actcamp.contains(campaignname));
	Reporter.log("test case pass,campaingn pass",true);
}
}