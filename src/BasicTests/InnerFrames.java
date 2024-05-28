package BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href=\"#Multiple\"]")).click();
		driver.switchTo().frame(1);
		WebElement innerFr = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerFr);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Atira");
		
		
		
	}

}
