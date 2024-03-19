package mergeLeadPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class FindLeadsWindowPage extends POMBaseClass {
	public static String leadID;
	
	
	public FindLeadsWindowPage enterFirstLeadName()
	{
     Set<String> allWindows = driver.getWindowHandles();
     List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(1));
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Dilip");
	return this;
	}
	public FindLeadsWindowPage clickFindLeads()
	{
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	return this;
	}
	public FindLeadsWindowPage clickFirstLeadID() throws InterruptedException
	{
	Thread.sleep(1000);
	leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	System.out.println(leadID);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return this;
	}
	public mergeHomeWindowPage mergeHomeWindow()
	{
    Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(0));
	return new mergeHomeWindowPage();
	}
}
