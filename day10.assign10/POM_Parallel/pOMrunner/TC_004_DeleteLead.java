package pOMrunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PomBaseClass.POMBaseClass;
import deleteLeadPages.LoginPage;

public class TC_004_DeleteLead extends POMBaseClass {
	@BeforeTest
	public void setData()
	{
		filedata="LoginSheet";
	}
	
	@Test(dataProvider="fetchData")
    public void login(String uname,String pwd) throws InterruptedException
    {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uname).enterPassword(pwd).clickLoginButton().clickCrmsfa().ClickLeads().clickFindLeads().clickPhone().enterPhoneNumber().firstLeadClick().clickDelete().clickFindLeads().enterLeadID().clickFindLeadsButton();
		
    }

}
