package TestNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	public static WebDriver driver;
  @Test(priority=1)
  public void testPass() {
	  driver = new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver",
				"C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		
		driver.get("https://demo.guru99.com/test/newtours/");
		String title = 	driver.getTitle();
		Assert.assertEquals("Welcome: Mercury Tours",title);
	
  }
  @Test(priority=2)
  public void testFail() {
	  driver = new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver",
				"C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		
		driver.get("https://demo.guru99.com/test/newtours/");
		String title = 	driver.getTitle();
		Assert.assertEquals("hdwqhdjk: Mercury Tours",title);
		
  }
}
