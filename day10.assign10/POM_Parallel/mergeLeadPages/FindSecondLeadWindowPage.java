package mergeLeadPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class FindSecondLeadWindowPage extends POMBaseClass {
	
	public FindSecondLeadWindowPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public FindSecondLeadWindowPage enterLeadFirstName()
	{
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
	driver.switchTo().window(allhandles2.get(1));
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Subraja");
	return this;
	}
	public FindSecondLeadWindowPage clickFindLeads()
	{
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	return this;
	}
	public FindSecondLeadWindowPage clickFirstLeadID() throws InterruptedException
	{
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return this;
	}
	public MergeTwoLeads switchHomeWindow()
	{
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(0));
		return new MergeTwoLeads(driver);
	}
	
	
}
