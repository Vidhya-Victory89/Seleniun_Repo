package day4.ass4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();      
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
        driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.partialLinkText("Leads")).click();
        driver.findElement(By.partialLinkText("Find Leads")).click();
        driver.findElement(By.partialLinkText("Phone")).click();
        String phone="996248";
        driver.findElement(By.name("phoneNumber")).sendKeys(phone);
        driver.findElement(By.id("ext-gen334")).click();
        String title=driver.getTitle();
        System.out.println(title);
        String Emp=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();       
        System.out.println(Emp);
        driver.findElement(By.linkText(Emp)).click();
        driver.findElement(By.linkText("Delete")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.name("id")).sendKeys(Emp);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        driver.close();
	}

}
