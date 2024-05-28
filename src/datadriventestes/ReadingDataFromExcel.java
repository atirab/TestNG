package datadriventestes;
import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C://Users/Owner/Documents/Atira/Projects/SalaryData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sh = wb.getSheet("Sheet1"); //or getSheetAt(index)
		
		int rowCount= sh.getLastRowNum();
		
		int colCount = sh.getRow(0).getLastCellNum();
		
		for(int i=0;i <rowCount;i++) {
			
			XSSFRow currRow = sh.getRow(i);			
			for (int j=0; j<colCount;j++) {
				String value = currRow.getCell(j).toString();	
				System.out.print("      "+value);
				
				}
			System.out.println();
		}

	}

}
