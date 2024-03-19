package editLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class FindLeadsPage extends POMBaseClass {
	public FindLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public FindLeadsPage clickPhone()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public FindLeadsPage enterPhoneNumber()
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		return this;
	}
	
	public FindLeadsPage clickFindLeads()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public ViewLeadPage firstLeadClick()
	{
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return new ViewLeadPage(driver);
	}
}
