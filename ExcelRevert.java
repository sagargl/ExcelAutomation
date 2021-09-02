package ExcelDrive;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRevert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File src= new File("E:\\sagar laptop\\cucumber jars\\TestData.xlsx");
		FileInputStream file=new FileInputStream(src);
		XSSFWorkbook work=new XSSFWorkbook(file);
		//XSSFSheet sheet1=work.getSheetAt(0);
		XSSFSheet sheet1=work.getSheet("sheet2");
		String data=sheet1.getRow(2).getCell(2).getStringCellValue();
		System.out.println(" Data from excel " +data);
	
	}

}
