package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass{
	
	@When("click on Find Leads link")
	public void findleads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Given("Enter the firstname as {string}")
	public void enterfirstname(String firstname)
	{
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstname);
	}
	@When("Again click on Find Leads link")
	public void againfindleadclick()
	{
		driver.findElement(By.xpath("//button[@class='x-btn-text' and text()='Find Leads']")).click();
	}
	@When("click on first item and verify ViewLead page")
	public void clickfirstitem() throws InterruptedException
	{ Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		String actualTitle = "View Lead | opentaps CRM";
		String title2 = driver.getTitle();
		System.out.println(title2);
		if(actualTitle.equals(title2))
		{
			System.out.println("Title Matching");
		}
		else
		{
			System.out.println("Title not  Matching");
		}
	}
		
		@When("click on Edit button")
		public void clickEditButton()
		{
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
		}
		@Given("Enter the company name as {string}")
		public void updatecompname(String compy)
		{
			WebElement compName = driver.findElement(By.id("updateLeadForm_companyName"));
			compName.clear();
			compName.sendKeys(compy);
		}
		@When("click on update button")
		public void clickupdate()
		{
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
			System.out.println(text);
		}
		
		
	}
	
