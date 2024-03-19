package mergeLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class MergeTwoLeads extends POMBaseClass {
	public MergeTwoLeads(ChromeDriver driver) {
		this.driver=driver;
	}
	public MergeTwoLeads clickMergeButton()
	{
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	return this;
	}
	public MergeTwoLeads acceptAlert()
	{
	driver.switchTo().alert().accept();
	return this;	
	}
	public FindLeadsPage clickFindLeads()
	{
	driver.findElement(By.linkText("Find Leads")).click();
	return new FindLeadsPage(driver);
	}
}
