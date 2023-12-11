package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import base.ProjectSpecification;

public class SignIn extends ProjectSpecification {
	@FindBy(id="fld-e")
	WebElement EmailAddress;
	@FindBy(xpath="//input[@name=\"fld-p1\"]")
	WebElement SigninPassword;
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement signinbutton;
	
	
	public SignIn(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public SignIn EmailAddress(String signemail) {
		
		sendKeys(EmailAddress, signemail);
		return this;
	}
	public SignIn SigninPassword(String signpassword) {
		
		sendKeys(SigninPassword, signpassword);
		return this;
	}	
	public Homepage signClick(){
		
		signinbutton.click();
		return new Homepage(driver);
		
	}

	

}

