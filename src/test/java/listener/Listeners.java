package listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import demoShopes.qa.util.CurrentDateUtil;
import demoShopes.qa.util.ScreenshotUtil;
import driver.DriverFactory;

public class Listeners implements ITestListener{
	public void onStart(ITestContext context)
	{
		System.out.println("Test execution Started");
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName()+" "+"Execution Started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName()+" "+"PASSED");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName()+" "+"FAILED");
		try {
			ScreenshotUtil.captureScreenshot(DriverFactory.getDriver(),result.getName()+CurrentDateUtil.getCurrentDate());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(result.getName()+" "+"Skipped");
	}
	
	
	public void onFinish(ITestContext context)
	{
		System.out.println("Test execution finished");
	}
	

}
