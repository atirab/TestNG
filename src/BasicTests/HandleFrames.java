package BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		driver.manage().window().maximize();
		
		//total number of frames
		int count = driver.findElements(By.tagName("iframe")).size();
		
		//switching to iframes
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[1]")).click();
		String tempText = driver.findElement(By.xpath("//*[@id=\"main\"]/h1/span")).getText();
		
		if (tempText.equals("Tutorial")) {
			
			System.out.println("Pass");
		}
		
		else {
			System.out.println("Fail");
		}
	    driver.switchTo().defaultContent();
	    
	    driver.quit();
	    }

}
