package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class CreateNewAccount extends ProjectSpecification {
	@FindBy(id="firstName")
	WebElement FirstName;
	@FindBy(id="lastName")
	WebElement LastName;
	@FindBy(id="email")
	WebElement Email;
	@FindBy(id="fld-p1")
	WebElement Password;
	@FindBy(id="reenterPassword")
	WebElement ConfirmPassword;
	@FindBy(id="phone")
	WebElement Phone;
	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement createaccountbutton;
	
	public CreateNewAccount(WebDriver driver)  {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
public CreateNewAccount FirstName(String firstname) {
		
		sendKeys(FirstName, firstname);
		return this;
	}
public CreateNewAccount LastName(String lastname) {
	
	sendKeys(LastName, lastname);
	return this;
}
public CreateNewAccount Email(String email) {
	
	sendKeys(Email, email);
	return this;
}
public CreateNewAccount Password(String password) {
	
	sendKeys(Password, password);
	return this;
}
public CreateNewAccount ConfirmPassword(String conpassword) {
	
	sendKeys(ConfirmPassword, conpassword);
	return this;
}
public CreateNewAccount Phone(String phone) {
	
	sendKeys(Phone, phone);
	return this;
}

public CreateNewAccount createnewClick(){
	
	createaccountbutton.click();
	return this;
	
}

}
	
