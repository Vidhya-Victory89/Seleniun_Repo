package createLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;



public class MyHomePage extends POMBaseClass {
	
	public MyHomePage ClickLeads()
	{
		driver.findElement(By.linkText("Leads")).click();
		return this;
		
	}
	public CreateLeadPage ClickCreateLeads()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
		
	}

}
