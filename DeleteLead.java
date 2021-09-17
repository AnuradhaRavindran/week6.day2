package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass{
	
	@When("click on findleads link")
	public void clickfindlead()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("click on phone link")
	public void clickphone()
	{
		driver.findElement(By.linkText("Phone")).click();
	}
	@Given("Enter the phonenumber{string}")
	public void enterphoneenter(String phone)
	{
		driver.findElement(By.name("phoneNumber")).sendKeys(phone);
	}
	@When("Click on Again findleads link and select first item and verify")
	public void delete_and_verify() throws InterruptedException
	{
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		driver.findElement(By.xpath("//button[text() = \"Find Leads\"]")).click();
		String text1 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		//Thread.sleep(2000);
		System.out.println(text1);
		//element.getText();
		if (text1.equals("No records to display")) 
		{
			System.out.println("Text matching");
		}
		else
		{
			System.out.println("Text is  not  matching");
		}
	}
}
