package BasicTests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetCommands {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String expectedtext="SIGN-ON";
		String actualtext = driver.findElement(By.xpath("//a[contains(.,'SIGN-ON')]")).getText();
		if (actualtext.equals(expectedtext)){
            System.out.println("User still not signed in");
        } else {
            System.out.println("User signed in!!");
        }
		driver.quit();
		
		

	}
	
	

}

