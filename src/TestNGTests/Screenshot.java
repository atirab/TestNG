package TestNGTests;

import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;


public class Screenshot {
	
	//take screenshot of whole page
	public void takeScreenshot(WebDriver driver,String testName) throws IOException {
		try {
		
    
                File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);       

                String DestFile=System.getProperty("user.dir"+"\\Screenshots\\"+testName+".png");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, new File(DestFile));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
		
	}
	
	//take screenshot a particular element


