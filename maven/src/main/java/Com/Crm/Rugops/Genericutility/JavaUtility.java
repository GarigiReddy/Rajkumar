package Com.Crm.Rugops.Genericutility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	//it is used for generate random numers
	public int gerRanDomNumber()
	{
Random random=new Random();
int intRandom = random.nextInt();
return intRandom;
	}
	//it is used to get system time and date in IST format
public String getSystemDateAndTime(){
	Date date=new Date();
return	date.toString();
	
}
public String getSystemDateWithFormat() {
	Date date=new Date();
	String dateAndTime = date.toString(); 
	
	  String YYYY=dateAndTime.split("")[5];
	
	String DD=dateAndTime.split("")[2];
	int MM = date.getMonth()+1;
	String FinalFormate = YYYY+"-"+MM+"-"+DD;
	
	return  FinalFormate;
}
}
