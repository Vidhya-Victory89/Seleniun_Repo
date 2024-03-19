package pOMrunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PomBaseClass.POMBaseClass;
import editLeadPages.LoginPage;

public class TC_003_EditLead extends POMBaseClass {
	@BeforeTest
	public void setData()
	{
		filedata="LoginSheet";
	}
	
	@Test(dataProvider="fetchData")
    public void login(String uname,String pwd)
    {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uname).enterPassword(pwd).clickLoginButton().clickCrmsfa().ClickLeads().clickFindLeads().clickPhone().enterPhoneNumber().firstLeadClick().clickEditLead().enterCompanyName().clickUpdate();
		
    }

}
