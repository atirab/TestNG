package BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class VerifyDropDownSortedOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.id("country"));
		Select se=new Select(element);
		
		List drplist = new ArrayList();
		
		List <WebElement>options = se.getOptions();
		
		for(WebElement e:options) {
			drplist.add(e.getText());
		}
		
		System.out.println(drplist);
		
	List templist = new ArrayList();
		
		List <WebElement>options2 = se.getOptions();
		
		for(WebElement e:options2) {
			templist.add(e.getText());
		}
		
	
	
		
		Collections.sort(templist);
		
		
		System.out.println(templist);
		
	    if (drplist==templist) {
	    	System.out.println("Dropdown is sorted");
	    }
	    else {
	    	System.out.println("Dropdown is not sorted");
	    }
	    
	    driver.quit();
	}

}
