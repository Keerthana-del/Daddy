package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	/**
	 * This method used to read data from excel by specifing sheetname, row number and cell number  
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Throwable
	 */
	public static String getExcelData(String sheetname,int rownum,int cellnum) throws Throwable
	{
		FileInputStream fip=new FileInputStream(".\\Data\\testData.xlsx");
		Workbook workbook= new WorkbookFactory().create(fip);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		return cell.getStringCellValue();	
	}
	public static String getExcelData(String sheetname) throws Throwable
	{
		FileInputStream file=new FileInputStream(".\\Data\\testData.xlsx");
		Workbook workbook=new WorkbookFactory().create(file);
	
		Sheet sheet = workbook.getSheet(sheetname);
		
		
		return null;
		
	}

}
