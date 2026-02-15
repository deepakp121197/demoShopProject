package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import demoShopes.qa.util.AllureUtil;

public class AllureListeners implements ITestListener{
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
	System.out.println(result.getName()+" "+"FAILED from AllureListeners");
//        System.out.println(DriverFactory.getDriver());
//        AllureUtil.attachLog("Registration assertion failed");
		//AllureUtil.attachScreenshot(DriverFactory.getDriver());
		
		AllureUtil.attachScreenshot();
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
