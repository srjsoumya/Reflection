package newpackage;

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

class Excel {

	/**
	 * @param path
	 *            Path of Excel file
	 * @param sheet
	 *            SheetName Of Excel file
	 * @param row
	 *            Row Number of Excel File
	 * @param cell
	 *            Cell number Of Excel File
	 * @return String Value present in excel file
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	public String getExcel(String path, String sheet, int row, int cell)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row r = sh.getRow(row);
		String str = r.getCell(cell).getStringCellValue();
		fis.close();
		return str;
	}

	/**
	 * @param path
	 *            Path of Excel file
	 * 
	 * @param sheet
	 *            SheetName Of Excel file
	 * @param row
	 *            Row Number of Excel File
	 * @param cell
	 *            Cell number Of Excel File
	 * @param data
	 *            String data to write into the Excel file
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	public void setExcel(String path, String sheet, int row, int cell, String data)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row r = sh.getRow(row);
		Cell cel = r.createCell(cell);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();
	}

}

/**
 * 
 * @author SOUMYA
 *
 */
public class ExcelReadWrite {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		Excel excel = new Excel();
		String path = "testdata/testdata.xlsx";
		System.out.println(excel.getExcel(path, "Sheet1", 0, 0));
		System.out.println(excel.getExcel(path, "Sheet1", 0, 1));
		System.out.println(excel.getExcel(path, "Sheet1", 0, 2));
		System.out.println(excel.getExcel(path, "Sheet1", 0, 3));
		System.out.println(excel.getExcel(path, "Sheet1", 0, 4));
		excel.setExcel(path, "Sheet1", 0, 5, "Selenium");
		System.out.println(excel.getExcel(path, "Sheet1", 0, 5));
		excel.setExcel(path, "Sheet1", 0, 6, "Selenium IDE");
		System.out.println(excel.getExcel(path, "Sheet1", 0, 6));
		excel.setExcel(path, "Sheet1", 0, 7, "Selenium RC");
		System.out.println(excel.getExcel(path, "Sheet1", 0, 7));

	}

}
