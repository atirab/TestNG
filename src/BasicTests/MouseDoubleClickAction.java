package BasicTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick_addeventlistener");
		WebElement button = driver.findElement(By.xpath("/html/body/p[2]"));
        Actions act= new Actions(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        act.doubleClick(button).perform();//double click action
  
        
	}

}
