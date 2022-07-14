package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass {
	
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		driverutilities.switchtabs(driver);
		driverutilities.dropDown(sd.getDropdown(), pdata.getPropertyfile("coursedd"));
		
		TestingPage t = new TestingPage(driver);
		driverutilities.draganddrop(driver, t.getSelcourse(), t.getAddcart());
		Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilities.scrollbar(driver, x, y);
		t.facebookicon();
				
	}
	
	
	
}
