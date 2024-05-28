package BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
