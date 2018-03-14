package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {

	public String getExcelData(String sheetname, int rowNum, int colNum) throws Throwable {
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet(sheetname);
		Row row = st.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();
		fis.close();
		return data;
	}

	public void setExcelData(String sheetname, int rowNum, int colNum, String data) throws Throwable {
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet(sheetname);
		Row row = st.getRow(rowNum);
		Cell cel = row.createCell(colNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./actitime/testData/testData.xlsx");
		wb.write(fos);
		fos.close();
	}

}
