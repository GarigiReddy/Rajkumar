package Com.Crm.Rugops.Genericutility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ilistImplementation implements ITestListener {

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String testName = result.getMethod().getMethodName();
		 String date =new Date().toString().replaceAll(":","_");
		System.out.println(testName+"=====Execute & i am Listening====== ");
		EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClass.driver);
		File srcfile = eDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("./screenshot/"+testName+date+".png"));
		}
		catch(IOException e){
		e.printStackTrace();	
	}

}

	
}