package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class BottomLink extends ProjectSpecification  {
	@FindBy(xpath="//a[text()='Privacy']")
	WebElement privacy;
	public  BottomLink (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public BottomLink   privacy() {
	actionclass(privacy);
	click( privacy);
	String actual=driver.getTitle();
	String excepted ="Privacy Policy Hub - Best Buy";
	Assert.assertEquals(actual, excepted); 
	System.out.println("Title matches");
	return this;
}

}