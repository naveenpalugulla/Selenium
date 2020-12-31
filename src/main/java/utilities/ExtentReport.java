package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	ExtentHtmlReporter reporter;
	ExtentReports extent ;
	ExtentTest logger;
	public void cretaeTest(String test) {
		reporter=new ExtentHtmlReporter("./Reports/learn_automation1.html");
		extent = new ExtentReports();
	    extent.attachReporter(reporter);
        logger=extent.createTest(test);
	}
    


}
