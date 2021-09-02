package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilityForMultiple {
	static int i;
	
	public static String getMultipleCellData(String sheetnames, int rownos, int cellnos) throws IOException
	{
		File src= new File("E:\\sagar laptop\\cucumber jars\\TestData.xlsx");
		FileInputStream file=new FileInputStream(src);
		XSSFWorkbook work=new XSSFWorkbook(file);
		XSSFSheet sheet=work.getSheet(sheetnames);
		int rowcount=sheet.getLastRowNum();
		System.out.println("Total rows"+rowcount);
		
		for(i=0; i<rowcount; i++)
		{
		String data1=sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println("Testdata from excel is "+data1);
		
		}
		return sheetnames;
		}
		
	}


