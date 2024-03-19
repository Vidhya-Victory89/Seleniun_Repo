package mergeLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;
import mergeLeadPages.MyHomePage;

public class MyHomePage extends POMBaseClass {
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyHomePage ClickLeads()
	{
		driver.findElement(By.linkText("Leads")).click();
		return this;
		
	}
	public MergeLeadsPage clickMergeLeads()
	{
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage(driver);
		
	}

}
