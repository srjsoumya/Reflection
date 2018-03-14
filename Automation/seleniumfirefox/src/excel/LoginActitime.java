package excel;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LoginActitime {
	public static void main(String[] args) throws Throwable {
		String path="E:\\excel\\LoginActitime.xlsx";
		//
		FileInputStream fis=new FileInputStream(path);
		//
		Workbook wb=WorkbookFactory.create(fis);
		//
		Sheet sh=wb.getSheet("Sheet1");
		//
		Row row=sh.getRow(1);
		//
		String url=row.getCell(2).getStringCellValue();
		String userName=row.getCell(3).getStringCellValue();
		String Password=row.getCell(4).getStringCellValue();
		System.out.println(url);
		System.out.println(userName);
		System.out.println(Password);
	}

}
