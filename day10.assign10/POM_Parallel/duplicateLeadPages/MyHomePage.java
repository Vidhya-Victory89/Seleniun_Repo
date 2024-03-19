package duplicateLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;



public class MyHomePage extends POMBaseClass {
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyHomePage ClickLeads()
	{
		driver.findElement(By.linkText("Leads")).click();
		return this;
		
	}
	public FindLeadPage ClickFindLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage(driver);
		
	}

}
