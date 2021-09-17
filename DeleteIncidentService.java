package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import serviceNow.BaseClassServiceNow;

public class DeleteIncidentService extends BaseClassService {
	@When("click on serviceinci")
	public void enter_incident_service_link() throws InterruptedException
	{   Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
		
	}
	@Given("Give the numid{string}")
	public void enter_numid_incident(String nameId) throws InterruptedException
	{   driver.switchTo().frame("gsft_main");
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(nameId,Keys.ENTER);
		
	}
	@When("click on appeared number")
	public void click_given_numberid()
	{
		WebElement incidentnumber = driver.findElement(By.xpath("//a[@class='linked formlink']"));
	    String text = incidentnumber.getText();
	    System.out.println(text);
	    incidentnumber.click();
		
	}
	@When("click delete button")
	public void delete_incident()
	{
		driver.findElement(By.xpath("//button[@class='form_action_button header  action_context btn btn-default' and text()='Delete']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-destructive']")).click();
	}
	@Given("Enter the {string} and verify")
	public void deleted_incident_verify(String nameId) throws InterruptedException
	{   
		//driver.switchTo().frame("gsft_main");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(nameId,Keys.ENTER);
		WebElement checkrecord = driver.findElement(By.xpath("//tbody[@class='list2_body']//tr/td"));
		String text2 = checkrecord.getText();
		System.out.println(text2);
		if(text2.contains("No records to display"))
		{
			System.out.println("record deleted");
		}
		else
		{
			System.out.println("record not deleted");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

