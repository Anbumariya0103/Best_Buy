package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.BottomLink;
import pages.Homepage;


public class TC_BB_006_BottomLinkValidation extends ProjectSpecification {
	@Test( priority=4 )
	public void TC_BB_005_TitleValidation ( ) throws IOException, InterruptedException {
		Homepage hp=new Homepage(driver);
		hp.countryclick();
	BottomLink bl= new BottomLink(driver);
	bl.privacy();
	hp.getscreenshot("Bottomlink_privacy");
}
}