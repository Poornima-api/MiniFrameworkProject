package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	static String path = "src/test/resources/testResources/LoginInfo.xlsx";

	public static String getData(int row, int cell) {

		try {

			FileInputStream fis = new FileInputStream(path);

			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workbook.getSheet("Sheet1");

			return sheet.getRow(row).getCell(cell).getStringCellValue();

		} catch (Exception e) {

			return "";
		}
	}

	public static void writeData(int rowNum, int cellNum, String value) {
		try {

			FileInputStream fis = new FileInputStream(path);

			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workbook.getSheet("Sheet1");

			XSSFRow row = sheet.getRow(rowNum);

			if (row == null) {
				row = sheet.createRow(rowNum);
			}

			XSSFCell cell = row.createCell(cellNum);

			cell.setCellValue(value);

			FileOutputStream fos = new FileOutputStream(path);

			workbook.write(fos);

			fos.close();
			workbook.close();

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int getNextRowNumber() {
		try {
			FileInputStream fis = new FileInputStream(path);

			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workbook.getSheet("Sheet1");

			int nextRow = sheet.getLastRowNum() + 1;

			workbook.close();

			return nextRow;
		} catch (Exception e) {
			return 1;
		}
	}
}
