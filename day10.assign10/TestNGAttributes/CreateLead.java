package TestNGAttributes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	@DataProvider(name="fetchData")
	public String[][] fetchData() throws IOException{
		
	/*	data[0][0]="TestLeaf";
		data[0][1]="Anandhi";
		data[0][2]="Anadarajan";
		data[0][3]="999";
		
		data[1][0]="TestLeaf";
		data[1][1]="Vignesh";
		data[1][2]="Rajasekaran";
		data[1][3]="998";
		
		data[2][0]="TestLeaf";
		data[2][1]="Rubini";
		data[2][2]="Vignesh";
		data[2][3]="997";
		
		data[3][0]="TestLeaf";
		data[3][1]="Magizhvini";
		data[3][2]="Vignesh";
		data[3][3]="97";
		
		return data;*/
		return IntegrationOfExcelSheet.excelvalue();
	}
@Test(dataProvider="fetchData", priority=-1)
	public  void runCreateLead(String companyname,String firstname,String lastname,String phonenumber) {
	     
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phonenumber);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TestLeaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		
		
	}

}
