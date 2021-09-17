
package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import serviceNow.BaseClassServiceNow;

public class CreateIncidentService  extends BaseClassService {
	
	@When("click on createnew")
	public void click_createnew_service()
	{
		driver.findElement(By.xpath("//div[text()='Create New']")).click();
	}
	@Then("Get first number id")
	public void print_first_service_idnumber() {
		driver.switchTo().frame("gsft_main");
		String number = driver.findElement(By.xpath("//input[@id='sys_original.incident.number']")).getAttribute("value");
		System.out.println("incident number is : " +number);
	}
	
	@When("click on caller")
	public void click_oncaller_service() 
	{
		
		driver.findElement(By.xpath("(//span[@class='icon icon-search'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowhandleList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowhandleList.get(1));
		WebElement caller = driver.findElement(By.linkText("Abel Tuter"));
		String text = caller.getText();
		System.out.println(text);
		caller.click();
		driver.switchTo().window(windowhandleList.get(0));
	
	}
	
	@Given("Enter short description {string}")
	public void enter_shortdescription_createnew(String des) throws InterruptedException 
	{   Thread.sleep(2000);
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("incident.short_description")).sendKeys(des);
	}
	@When("click on submit and gernumbeId and Verify")
	public void click_submit_createnew_service_and_verify()
	{   
		String number = driver.findElement(By.xpath("//input[@id='sys_original.incident.number']")).getAttribute("value");
	    System.out.println("incident number is : " +number);
		driver.findElement(By.name("not_important")).click();
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(number,Keys.ENTER);
		String verifyNumber = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		System.out.println(verifyNumber);
		if(number.endsWith(verifyNumber)) {
			System.out.println("Instance Created");
			
		}
		else
			System.out.println("Instance not created");
	}


}
