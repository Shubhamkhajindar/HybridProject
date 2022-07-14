package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass {
	
	@Test
	public void tc1() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		driverutilities.switchtabs(driver);
		driverutilities.mouseHover(driver, sd.getCoursebtn());
		sd.seleniumtrainingtab();
		
		AddtocartPage a = new AddtocartPage(driver);
		driverutilities.doubleclick(driver, a.getAddbtn());
		a.addtocartbtn();
		driverutilities.alertpopup(driver);
	}
	

}
