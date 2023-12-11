package utility;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentBB {
	public static ExtentReports getreport() {
		ExtentSparkReporter extent=new ExtentSparkReporter("./reportsBB/report.html");
	extent.config().setReportName("BestBuy");
	extent.config().setDocumentTitle("Bestbuytitle");
	
	ExtentReports report= new ExtentReports();
	report.attachReporter(extent);
	return report;
	

}
}


