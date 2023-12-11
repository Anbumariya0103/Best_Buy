package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Homepage;


public class TC_BB_003_CreatenewAccount extends ProjectSpecification {

	@BeforeTest
	public void setup() {
		excelfile="CreateAccountdata";
		
	}
	
	@Test( dataProvider ="getData",priority=1 )
	public void TC_BB_003_CreatenewAccount (String firstname, String lastname,String email,String password,String conpassword,String phone) throws IOException {
		
		new Homepage(driver)
		.countryclick()
		.account()
		.clickcreate()
		.FirstName(firstname)
		.LastName(lastname)
		.Email(email)
		.Password(password)
		.ConfirmPassword(conpassword)
		.Phone(phone)
		.createnewClick()
		.getscreenshot("CreatenewAccount");
	}
	
}


