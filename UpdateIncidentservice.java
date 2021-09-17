package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UpdateIncidentservice extends BaseClassService{
	
	@When("Click serviceincident")
	public void clicking_service_incident() 
	{
		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
	}
	@Given("Enter the numberid {string}")
	public void enter_service_numberId(String numId) throws InterruptedException 
	{
		driver.switchTo().frame("gsft_main");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(numId,Keys.ENTER);
		WebElement incidentnumber = driver.findElement(By.xpath("//a[@class='linked formlink']"));
		String text = incidentnumber.getText();
		System.out.println(text);
		incidentnumber.click();
	}
	@When("Click on urgency")
	public void click_urgency()
	{
		WebElement urgency = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
		Select urgencyelement = new Select(urgency);
		List<WebElement> urgencyopt = urgencyelement.getOptions();
		String text1 = urgencyopt.get(0).getText();
		urgencyopt.get(0).click();
		System.out.println("You clicked Urgency as "+text1+ "");
	}
	@When("Click on state")
	public void click_state()
	{
		WebElement state = driver.findElement(By.xpath("//select[@id='incident.state']"));
		Select stateopt = new Select(state);
		List<WebElement> statelist = stateopt.getOptions();
		String text2 = statelist.get(1).getText();
		statelist.get(1).click();
		System.out.println("You have clicked  state as " +text2+ "");
	}
	@Given("Enter Worknotes{string}")
	public void enter_worknote(String worknote) throws InterruptedException 
	{
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-700)");
		driver.findElement(By.xpath("(//div[@class='sn-stream-textarea-container']/textarea)[3]")).sendKeys(worknote);
	}
	@When("Click on update")
	public void click_update() 
	{
		driver.findElement(By.xpath("//button[@name='not_important']")).click();
	}
	
	@When("verify state")
	public void verify_state()
	{
		String text3 = driver.findElement(By.xpath("//tbody[@class='list2_body']//tr/td[8]")).getText();
		System.out.println("We have set the state as " +text3+"");
		if(text3.equals("In Progress"))
		{
			System.out.println("state verified");
		}
		
		else
		{
			System.out.println("state not  verified");	
		}
	}
	@When("verify prority")
	public void verify_prority()
	{
		String text4 = driver.findElement(By.xpath("//tbody[@class='list2_body']//tr/td[7]")).getText();
		System.out.println("We have set the state as " +text4+"");
		if(text4.equals("3 - Moderate"))
		{
			System.out.println("prority verified");
		}
		
		else
		{
			System.out.println("prority not  verified");	
		}
	}
	

}
