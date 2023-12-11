package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Homepage;


public class TC_BB_004_Signin extends ProjectSpecification {

	@BeforeTest
	public void setup() {
		
		excelfile="Signindata";
		
	}
	
	
	@Test( dataProvider ="getData", priority=2)
	
	public void TC_BB_004_Signin (String signemail, String signpassword ) throws IOException {
		
		new Homepage(driver)
		.countryclick()
		.account()
		.clicksignin()
		.EmailAddress(signemail)
		.SigninPassword(signpassword)
		.signClick()
		.getscreenshot("Signin");
	}
	
	
}

