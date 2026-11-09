package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;
import utils.ScreenshotUtil;
import utils.BaseTest;
import reports.ExtentReportManager;


public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        ExtentReportManager.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentReportManager.getTest().pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        ExtentReportManager.getTest().fail(result.getThrowable());

        BaseTest baseTest = (BaseTest) result.getInstance();

        String screenshotPath = ScreenshotUtil.captureScreenshot(
                baseTest.getDriver()
        );

        if (screenshotPath != null) {
            ExtentReportManager.getTest()
                    .addScreenCaptureFromPath(screenshotPath);
        }
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentReportManager.getTest().skip(result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReportManager.flush();
    }

}
