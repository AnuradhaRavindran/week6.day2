package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MergeLead extends BaseClass{
	@When("click on create button")
	public void createbutton()
	{
		driver.findElement(By.linkText("Contacts")).click();
	}
	
	@When("clcik on Merge contacts")
	public void mergebutton()
	{
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	}
	@When("click on From contact")
	public void clickfrom()
	{
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
	}
	
	@Given("Enter firstname{string}")
	public void Enterfirstname(String fname) throws InterruptedException
	{  		
		
		Set<String> windowHandlesset = driver.getWindowHandles();
	    List<String> windowhandleList = new ArrayList<String>(windowHandlesset);
	    driver.switchTo().window(windowhandleList.get(1));
		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		WebElement contactId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		String text = contactId.getText();
		System.out.println("Clicked Contact id is : "+text);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.switchTo().window(windowhandleList.get(0));
	}
	
	@Given("Enter lastname{string}")
	public void Enterlastname(String lname) throws InterruptedException
	{
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandlesset1 = driver.getWindowHandles();
		List<String> windowhandleList1 = new ArrayList<String>(windowHandlesset1);
		driver.switchTo().window(windowhandleList1.get(1));
		driver.findElement(By.name("lastName")).sendKeys(lname);
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		WebElement lastname = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String text2 = lastname.getText();
		System.out.println("Last Name id is : " +text2);
		Thread.sleep(3000);
		lastname.click();
		driver.switchTo().window(windowhandleList1.get(0));
	}
	@When("click on merge button")
	public void clickmergebutton()
	{
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		String text3 = alert.getText();
		System.out.println("The alert message is : " +text3);
		alert.accept();
		
		String actualTitle = "View Conatct|opentaps CRM";
		String title4 = driver.getTitle();
		if(actualTitle.equals(title4))
		{
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title Matched");
		}
	    
	}

}
