package testcase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Homepage;
import pages.ValidateTitle;
import utility.Utilityclass2;

public class TC_BB_005_TitleValidation extends ProjectSpecification {
public void setup() {
		
//		excelfile="Titledata";
		
	}
	@Test( priority=3 )
	public void TC_BB_005_TitleValidation ( ) throws IOException, InterruptedException {
		Homepage hp=new Homepage(driver);
		hp.countryclick();
		ValidateTitle vt= new ValidateTitle(driver);
		vt.holidayDeals();
		hp.getscreenshot("holidayDeals");
		vt.topDealsMenu();
		hp.getscreenshot("topDealsMenu");
		vt.dealsOfTheDayMenu();
		hp.getscreenshot("dealsOfTheDayMenu");
		vt.myBestBuyMemberships();
		hp.getscreenshot("myBestBuyMemberships");
		vt.creditCards();
		hp.getscreenshot("creditCards");
		vt.moreMenu();
		hp.getscreenshot("moreMenu");
		vt.moreMenu();
		vt.giftCardsMenu();
		hp.getscreenshot("giftCardsMenu");
		vt.moreMenu();
		vt.giftIdeasMenu();
		hp.getscreenshot("giftIdeasMenu");
		vt.moreMenu();
		vt.yesBestBuySellsThat();
		hp.getscreenshot("yesBestBuySellsThat");
		vt.moreMenu();
		vt.donatetoStJude();
		hp.getscreenshot("donatetoStJude");
		vt.moreMenu();
		vt.bestBuyOutlet();
		hp.getscreenshot("bestBuyOutlet");
		vt.moreMenu();
		vt.bestBuyBusinessMenu();
		hp.getscreenshot("bestBuyBusinessMenu");
		
		
		}
	
}
