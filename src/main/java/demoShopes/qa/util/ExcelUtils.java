package demoShopes.qa.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static FileInputStream fis;
	private static XSSFWorkbook book;
	private static XSSFSheet sheet;
	
	public static void loadExcel(String excelpath, String sheetname) throws IOException
	{
	 fis = new FileInputStream(excelpath);
	 book = new XSSFWorkbook(fis);
	 sheet = book.getSheet(sheetname);
	}
	
	public static String getCellData(int rowNum, int cellNum)
	{
		XSSFRow row = sheet.getRow(rowNum);
		XSSFCell cell = row.getCell(cellNum);
		return cell.getStringCellValue();
	}

	public static int getLastRow()
	{
		return sheet.getLastRowNum();
	}
	
	public static int getLastCell(int rowNum)
	{
		XSSFRow row = sheet.getRow(rowNum);
		return row.getLastCellNum();
	}
	
	public static void closeExcel() throws IOException {
		book.close();
		fis.close();
	}
}
