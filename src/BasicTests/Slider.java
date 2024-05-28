package BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize()	;	
		driver.switchTo().frame(0);
		WebElement slide = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions act = new Actions(driver);

		
		act.moveToElement(slide).dragAndDropBy(slide,50,150).perform();
	}
	}


