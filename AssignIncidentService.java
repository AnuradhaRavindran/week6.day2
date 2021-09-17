package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AssignIncidentService extends BaseClassService {
	@When("click on service incidents")
	public void click_service_incident()
	{
		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
	}
	@Given("Enter numberId{string}")
	public void service_numberid(String nameid) throws InterruptedException 
	{
		driver.switchTo().frame("gsft_main");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(nameid,Keys.ENTER);
	}
	@When("Click on display numid")
	public void select_first_numberid()
	{
		WebElement incidentnumber = driver.findElement(By.xpath("//a[@class='linked formlink']"));
		String text = incidentnumber.getText();
		System.out.println(text);
		incidentnumber.click();
	}
	@When("click on Assigngroup and value as {string}")
	public void click_assigngroup_entergroupvalue(String assigngroup) throws InterruptedException
	{
		driver.findElement(By.id("lookup.incident.assignment_group")).click();
		Set<String> windowHandlesset = driver.getWindowHandles();
		List<String> windowhandleList = new ArrayList<String>(windowHandlesset);
		driver.switchTo().window(windowhandleList.get(1));
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(assigngroup,Keys.ENTER);
		driver.findElement(By.linkText("Software")).click();
		driver.switchTo().window(windowhandleList.get(0));
		Thread.sleep(2000);
		driver.switchTo().window(windowhandleList.get(0));
	}
	@When("click on Assignto")
	public void enter_assignto()
	{
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("lookup.incident.assigned_to")).click();
		Set<String> windowHandlesset1 = driver.getWindowHandles();
		List<String> windowhandleList1 = new ArrayList<String>(windowHandlesset1);
		driver.switchTo().window(windowhandleList1.get(1));
		WebElement name = driver.findElement(By.xpath("//a[@class='glide_ref_item_link']"));
		String text3 = name.getText();
		System.out.println(text3);
		name.click();
		driver.switchTo().window(windowhandleList1.get(0));
	}
	@Given("Enter Worknote {string}")
	public void enter_worknote(String worknote) throws InterruptedException
	{
		driver.switchTo().frame("gsft_main");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-700)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@id='activity-stream-textarea']")).sendKeys(worknote);
	}
	
	@When("click on assignupdate")
	public void click_on_update_button()
	{
		driver.findElement(By.xpath("(//button[@class='form_action_button header  action_context btn btn-default'])[1]")).click();
	}
	
	@When("Click on Assigngroup check")
	public void check_assigngroup() throws InterruptedException
	{   JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(200,0)");
		Thread.sleep(5000);
		String assignmentgroup = driver.findElement(By.xpath("//tbody[@class='list2_body']//tr/td[10]")).getText();
		System.out.println("You have selected Assignment group is " +assignmentgroup+ "");
	}
	
	@When("Click on Assignto check")
	public void check_assignto()
	{
		String assignmentto = driver.findElement(By.xpath("//tbody[@class='list2_body']//tr/td[11]")).getText();
		System.out.println("You have selected Assignment group is " +assignmentto+ "");
	}

}
