package BasicTests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("autotest");
		driver.findElement(By.name("password")).sendKeys("autotest");
		driver.findElement(By.name("submit")).click();
		String expectedtext="Login Successfully";
		String actualtext = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();
		if (actualtext.equals(expectedtext)){
            System.out.println("User succesfully logged in");
        } else {
            System.out.println("Invalid credtendials!!");
        }
		driver.quit();
		
		

	}

}
