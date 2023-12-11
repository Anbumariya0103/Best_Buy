package base;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.Utilityclass2;

public class ProjectSpecification extends Utilityclass2 {

	  @Parameters({"browser","url"})
	  @BeforeMethod
	  public void browserLaunch(String browser, String url) {
		  
		  launchbrowser(browser, url);
		  
	  }
		
	  public static int getResponseCode(String url) throws Exception, Exception {
			URL link = new URL(url);
			HttpURLConnection connect = (HttpURLConnection) link.openConnection();
			// connect.setRequestMethod("Head");
			// connect.connect();
			int responseCode = connect.getResponseCode();
			return responseCode;
		}
	  @DataProvider(name = "getData")
		public Object[][] getData() throws IOException {
			
		  Object[][] data = readExcel(excelfile);
			return data;
		}
	  
	 @AfterMethod  
	  public void closeBrowser() { 
		 driver.close();
		 driver.quit();
		  
	  }
}