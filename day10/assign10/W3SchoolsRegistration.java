package day10.assign10;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import day10.assign10.IntegrationOfExcelSheet;

public class W3SchoolsRegistration {
	@DataProvider(name="fetchData")
	public String[][] fetchData() throws IOException{
    return IntegrationOfExcelSheet.excelvalue();
    }
	@Test(dataProvider="fetchData")
	public  void runRegistration(String firstname,String email ,String address,String city,String zip,String cvv,String cnumber,String cname) {
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();      
	    driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
	    driver.switchTo().frame("iframeResult");
	    driver.findElement(By.id("fname")).sendKeys(firstname);
	    driver.findElement(By.id("email")).sendKeys(email);
	    driver.findElement(By.id("adr")).sendKeys(address);
	    driver.findElement(By.id("city")).sendKeys(city);
	    driver.findElement(By.id("zip")).sendKeys(zip);
	    driver.findElement(By.id("expyear")).sendKeys("2018");
	    driver.findElement(By.id("cvv")).sendKeys(cvv);
	    driver.findElement(By.id("expmonth")).sendKeys("Oct");
	    driver.findElement(By.id("ccnum")).sendKeys(cnumber);
	    driver.findElement(By.id("cname")).sendKeys(cname);
	    driver.close();
	}
}
