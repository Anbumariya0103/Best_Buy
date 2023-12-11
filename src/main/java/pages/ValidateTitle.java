package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class ValidateTitle extends ProjectSpecification {
	@FindBy(xpath="//a[text()='Holiday Deals']")
	WebElement holidayDeals;
	@FindBy(xpath = "//a[text()='Top Deals']")
	WebElement topDealsMenu;
	@FindBy(xpath = "//a[text()='Deal of the Day']")
	WebElement dealsOfTheDayMenu;
	@FindBy(xpath = "//a[text()='My Best Buy Memberships']")
	WebElement myBestBuyMemberships;
	@FindBy(xpath = "//a[text()='Credit Cards']")
	WebElement creditCards;
	@FindBy(xpath = "//span[text()='More']")
	WebElement moreMenu;
	@FindBy(xpath = "//li[@class='liDropdownList']//a[text()='Gift Cards']")
	WebElement giftCardsMenu;
	@FindBy(xpath = "//li[@class='liDropdownList']//a[text()='Gift Ideas']")
	WebElement giftIdeasMenu;
	@FindBy(xpath = "//li[@class='liDropdownList']//a[text()='Yes, Best Buy Sells That']")
	WebElement yesBestBuySellsThat;
	@FindBy(xpath = "//li[@class='liDropdownList']//a[text()='Donate to St. Jude']")
	WebElement donatetoStJude;
	@FindBy(xpath = "//li[@class='liDropdownList']//a[text()='Best Buy Outlet']")
	WebElement bestBuyOutlet;
	@FindBy(xpath = "//li[@class='liDropdownList']//a[text()='Best Buy Business']")
	WebElement bestBuyBusinessMenu;
	
	public  ValidateTitle (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public ValidateTitle  holidayDeals() {
	click( holidayDeals);
	String actual=driver.getTitle();
	String excepted ="Sales and Promotions at Best Buy: On Sale Electronics, Coupons and Promo Codes";
	Assert.assertEquals(actual, excepted); 
	System.out.println("Title matches");
	return this;
}
public ValidateTitle  topDealsMenu() {
	click( topDealsMenu);
	String actual=driver.getTitle();
	String excepted ="Top Deals and Featured Offers on Electronics - Best Buy";
	Assert.assertEquals(actual, excepted);
	System.out.println("Title matches");
	return this;
}
public ValidateTitle  dealsOfTheDayMenu() {
	click( dealsOfTheDayMenu);
	String actual=driver.getTitle();
	String excepted ="Deal of the Day: Electronics Deals - Best Buy";
	Assert.assertEquals(actual, excepted);
	System.out.println("Title matches");
	return this;
}
public ValidateTitle  myBestBuyMemberships() {
	click( myBestBuyMemberships);
	String actual=driver.getTitle();
	String excepted ="My Best Buy Memberships";
	Assert.assertEquals(actual, excepted);
	System.out.println("Title matches");
	return this;
}
public ValidateTitle  creditCards() {
	click( creditCards);
	String actual=driver.getTitle();
	String excepted ="Best Buy Credit Card: Rewards & Financing";
	Assert.assertEquals(actual, excepted);
	System.out.println("Title matches");
	return this;
}
public ValidateTitle  moreMenu() {
	click( moreMenu);
	return this;

}
public ValidateTitle  giftCardsMenu() {
	actionclass(giftCardsMenu);
	click(  giftCardsMenu);
	String actual=driver.getTitle();
	String excepted ="Gifts Cards and E-Gift Cards - Best Buy";
	Assert.assertEquals(actual, excepted);
	System.out.println("Title matches");
	return this;
}
public ValidateTitle giftIdeasMenu() {
	click( giftIdeasMenu);
	String actual=driver.getTitle();
	String excepted ="Gift Ideas 2023: Best Gifts to Give This Year - Best Buy";
	Assert.assertEquals(actual, excepted);
	System.out.println("Title matches");
	return this;
}
public ValidateTitle yesBestBuySellsThat() throws InterruptedException {
	click( yesBestBuySellsThat);
	String actual=driver.getTitle();
	String excepted ="Best Buy Sells That - Best Buy";
	if(actual.contains(excepted)) {
	System.out.println("Title matches");}
	else {
		System.out.println("Title not matches");
	}
	return this;
}
public ValidateTitle  donatetoStJude() {
	click(donatetoStJude);
	String actual=driver.getTitle();
	String excepted =" Children's Research Hospital - Best Buy  ";
	if(actual.contains(excepted)) {
	System.out.println("Title matches");}
	else {
		System.out.println("Title not matches");
	}
	return this;
}
public ValidateTitle  bestBuyOutlet() {
	click(bestBuyOutlet);
	String actual=driver.getTitle();
	String excepted ="Clearance Electronics Outlet Store – Best Buy";
	if(actual.contains(excepted)) {
		System.out.println("Title matches");}
		else {
			System.out.println("Title not matches");
		}
	return this;
}
public ValidateTitle  bestBuyBusinessMenu() {
	click(bestBuyBusinessMenu);
	String actual=driver.getTitle();
	String excepted ="Best Buy for Business - Best Buy";
	Assert.assertEquals(actual, excepted);
	System.out.println("Title matches");
	return this;
}

}

