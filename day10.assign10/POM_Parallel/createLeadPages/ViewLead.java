package createLeadPages;

import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;



public class ViewLead extends POMBaseClass {

	public ViewLead(ChromeDriver driver) {
		this.driver=driver;
		
	}
	public ViewLead view()
	{
			String title=driver.getTitle();
			System.out.println(title);
			return this;
}
}
