package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class AddItem_CheckoutAndConfirmPage extends ProjectSpecification {
	@FindBy(id="gh-search-input")
	WebElement searchtab;
	@FindBy(xpath="//span[@class=\"header-search-icon\"]")
	WebElement searchbutton;
	@FindBy(xpath="//a[text()='Exclude Out of Stock Items']")
	WebElement filter;
	@FindBy(xpath="//a[text()='JBL - PartyBox 110 Portable Party Speaker - Black']")
	WebElement speaker;
	@FindBy(xpath="//button[@data-sku-id=\"6471418\"]")
	WebElement addtocartbutton;
	@FindBy(xpath="//button[text()='Continue shopping']")
	WebElement continueshop;
	@FindBy(xpath="//button[text()='Menu']")
	WebElement menubutton;
	@FindBy(xpath="//button[text()='Appliances']")
	WebElement appliances;
	@FindBy(xpath="//button[text()='Small Kitchen Appliances']")
	WebElement smallkitchen;
	@FindBy(xpath="//a[text()='Air Fryers & Deep Fryers']")
	WebElement airfryers;	
	@FindBy(xpath="//a[text()='Exclude Out of Stock Items']")
	WebElement filter1;
	@FindBy(xpath="//a[text()='Bella Pro Series - 4-qt. Slim Digital Air Fryer - Stainless Steel']")
	WebElement productairfryer;
	@FindBy(xpath="//button[@data-sku-id=\"6541804\"]")
	WebElement addtocartbutton1;
	@FindBy(xpath="//button[text()='Continue shopping']")
	WebElement continueshopping;
	@FindBy(xpath="//button[text()='Menu']")
	WebElement menubutton1;
	@FindBy(xpath="//button[text()='Brands']")
	WebElement brands;
	@FindBy(xpath="//a[text()='LG']")
	WebElement lg;
	@FindBy(xpath="//a[text()='LG speakers']")
	WebElement lgspeakers;
	@FindBy(xpath="//a[text()='Exclude Out of Stock Items']")
	WebElement filter2;
	@FindBy(xpath="//a[text()='LG - 5.1.2 Channel Soundbar with Wireless Subwoofer, Dolby Atmos and DTS:X - Black']")
	WebElement productspeaker;
	@FindBy(xpath="//button[@data-sku-id=\"6498853\"]")
	WebElement addtocartbutton2;
	@FindBy(xpath="//button[text()='Continue shopping']")
	WebElement continueshopping1;
	@FindBy(xpath="//a[@class=\"c-button-link go-to-cart\"]")
	WebElement gotocart;
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkoutbutton;
	@FindBy(xpath="//button[text()='Continue as Guest']")
	WebElement guestbutton;
	@FindBy(xpath="//button[text()='Switch all to shipping']")
	WebElement switchtoshipping;
	@FindBy(xpath="//input[@id=\"firstName\"]")
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
	@FindBy(xpath="//button//span[text()='Keep Address as Entered']")
	WebElement keepaddress;
	@FindBy(xpath="//input[@id=\"user.emailAddress\"]")
	WebElement useremail;
	@FindBy(xpath="//input[@id=\"user.phone\"]")
	WebElement userphone;
	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	WebElement paymentbutton;
	@FindBy(id="number")
	WebElement cardnumber;
    @FindBy(id="cardError")	
    WebElement carderror;
	public void searchProduct(String productName) {
		type(searchtab, productName);
		click(searchbutton);
		isAlertPresent(searchbutton);
	}
	public  AddItem_CheckoutAndConfirmPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public  AddItem_CheckoutAndConfirmPage Shopbysearch() {
		isAlertPresent(filter);	
		//actionclass(filter);
		click(filter);
		actionclass(speaker);
		click(speaker);
		actionclass(addtocartbutton);
		click(addtocartbutton);
		click(continueshop);
		return this;
	}
	
	public AddItem_CheckoutAndConfirmPage shopbydepartment() {
		click(menubutton);
		click(appliances);
		click(smallkitchen);
		click(airfryers);
		isAlertPresent(filter1);
		actionclass(filter1);
		click(filter1);
		click(productairfryer);
		actionclass(addtocartbutton1);
		click(addtocartbutton1);
		click(continueshopping);
		return this;	
		
	}
	public CheckoutAndConfirmationPage shopbybrands() throws InterruptedException {
		click(menubutton1);
		click(brands);
		click(lg);
		actionclass(lgspeakers);
		click(lgspeakers);
		actionclass(filter2);
		click(filter2);
		actionclass(productspeaker);
		click(productspeaker);
		actionclass(addtocartbutton2);
		click(addtocartbutton2);
		Thread.sleep(3000);
		//click(continueshopping1);
		click(gotocart);
		return new CheckoutAndConfirmationPage(driver);
		
	}

	public void checkoutandconfirm() {
		click(checkoutbutton);
		click(guestbutton);
		click(switchtoshipping);}
	
	public void checkoutandconfirm1(String firstname,String lastname,String address1,String city1,String state1,String zipcode1,String email,String phone,String cardnumber1) throws InterruptedException {
		actionclass(firstnameco);
		type(firstnameco, firstname);
		type(lastnameco, lastname);
		type(address, address1);
		type(city, city1);
		click(state);
	selectFromDropDown(state, state1);
		type(zipcode, zipcode1);
		//click(checkboxforbilling);
		//Thread.sleep(3000);
		//driver.switchTo().alert();
		//click(keepaddress);
		//Thread.sleep(3000);
		actionclass(useremail);
		type(useremail,email);
		actionclass(userphone);
		type(userphone, phone);
		actionclass(paymentbutton);
		click(paymentbutton);
		click(applybutton);
		type(cardnumber, cardnumber1);
		click(cardnumber);
		carderror.getText();
		System.out.println(carderror);
		
	}
	
	
}
