package editLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;
import editLeadPages.MyHomePage;

public class MyHomePage extends POMBaseClass {
	
	public MyHomePage ClickLeads()
	{
		driver.findElement(By.linkText("Leads")).click();
		return this;
		
	}
	public FindLeadsPage clickFindLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage();
		
	}

}
