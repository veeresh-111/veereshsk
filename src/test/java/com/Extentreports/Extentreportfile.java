package com.Extentreports;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class Extentreportfile {
	@Test
	public void extenttest()
	{
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");// html file report generated
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("MyReport");
        spark.config().setReportName("Extent Report Demo");
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Login test").assignAuthor("veeresh").assignCategory("smoke").assignCategory("regression").assignDevice("firefox 84");// create a test node in report
		test.pass("Login test started successfully");// create test node steps in report
		test.info("URL IS loaded");
		test.info("values entered");
		test.pass("Login test completed successfully");
		ExtentTest test1=extent.createTest("Homepage test").assignAuthor("KL rahul").assignAuthor("dravid").assignCategory("regression").assignDevice("chrome 64");// create a test node in report
		test1.pass("Homepage test started successfully");// create test node steps in report
		test1.info("URL IS loaded");
		test1.info("values entered");
		test1.fail("Homepage test failed misarebly");
        extent.flush();// unless you call this method, your report will be written with logs
	}
}
