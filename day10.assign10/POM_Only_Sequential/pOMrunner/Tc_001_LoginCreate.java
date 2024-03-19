package pOMrunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PomBaseClass.POMBaseClass;
import createLeadPages.LoginPage;

public class Tc_001_LoginCreate extends POMBaseClass {
	@BeforeTest
	public void setData()
	{
		filedata="LoginSheet";
	}
	
	@Test(dataProvider="fetchData")
    public void login(String uname,String pwd)
    {
		LoginPage lp=new LoginPage();
		lp.enterUserName(uname).enterPassword(pwd).clickLoginButton().clickCrmsfa().ClickCreateLeads().enterCompanyName().enterFirstName().enterLastName().enterPhoneNumber().clickSubmitButton().CheckLeadCreation().view();
		
    }
}
