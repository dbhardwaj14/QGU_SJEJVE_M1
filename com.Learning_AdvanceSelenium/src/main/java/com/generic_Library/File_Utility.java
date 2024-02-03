package com.generic_Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility 
{
public static String getPropertyvalue(String key) throws Throwable
{
//To create Java representation object of external file
FileInputStream fis = new FileInputStream("./src/test/resources/data/commonData.properties");

//This class is used to fetch data from properties file
Properties prop = new Properties();

//This method is used to load all the keys in properties class object 
prop.load(fis);

return prop.getProperty(key);
}

public static String fetchSingleDataFromExcel(String sheetName, int rowNum, int cellNum) throws Throwable
{
	FileInputStream fis = new FileInputStream("./src/test/resources/data/registerScriptData.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet("registerData");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(0);
	return cell.getStringCellValue();
	}

public static Object[][] fetchMultipleDataFromExcel(String sheetName)throws Throwable
{
	FileInputStream fis = new FileInputStream("./src/test/resources/data/registerScriptData.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet(sheetName);
	
	int rowCount = sheet.getPhysicalNumberOfRows();
	int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
	
	Object[][] data = new Object[rowCount-1][cellCount];
	
	for (int i = 1; i < rowCount; i++)
	{
		for (int j = 0; j < cellCount; j++)
		{
			data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
		}
	}
	return data;
	}
} 

