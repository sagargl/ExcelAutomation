package Library;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook work;
	XSSFSheet sheet1;
	
	
	public ExcelDataConfig(String excelpath)
	{
		try {
			File src= new File(excelpath);
			FileInputStream file=new FileInputStream(src);
			work=new XSSFWorkbook(file);
			
		 
		} catch (Exception e) {
		 System.out.println(e.getMessage());
		}
	}
	
	public String getData(int sheetNumber, int row, int column)
	{
		sheet1=work.getSheetAt(sheetNumber);
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	public int getRowCount(int sheetIndex)
	{
		int row=work.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
		
	}
}
