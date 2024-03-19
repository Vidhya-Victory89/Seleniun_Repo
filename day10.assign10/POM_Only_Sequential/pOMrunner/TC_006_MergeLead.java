package pOMrunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PomBaseClass.POMBaseClass;
import mergeLeadPages.LoginPage;

public class TC_006_MergeLead extends POMBaseClass {
	@BeforeTest
	public void setData()
	{
		filedata="LoginSheet";
	}
	
	@Test(dataProvider="fetchData")
    public void login(String uname,String pwd) throws InterruptedException
    {
		LoginPage lp=new LoginPage();
		lp.enterUserName(uname).enterPassword(pwd).clickLoginButton().clickCrmsfa().ClickLeads().clickMergeLeads().clickFindLeadsWindowPage().enterFirstLeadName().clickFindLeads().clickFirstLeadID().mergeHomeWindow().clickSecondWindow().enterLeadFirstName().clickFindLeads().clickFirstLeadID().switchHomeWindow().clickMergeButton().acceptAlert().clickFindLeads().sendLeadID().clickFindLeadsButton().displayRecords();
		
    }

}
