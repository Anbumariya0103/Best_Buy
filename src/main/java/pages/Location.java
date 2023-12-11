package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class Location extends ProjectSpecification {
	
public Location (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
public Location countryclick(){
	return this;

}
}

