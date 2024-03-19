package editLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class EditLeadPage extends POMBaseClass {
	
	public EditLeadPage enterCompanyName()
	{
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		return this;
	}
	public EditLeadPage clickUpdate()
	{
	driver.findElement(By.name("submitButton")).click();
	return this;
	}
}
