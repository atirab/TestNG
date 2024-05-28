package BasicTests;

import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindBrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// capture all links from webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {

			WebElement element = links.get(i);
			String url = element.getAttribute("href");// we can get the URL
			try {

				URL link = new URL(url);
				// create a connection using URL object
				HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
				Thread.sleep(350);
				 httpconn.connect();
				 int resCode = httpconn.getResponseCode();
			}
			
			catch (UnknownHostException uhe) {
				System.out.println(url + " " + "Broken Link Alert");
				break;
			}
			


		}

	}

}
