package Com.Crm.Rugops.Genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * its developed using Apache POilibraries , which used to handle Microsoft Excel sheet
 * @author
 *
 */

public class ExcelUtility {
	/**
	 *  its used read the data from excel base don below arguments 
	 * @paramsheetName
	 * @paramrowNum
	 * @paramcelNum
	 * @return Data
	 * @throwsThrowable
	 */


	
public String  getDataFromExcel(String sheetName,int rowNum,int celNum) throws Throwable
{
	FileInputStream fis=new FileInputStream("./Data/practice.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row row = sh.getRow(rowNum);
	 String data = row.getCell(celNum).getStringCellValue();
	 wb.close();
	 return data;
	 

	}
/**
 * used to get the last used row number on specified Sheet
 * @paramsheetName
 * @return
 * @throwsThrowable
*/
public int getRowCount(String sheetName) throws Throwable
{
	FileInputStream fis=new FileInputStream("./Data/practice.xlsx");
	Workbook  wb=WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	wb.close();
	 return sh.getLastRowNum();
}
public void setDataExcel(String sheetName,int rowNum,int celNum,String data) throws Throwable
{
	FileInputStream fis=new FileInputStream("./Data/practice.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row row = sh.getRow(rowNum);
	Cell cel = row.createCell(celNum);
	cel.setCellValue(data);
	FileOutputStream fos=new FileOutputStream("./Data/practice.xlsx");
	wb.write(fos);
	wb.close();
}
}
