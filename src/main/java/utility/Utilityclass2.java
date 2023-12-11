package utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Utilityclass2 {
	public static WebDriver driver;
	 public String excelfile; 
	public void launchbrowser(String browser, String url) {
	 ChromeOptions option=new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver(option);}
	  else if(browser.equalsIgnoreCase("edge")){
		  driver=new EdgeDriver();}
		  else if(browser.equalsIgnoreCase("Firefox")){
			  WebDriverManager.firefoxdriver().setup();
				FirefoxOptions options=new FirefoxOptions();
				options.addArguments("--headless");
				driver = new FirefoxDriver(options);;
		  
	  }
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		}
	public  Object[][] readExcel(String excelfile) throws IOException {
		  XSSFWorkbook book=new XSSFWorkbook("./dataBB/"+excelfile+".xlsx");
			XSSFSheet sheet = book.getSheetAt(0);
			int rowcount = sheet.getLastRowNum(); 
			short columnCount = sheet.getRow(0).getLastCellNum(); 
			 Object[][]data= new Object[rowcount][columnCount]; 
			for (int i = 1; i <= rowcount; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < columnCount; j++) {
					XSSFCell cell = row.getCell(j);
					data[i-1][j]=cell.getStringCellValue();
					
				}
			}
			book.close();
			return data;
	  
	}
	


	public static void click (WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
public void actionclass(WebElement actele) {
	 Actions builder = new Actions(driver);
	 builder.moveToElement(actele).perform();
}
	
public static void selectFromDropDown(WebElement element, String visibleText) {
	Select select = new Select(element);
	select.selectByVisibleText(visibleText);
}
	public void sendKeys(WebElement ele, String value) {
		
		ele.sendKeys(value);
	}
	public void scroll(WebElement scroll) {
		 Actions builder1 = new Actions(driver);
		 builder1.scrollToElement(scroll).perform();
	}
	
	public static void type(WebElement element, String text) {
		click(element);
		element.clear();
		element.sendKeys(text);
	}
	public boolean isAlertPresent(WebElement alert) {
		try {
			driver.switchTo().alert().dismiss();
			return true;
			}catch(NoAlertPresentException e) {
		return false;
			}
	}
	
	public static void jsScrollUntillElement(WebElement element) {
		click(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void jsClickOn(WebElement element) {
		click(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
	public String getscreenshot(String testmethodname) throws IOException {
		String path ="./snap/"+testmethodname+".png";
		TakesScreenshot srcshot = ((TakesScreenshot) driver);
		 File source =srcshot.getScreenshotAs(OutputType.FILE);
		 File dest= new File(path);
		 FileUtils.copyFile(source, dest);
		 return path;
	}
	//public void alert() {
	//driver.switchTo().alert().accept();
	//}
	
	public void closebrowser() {
		driver.close();

	}}
