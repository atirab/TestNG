package datadriventestes;
import java.io.*;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SICalculator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C://Users/Owner/Documents/Atira/Projects/FDdata.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sh = wb.getSheet("Sheet1"); //or getSheetAt(index)
		
		int rowCount= sh.getLastRowNum();
		
		int colCount = sh.getRow(0).getLastCellNum();
		
		System.setProperty("webdriver.chrome.driver","C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		
		for(int i=1;i <=rowCount;i++) {
			
			XSSFRow currRow = sh.getRow(i);			
			int Principal = (int) currRow.getCell(0).getNumericCellValue();
			int ROI = (int)currRow.getCell(1).getNumericCellValue();
			int Period = (int)currRow.getCell(2).getNumericCellValue();
			String Frequency = currRow.getCell(3).getStringCellValue();
			double Maturity = (double)currRow.getCell(4).getNumericCellValue();
			driver.findElement(By.name("principal")).sendKeys(String.valueOf(Principal));
			driver.findElement(By.name("interest")).sendKeys(String.valueOf(ROI));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(Period));
			
			
			Select period = new Select(driver.findElement(By.id("tenurePeriod")));
			period.selectByVisibleText("year(s)");
			
			Select freq = new Select(driver.findElement(By.id("frequency")));
			freq.selectByVisibleText("Simple Interest");
			
			//driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]")).click();
			
			String actual_value = driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
			
			
			if (Double.parseDouble(actual_value) ==Maturity) {
				
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
			
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
					
		}
		
		driver.quit();		
		

	}

}
