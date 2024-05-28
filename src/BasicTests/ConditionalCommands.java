package BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		WebElement usrname = driver.findElement(By.name("userName"));
		
		if(usrname.isDisplayed() && usrname.isEnabled()) {
			usrname.sendKeys("autotest");
		}
		
		WebElement pwd = driver.findElement(By.name("password"));
		
		if(pwd.isDisplayed() && pwd.isEnabled()) {
			pwd.sendKeys("autotest");
		}
		
		driver.findElement(By.name("submit")).click();
		
		driver.quit();
	}

}
