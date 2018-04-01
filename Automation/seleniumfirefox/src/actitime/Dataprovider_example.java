package actitime;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_example {
	static String getexcel(String sheet, int row, int cell) throws Throwable, InvalidFormatException, IOException {
		String data;
		String path = "/home/soumyavaio/phone.xls";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row rw = sh.getRow(row);
		data = rw.getCell(cell).getStringCellValue();
		return data;
	}

	@Test(dataProvider="exceldata")
	public void display(String phone)
	{
		System.out.println("phone number: "+phone);
	}
	@DataProvider
	public Object[] exceldata() throws Throwable, Throwable, Throwable
	{
		Object[] objarr=new Object[10];
		for(int i=0;i<10;i++)
		{
			objarr[i]=getexcel("Sheet",i,0);
		}
		return objarr;
		
	}
}
