package ExcelDrive;

import Library.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ExcelDataConfig excelconfig=new ExcelDataConfig("E:\\sagar laptop\\cucumber jars\\TestData.xlsx");
		
		System.out.println(excelconfig.getData(0, 0, 1));
		System.out.println(excelconfig.getRowCount(0));
	}

}
