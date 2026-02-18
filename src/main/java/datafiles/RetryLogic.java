package datafiles;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {
    int initalcount = 0;
    int retrycount = 1;
	@Override
	public boolean retry(ITestResult result) {
		while(initalcount < retrycount) {
			initalcount++;
		return true;	
		}
		return false;
	}

}
