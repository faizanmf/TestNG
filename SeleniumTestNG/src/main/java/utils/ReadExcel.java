package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] getExcelData()   {


		String file = "./TestData/LoginData.xlsx";
		XSSFWorkbook book=null;
		try {
			book = new XSSFWorkbook(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = book.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		System.out.println("no of rows is: " + rows);

		int col = sheet.getRow(3).getLastCellNum();
		System.out.println("no of col is: " + col);

		String[][] data = new String[rows][col];

		for (int i = 1; i <=rows; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < col; j++) {
				XSSFCell cell = row.getCell(j);

				DataFormatter df = new DataFormatter();
				String value=df.formatCellValue(cell);

				//String	value = cell.getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
			} 
		}
		try {
			book.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}