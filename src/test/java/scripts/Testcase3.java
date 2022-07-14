package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Addtowishlist;
import pomPages.CorejavaPages;
import pomPages.SkillraryLoginPage;

public class Testcase3 extends BaseClass{
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.searchbox(pdata.getPropertyfile("coursename"));
		s.searchbutton();
		
		CorejavaPages c =new CorejavaPages(driver);
		c.corejavacourse();
		
		Addtowishlist a = new Addtowishlist(driver);
		driverutilities.switchtoframe(driver);
		a.playbtn();
		Thread.sleep(8000);
		a.pausebtn();
		driverutilities.switchback(driver);
		a.addtowishlistbtn();
		
	}
	

}
