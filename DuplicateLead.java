package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DuplicateLead extends BaseClass{
	@When("click on findleadslink")
	public void clickfind()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("Click on email link")
	public void emaillink()
	{
		driver.findElement(By.linkText("Email")).click();
	}
	@Given("Enter the emailaddress{string}")
	public void enteremail(String email)
	{
		driver.findElement(By.name("emailAddress")).sendKeys(email);
	}
	@When("click on findlead button")
	public void findlead()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("select firstitem in the list")
	public void clickfirstitem() throws InterruptedException
	{ Thread.sleep(1000);
		WebElement firstitem = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String text = firstitem.getText();
		System.out.println(text);
		firstitem.click();
	}
	
	@When("click on dupliacte button and verify page")
	public void duplicate_and_verifypage()
	{
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
	    String duplicateTitle = driver.getTitle();
	    System.out.println(duplicateTitle);
	    String actualDuplicate = "Duplicate Lead | opentaps CRM";
	    if(actualDuplicate.equals(duplicateTitle))
	    {
	    	System.out.println("Title is matching");
	    }
	    else
	    {
	    	System.out.println("Not matching");
	    }
	}
	    @When("click on submit and verify leadname")
	    public void submit_and_leadname() 
	   	{
		  driver.findElement(By.name("submitButton")).click();
 	      String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
 	      System.out.println(text2);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

