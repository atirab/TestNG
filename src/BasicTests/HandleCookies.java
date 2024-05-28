package BasicTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.Cookie;
public class HandleCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Owner//Desktop//Geek Squad Data Transfer//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://easyupload.io/");
		Set<Cookie> cookies = driver.manage().getCookies();
		
		System.out.println(cookies.size());
		
		for(Cookie i:cookies) {
			System.out.println("Name: "+i.getName()+" Value: "+i.getValue());
			System.out.println();
		}
		
		//add a cookie to the browser
		Cookie cobj = new Cookie("AtiraCookie","Chocochip");
		driver.manage().addCookie(cobj);	
	
	cookies = driver.manage().getCookies();
	
	System.out.println(cookies.size());
	
	for(Cookie i:cookies) {
		System.out.println("Name: "+i.getName()+" Value: "+i.getValue());
		System.out.println();
	}
	
	//delete the cookie
	
	driver.manage().deleteCookie(cobj);	

cookies = driver.manage().getCookies();

System.out.println(cookies.size());

for(Cookie i:cookies) {
	System.out.println("Name: "+i.getName()+" Value: "+i.getValue());
	System.out.println();
}
	
	}  

}
