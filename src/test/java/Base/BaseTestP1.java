package Base;

import org.openqa.selenium.WebDriver;
import org.apache.commons.collections4.Get;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTestP1 {

	WebDriver driver;
	Logger logger = LogManager.getLogger(this.getClass());
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeSuite
	void Report() {
		ExtentSparkReporter spark= new ExtentSparkReporter("./reports/extentreport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}
	@BeforeMethod
	void Setup() {
		test =extent.createTest("test76");
		driver = new ChromeDriver();
		logger.info("open the browser");
		test.info("open the browser");
		driver.manage().window().maximize();
		logger.info("max the browser");
		test.info("max the browser");		
		driver.get("https://trytestingthis.netlify.app/");
		logger.info("navigate to url"+driver.getCurrentUrl());
		test.info("navigate to url"+driver.getCurrentUrl());
	}
	
	@AfterMethod
	void close() {
		//driver.quit();
	}
	
	@AfterSuite
	void compl_report() {
		extent.flush();
	}
	
}