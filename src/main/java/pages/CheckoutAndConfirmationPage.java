package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class CheckoutAndConfirmationPage  extends ProjectSpecification{
//	@FindBy(xpath="//span[text()='Cart']")
//	WebElement cart;
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkoutbutton;
	@FindBy(xpath="//button[text()='Continue as Guest']")
	WebElement guestbutton;
	@FindBy(xpath="//button[text()='Switch to shipping']")
	WebElement switchtoshipping;
	@FindBy(id="firstName")
	WebElement firstnameco;
	@FindBy(id="lastName")
	WebElement lastnameco;
	@FindBy(id="street")
	WebElement address;
	@FindBy(id="city")
	WebElement city;
	@FindBy(id="state")
	WebElement state;
	@FindBy(id="zipcode")
	WebElement zipcode;
	@FindBy(xpath="//span[text()='Use as billing address']")
	WebElement checkboxforbilling;
	@FindBy(xpath="//span[text()='Apply']")
	WebElement applybutton;
	@FindBy(xpath="//span[text()='Keep Address as Entered']")
	WebElement keepaddress;
	@FindBy(id="user.emailAddress")
	WebElement useremail;
	@FindBy(id="user.phone")
	WebElement userphone;
	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	WebElement paymentbutton;
	@FindBy(id="number")
	WebElement cardnumber;
    @FindBy(id="cardError")	
    WebElement carderror;
	public  CheckoutAndConfirmationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void checkoutandconfirm() {
		click(checkoutbutton);
		click(guestbutton);
		click(switchtoshipping);}
	
	public void checkoutandconfirm1(String firstname,String lastname,String address1,String city1,String state1,String zipcode1,String email,String phone,String cardnumber1) {
		type(firstnameco, firstname);
		type(lastnameco, lastname);
		type(address, address1);
		type(city, city1);
		click(state);
	selectFromDropDown(state, state1);
		type(zipcode, zipcode1);
		//click(checkboxforbilling);
		click(applybutton);
		click(keepaddress);
		type(useremail,email);
		actionclass(userphone);
		type(userphone, phone);
		click(paymentbutton);
		type(cardnumber, cardnumber1);
		click(cardnumber);
		carderror.getText();
		System.out.println(carderror);
		
	}
	
	
}
