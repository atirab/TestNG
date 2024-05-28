package BasicTests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Owner/Documents/Atira/Projects/WebTable.html");
		
		int rows = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		int cols = driver.findElements(By.xpath("/html/body/table/tbody/tr/th")).size();
		//System.out.print(rows);
		
		for (int i=2;i<=rows;i++) {
			for (int j=1;j<=cols;j++) {
				
				System.out.print( driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText() + " ");
				
				
			}
			System.out.println();
			
		}
		
		driver.quit();
		
		

	}

}
