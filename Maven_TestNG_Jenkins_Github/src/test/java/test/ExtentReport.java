package test;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport 
{
  @Test
  public void f() 
  {
	  ExtentReports report = null;
	  ExtentTest test = null;
	  
	  
	  report = new ExtentReports("./test-output/AvinashReport.html");
	  test = report.startTest("MavenTest");
	  test.log(LogStatus.PASS	, "FirstStep");
	  test.log(LogStatus.PASS	, "SecondStep");
	  report.endTest(test);
	  if(report != null)
	  {
		  report.flush();
		  report.close();
		  report = null;
	  }
  } 
}

