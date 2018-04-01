package com.zoho.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	String path = "src/test/resources/TestData.xlsx";
	
	/**
	 * It is developed using Apache poi To retrieve Data from Excel sheet
	 * @param sName ,rowNum, colNum
     * @return String data based on the argument
     * its developed using Apache POi , used read the data from .xls
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws EncryptedDocumentException 
	 *  
	 */
	public String getExcelData(String sName, int rowNum, 
			                     int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();
		wb.close();
		return data;
	}
	/**
	 * It is developed using Apache poi To Write Data to Excel sheet
	 * @param sName Sheet Name
	 * @param rowNum Row Number
	 * @param colNum Column Number
	 * @param data Data to Input
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws EncryptedDocumentException
	 *  
	 */
	public void setExcelData(String sName, int rowNum, 
			          int colNum,String data) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(colNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}
}



