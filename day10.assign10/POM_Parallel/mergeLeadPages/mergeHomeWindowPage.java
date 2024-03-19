package mergeLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PomBaseClass.POMBaseClass;

public class mergeHomeWindowPage extends POMBaseClass {
	public mergeHomeWindowPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public FindSecondLeadWindowPage clickSecondWindow()
	{
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new FindSecondLeadWindowPage(driver);
	}
}
