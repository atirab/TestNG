package BasicTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoImage {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver",
				"C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/img"));
	Screenshot logoscreenshot= new AShot().takeScreenshot(driver,logo);
	
	ImageIO.write(logoscreenshot.getImage(), "png",new File("C://Desktop/Logo.png"));
	
	File f=new File("C://Desktop/Logo.png");
	
	if(f.exists())
	{
		System.out.println("Captured");
		}
	else {
		System.out.println("Not Captured");
	}
	}

}
