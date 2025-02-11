package TestNGTests;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;		
import org.testng.ITestListener;		
import org.testng.ITestResult;		

public class Listener extends Screenshot implements ITestListener						
{		

    @Override		
    public void onFinish(ITestContext Result) 					
    {		
                		
    }		

    @Override		
    public void onStart(ITestContext Result)					
    {		
            		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
    {		
    		
    }		

    // When Test case get failed, this method is called.		
    @Override		
    public void onTestFailure(ITestResult Result) 					
    {		
    
    	WebDriver driver = null;
    	String testName = Result.getName().toString().trim();
    
    System.out.println("The name of the testcase failed is :"+Result.getName());

		
		
				try {
					driver = (WebDriver)Result.getTestClass().getRealClass().getField("driver").get(Result.getInstance());
					takeScreenshot(driver,testName);
				} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException
						| SecurityException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				
		 
	
    }		

    // When Test case get Skipped, this method is called.		
    @Override		
    public void onTestSkipped(ITestResult Result)					
    {		
    System.out.println("The name of the testcase Skipped is :"+Result.getName());					
    }		

    // When Test case get Started, this method is called.		
    @Override		
    public void onTestStart(ITestResult Result)					
    {		
    System.out.println(Result.getName()+" test case started");					
    }		

    // When Test case get passed, this method is called.		
    @Override		
    public void onTestSuccess(ITestResult Result)					
    {		
    System.out.println("The name of the testcase passed is :"+Result.getName());					
    }		

}	