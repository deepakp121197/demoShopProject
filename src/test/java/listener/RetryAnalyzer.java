package listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	int count=0;
	int retryMax=3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(count<retryMax)
		{
			count++;
			return true;
		}
		return false;
	}

}
