package deleteLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class DeleteLeadPage extends POMBaseClass {
	public MyLeadsPage clickDelete()
	{
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage() ;		
	}
}
