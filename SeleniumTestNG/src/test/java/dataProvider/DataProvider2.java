package dataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class DataProvider2 {
	@DataProvider(name="testCase")
	public String[][] getData() 
	{
		//String[][] data = new String[2][2];

		String[][] excelData = ReadExcel.getExcelData();

				//		data[0][0] = "student";
				//		data[0][1] = "Password123";
				//
				//		data[1][0] = "studentqwe";
				//		data[1][1] = "Password123";

				return excelData;

	}
}
