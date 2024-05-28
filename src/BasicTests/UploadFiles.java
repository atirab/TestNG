package BasicTests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class UploadFiles {
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://easyupload.io/");
		WebElement button = driver.findElement(By.xpath("/html/body/main/div/div[1]/div[3]/form/div[2]/button"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",button);//perform click action on button
		//copy the path of file
		Robot rb= new Robot();	
		rb.delay(2000);
		
		//these two statements will copy the file (ctrl +c)
		StringSelection ss = new StringSelection("C:\\Users\\Owner\\test.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);	
		//paste the file - ctrl+v
		rb.keyPress(KeyEvent.VK_CONTROL); //press ctrl key in keyboard
		rb.keyPress(KeyEvent.VK_V); //press v in keyboard
		//release the keys
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		//click open(press enter)
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
