package BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//by pixel
		//js.executeScript("window.scrollBy(0,1000)", "");
		
		//till element is visible
		//WebElement element =driver.findElement(By.xpath("//*[@id=\"toc3\"]/strong"));
		//js.executeScript("arguments[0].scrollIntoView()", element);
		
		//to bottom of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		

	}

}
