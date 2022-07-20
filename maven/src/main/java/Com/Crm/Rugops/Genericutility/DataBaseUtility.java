package Com.Crm.Rugops.Genericutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
static Driver driver;
  static Connection connection;
  static  ResultSet result;
  /**
	 * This method will perform the mysql database connection
	 * @throwsSQLException
	 */

  public void connectDB()throws SQLException{
  try {
	  driver=new Driver();
	  DriverManager.registerDriver(driver);
	 connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
	 
	  
  
}
  catch (SQLException e){
	  e.printStackTrace();
	  
  }
  }
  /**
	 * This method will close the mysql database
	 * @throwsSQLException
	 */

  public void closeDB() {
	  try {
		  connection.close();
	  }
	  catch (Exception e) {
		  
	  }
  }
  /**
	 * This method will execute the querry
	 * @param query
	 * @return
	 * @throwsThrowable
	 */

  public ResultSet executeQuery(String query) throws Throwable {
	 result =connection.createStatement().executeQuery(query);
	return result; 
  }
  /**
	 * This method will execute the querry
	 * @param query
	 * @return
	 * @throwsThrowable
	 */

  public int executeUpdate(String query) throws Throwable 
  {
	int  result=connection.createStatement().executeUpdate(query);
	return  result;
  }
  /**
	 * This method will execute querry based on querry and it will verify the data. 
	 * @paramquerry
	 * @paramcolumnName
	 * @paramexpectedData
	 * @return
	 * @throwsThrowable
	 */

  public boolean executQuerryAndVerify(String querry,int columnName,String expectedData) throws Throwable
  {
	  boolean  flag=false;
	  
	 result =connection.createStatement().executeQuery(querry);
	 while(result.next()) {
	  if(result.getString(columnName).equals(expectedData)) {
		  flag=true;
		  break;
	  }
	 }
	 if(flag) {
		 System.out.println(expectedData+"==>Data is verified in the data base tablr");
	 
	return flag;
	 }
	 else {
		 System.out.println(expectedData+"==>data is not verified in the database ");
		 return flag;
	 }
  } 
}
