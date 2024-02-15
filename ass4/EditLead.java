package day4.ass4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();      
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.partialLinkText("Leads")).click();
        driver.findElement(By.partialLinkText("Create Lead")).click();
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
        driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Arun");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prakash");
        driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("Prakash");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Information Technology");
        driver.findElement(By.name("primaryEmail")).sendKeys("arun.prakash@gmail.com");
        WebElement data = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select state=new Select(data);
        state.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.partialLinkText("Edit")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("TestLeaf Non-IT");
        driver.findElement(By.name("submitButton")).click();
        String title = driver.getTitle();
        System.out.println(title);
        
	}

}
