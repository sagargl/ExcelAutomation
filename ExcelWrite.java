package ExcelDrive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

public static void main(String[] args) throws IOException {
	/*File src= new File("E:\\sagar laptop\\cucumber jars\\TestData.xlsx");
	FileInputStream file=new FileInputStream(src);
	XSSFWorkbook work=new XSSFWorkbook(file);
	XSSFSheet sheet1=work.getSheet("Sheet1");
	int row=sheet1.getLastRowNum();
	System.out.println("Total row count"+row);
	for(int i=0; i<=row; i++) 
	{

		String data=sheet1.getRow(i).getCell(0).getStringCellValue();
	
	//String data=sheet1.getRow(0).getCell(1).getStringCellValue();
	System.out.println(" Data from excel " +data);

}
	*/
	
	/*File src= new File("E:\\sagar laptop\\cucumber jars\\TestData.xlsx");
	FileInputStream file=new FileInputStream(src);
	XSSFWorkbook work=new XSSFWorkbook(file);
	XSSFSheet sheet1=work.getSheet("Sheet1");
	XSSFRow row=sheet1.getRow(0);
	XSSFCell cell=row.getCell(1);
	cell.setCellType(cell.CELL_TYPE_STRING);
	cell.setCellValue("soogggg");
	FileOutputStream file_out=new FileOutputStream(src);
	work.write(file_out);
	System.out.println("End of writing");
	
	*/
	
	File src= new File("E:\\sagar laptop\\cucumber jars\\TestData.xlsx");
	FileInputStream file=new FileInputStream(src);
	XSSFWorkbook work=new XSSFWorkbook(file);
	XSSFSheet sheet1=work.getSheet("Sheet1");
	int row=sheet1.getLastRowNum();
	
	System.out.println("Total rows" +row);
	for(int i=0; i<=row; i++)
	{
		XSSFRow rows=sheet1.getRow(i);
		//XSSFRow rowss=sheet1.createRow(i);
		int cellno=rows.getLastCellNum();
		for(int j=0; j<cellno; j++)
		{
			//XSSFCell cell=rows.getCell(j);
			XSSFCell cells=rows.createCell(j);
			String str1=cells.getStringCellValue();
			System.out.println(str1);
			cells.setCellValue("afsfdsf");
			FileOutputStream file_out=new FileOutputStream(src);
			work.write(file_out);
		}
	}
	
	/*XSSFCell cell=row.getCell(1);
	cell.setCellType(cell.CELL_TYPE_STRING);
	cell.setCellValue("soogggg");
	FileOutputStream file_out=new FileOutputStream(src);
	work.write(file_out);
	System.out.println("End of writing");*/
}
}

