package duplicateLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class MyLeadPage extends POMBaseClass {
	public MyLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyLeadPage clickFirstLead() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return this;
	}
	public DuplicateLeadPage clickDuplicateLead()
	{
	driver.findElement(By.linkText("Duplicate Lead")).click();
	return new DuplicateLeadPage(driver);
	}
}
