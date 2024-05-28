package BasicTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));

		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));

		Actions act = new Actions(driver);

		// Dragged and dropped.
		act.dragAndDrop(From, To).perform();
	}

}
