package excel;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LoginActitime {
	public static void main(String[] args) throws Throwable {
		String path = "/home/soumyavaio/phone.xls";
		//
		FileInputStream fis = new FileInputStream(path);
		//
		Workbook wb = WorkbookFactory.create(fis);
		//
		Sheet sh = wb.getSheet("Sheet");
		//
		Row row = sh.getRow(0);
		//
		String url = row.getCell(0).getStringCellValue();
		String userName = row.getCell(1).getStringCellValue();
		String password = row.getCell(2).getStringCellValue();
		int i=Integer.parseInt(password);
		System.out.println(url);
		System.out.println(userName);
		System.out.println(password);
		System.out.println(i+1000);
	}

}
