package duplicateLeadPages;

import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;


public class ViewLeadPage extends  POMBaseClass {
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public ViewLeadPage viewLead()
	{
			String title=driver.getTitle();
			System.out.println(title);
			return this;
}
}
