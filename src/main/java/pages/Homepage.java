package pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.ProjectSpecification;


public class Homepage extends ProjectSpecification {
	@FindBy(xpath="//a[@class=\"us-link\"]")
	WebElement country;
	@FindBy(xpath="//span[text()='Account']")
	WebElement account;
	@FindBy(xpath="//a[text()='Create Account']")
	WebElement createaccount;
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signin;
	@FindBy(xpath="//button[text()='No, Thanks']")
	WebElement survey;
	
	public List<String> brokenLinkFinder() throws Exception {
		List<WebElement> elements = driver.findElements(By.xpath("//footer//a"));
		int brokenLinkCount = 0;
		List<String> brokenLinks = new ArrayList<String>();
		for (int i = 0; i < elements.size(); i++) {
			String links = elements.get(i).getAttribute("href");
			int responseCode = getResponseCode(links);
			if (responseCode >= 400) {
				brokenLinkCount++;
				brokenLinks.add(links);
			}
		}
		System.out.println(brokenLinkCount);
		return brokenLinks;
	}
	
public Homepage (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
}

public Homepage countryclick(){
	
	click( country);
	return this;
}

public  Homepage survey( WebElement survey) {
	if(survey.isDisplayed()) {
		click(survey);}
		else {
		}
	return this;}

 public Homepage account() {
isAlertPresent(account);
 Actions builder = new Actions(driver);
builder.moveToElement(account).perform();
click(account);

return this;

 }
 public CreateNewAccount clickcreate() {
	click(createaccount);
	return  new CreateNewAccount(driver);
}

public SignIn clicksignin() {
click(signin);
return new SignIn (driver);
}
//public Homepage previousClick() {
//	click(previouspage);
//	previouspage.click();
//	return this;

}



