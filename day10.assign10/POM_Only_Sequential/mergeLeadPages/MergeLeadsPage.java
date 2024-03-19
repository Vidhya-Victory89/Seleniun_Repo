package mergeLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class MergeLeadsPage extends POMBaseClass {
	
	public FindLeadsWindowPage clickFindLeadsWindowPage()
	{
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return new FindLeadsWindowPage();
	}

}
