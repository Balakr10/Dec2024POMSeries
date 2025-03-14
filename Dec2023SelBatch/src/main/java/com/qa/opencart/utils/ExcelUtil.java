package com.qa.opencart.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.qa.opencart.constants.AppConstants;

public class ExcelUtil {
	
	private static String TEST_DATA_PATH = "./src/test/resources/testdata/Testdata.xlsx";
	private static Workbook book;
	private static Sheet sheet;
	
	public static Object[][] getTestData(String sheetname) {
		
		Object data[][] = null;
		
		FileInputStream ip;
		try {
			ip = new FileInputStream(TEST_DATA_PATH);
			book = WorkbookFactory.create(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		 catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		sheet = book.getSheet(sheetname);
		
		data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0; i<sheet.getLastRowNum(); i++) {
			for (int j=0; j<sheet.getRow(0).getLastCellNum(); j++) {
				
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
				
		}
		
		return data;
		
	}
	
	
	
	

}
