package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.AddItem_CheckoutAndConfirmPage;
import pages.Homepage;

public class TC_BB_007_AddItem_CheckoutAndConfirmPage extends ProjectSpecification {
	@BeforeTest
	public void setup() {

	}

	@Test(priority=7)
	public void TC_BB_007_AddItem_CheckoutAndConfirmPage() throws Exception {
		Homepage hp=new Homepage(driver);
		hp.countryclick();
		AddItem_CheckoutAndConfirmPage ai = new AddItem_CheckoutAndConfirmPage(driver);
		ai.searchProduct("Speaker");
		ai.Shopbysearch();
		hp.getscreenshot("AddItem_Bysearch");
		ai.shopbydepartment();
		hp.getscreenshot("AddItem_Bydepartment");
		ai.shopbybrands();
		hp.getscreenshot("AddItem_ByBrands");
		ai.checkoutandconfirm();
		ai.checkoutandconfirm1("Mariya", "nisha", "CN1 CALLE 123 VALLE ARRIBA HTS", "CAROLINA", "AL", "00983", "mariya@gmail.com", "7845123580", "7845121212458745");
		hp.getscreenshot("CheckoutAndConfirmation");
		
		
}
}

