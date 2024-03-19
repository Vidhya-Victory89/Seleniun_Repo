package pOMrunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PomBaseClass.POMBaseClass;
import duplicateLeadPages.LoginPage;

public class TC_005_DuplicateLead extends POMBaseClass {
	@BeforeTest
	public void setData()
	{
		filedata="LoginSheet";
	}
	
	@Test(dataProvider="fetchData")
    public void login(String uname,String pwd) throws InterruptedException
    {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uname).enterPassword(pwd).clickLoginButton().clickCrmsfa().ClickLeads().ClickFindLeads().clickPhone().enterPhoneNumber().clickFindLeads().clickFirstLead().clickDuplicateLead().clickSubmit();
		
    }

}
