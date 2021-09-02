package ExcelDrive;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRevertMultiple {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File src= new File("E:\\sagar laptop\\cucumber jars\\TestData.xlsx");
		FileInputStream file=new FileInputStream(src);
		XSSFWorkbook work=new XSSFWorkbook(file);
		XSSFSheet sheet1=work.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		System.out.println("Total rows"+rowcount);
		
		for(int i=0; i<rowcount; i++)
		{
		String data=sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("Testdata from excel is "+data);
		
		System.out.println();
		}
		
		
		 
		

	}

}
