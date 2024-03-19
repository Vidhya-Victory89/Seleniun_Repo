package editLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class ViewLeadPage extends POMBaseClass {
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public EditLeadPage clickEditLead()
	{
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver) ;
	}
}
