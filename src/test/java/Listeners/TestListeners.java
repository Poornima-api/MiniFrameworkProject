package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import Base.BaseTest;
import Utilities.ExtentManager;
import Utilities.ScreenshotUtility;

public class TestListeners implements ITestListener {
	@Override
	public void onTestSuccess(ITestResult result)
	{
		BaseTest base=(BaseTest)result.getInstance();
		ExtentTest test=base.test;
		String path = ScreenshotUtility.captureScreenshot(
                base.driver,
                result.getName());

        test.pass("Test Passed",MediaEntityBuilder.createScreenCaptureFromPath(path).build());
    }
	public void onTestFail(ITestResult result)
	{
		BaseTest base=(BaseTest)result.getInstance();
		ExtentTest test=base.test;
		String path=ScreenshotUtility.captureScreenshot(base.driver, result.getName());
		test.fail("Test failed",MediaEntityBuilder.createScreenCaptureFromBase64String(path).build());
	}
	@Override
	public void onFinish(ITestContext context)
	{
		BaseTest.extent.flush();
	}
}

