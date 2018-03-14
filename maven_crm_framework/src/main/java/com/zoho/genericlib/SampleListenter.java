package com.zoho.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListenter implements ITestListener{

	
	@Override
	public void onTestFailure(ITestResult t) {
		String failedTestNAme = t.getMethod().getMethodName();
        EventFiringWebDriver driver = new EventFiringWebDriver
        		                           (BaseClass.driver);
        File src = driver.getScreenshotAs(OutputType.FILE);
        File dst = new File(".\\screenshot\\"+failedTestNAme+".png");
        
			try {
				FileUtils.copyFile(src, dst);
			} catch (IOException e) {
				e.printStackTrace();
			}
		                
	
	}
	
	@Override
	public void onFinish(ITestContext arg0) {
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}



	@Override
	public void onTestSkipped(ITestResult arg0) {
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		
	}
	

}
