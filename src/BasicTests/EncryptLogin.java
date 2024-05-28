package BasicTests;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncryptLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("autotest");
		
       String str="YXV0b3Rlc3Q=";
		
		byte[] decodedstr = Base64.decodeBase64(str.getBytes());
		
		driver.findElement(By.name("password")).sendKeys(new String(decodedstr));
	
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
