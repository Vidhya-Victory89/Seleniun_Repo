package pOMrunner;

import org.testng.annotations.Test;

import PomBaseClass.POMBaseClass;
import createLeadPages.LoginPage;

public class TC_002_Logout extends POMBaseClass {
	@Test
	public void LogOut()
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName("Demosalesmanager").enterPassword("crmsfa").clickLoginButton().clickLogOut();
	}

}
