package deleteLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;
import deleteLeadPages.MyHomePage;

public class MyHomePage extends POMBaseClass {
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyHomePage ClickLeads()
	{
		driver.findElement(By.linkText("Leads")).click();
		return this;
		
	}
	public FindLeadsPage clickFindLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
		
	}

}
