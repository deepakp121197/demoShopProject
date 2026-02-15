package testdataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demo.qa.constants.ApplicationConstants;
import demoShopes.qa.util.ExcelUtils;

public class ReadExcelData implements ApplicationConstants{
	
	@DataProvider(name = "registerdata")
	public String[][] registerData() throws IOException
	{
		ExcelUtils.loadExcel(excelpath, excelsheet);
		
		int rows = ExcelUtils.getLastRow();
		int cells = ExcelUtils.getLastCell(0);
		
		String[][] data = new String[rows+1][cells];
		
		for(int r=0; r<= rows; r++) {
			for(int c=0; c< cells; c++) {
				data[r][c] = ExcelUtils.getCellData(r, c);
			}
		}
		
		ExcelUtils.closeExcel();
		
		
		return data;
	}

}
