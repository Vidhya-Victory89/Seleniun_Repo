package duplicateLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class FindLeadPage extends POMBaseClass {
	public FindLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public FindLeadPage clickPhone()
	{
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;
	}
	public FindLeadPage enterPhoneNumber()
	{
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	return this;
	}
	public MyLeadPage clickFindLeads()
	{
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	return new MyLeadPage(driver);
	}
}
