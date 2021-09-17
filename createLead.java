package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class createLead extends  BaseClass{
	@When("Clicking on to Create Lead link")
	public void clickcreatelead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("Enter the companyname as{string}")
	public void entercompName(String comp) throws InterruptedException
	
	{  Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(comp);
	}
	@Given("Enter the firstname as{string}")
	public void enterfirstname(String fName) throws InterruptedException {
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(fName);
		WebElement firstName1 = driver.findElement(By.id("createLeadForm_firstName"));
		String attribute = firstName1.getAttribute("name");
		System.out.println(attribute);
		firstName1.sendKeys(fName);
	}
	
	@Given("Enter the lastname as{string}")
	public void enterlastname(String lName) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lName);
	}
	//@Given("Enter the phone number{string}")
	@Given("Enter the phone number{string}")
	public void phoneno(String ph) throws InterruptedException
	{   JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
	}
	@When("Click on CreateLead Button")
	public void clickcreateleadbutton()
	{
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		WebElement findElement = driver.findElement(By.id("viewLead_companyName_sp"));
		String text = findElement.getText();
		System.out.println(text);
	}
}
