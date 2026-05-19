package Utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	    public static String getData(int row, int cell) {

	        String path = "src/test/resources/testResources/LoginInfo.xlsx";

	        try {

	            FileInputStream fis = new FileInputStream(path);

	            XSSFWorkbook workbook = new XSSFWorkbook(fis);

	            XSSFSheet sheet = workbook.getSheet("Sheet1");

	            return sheet.getRow(row).getCell(cell).getStringCellValue();

	        } catch (Exception e) {

	            return "";
	        }
	    }
	}

