package BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize()	;	
		WebElement desktopMenu=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));

		WebElement Mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

		Actions act = new Actions(driver);

		
		act.moveToElement(desktopMenu).moveToElement(Mac).click().perform();
	}

}
