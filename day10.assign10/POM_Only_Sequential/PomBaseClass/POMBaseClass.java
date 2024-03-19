package PomBaseClass;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class POMBaseClass {
public static ChromeDriver driver;  

	@BeforeMethod
	public void preCondition() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
    public void postCondition() {
		driver.close();
	}
	public String filedata;
	@DataProvider(name="fetchData")
	public String[][] fetchData() throws IOException{
		
		return IntegrationOfExcelSheet.excelvalue(filedata);
	}

}
