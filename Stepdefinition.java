package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition extends BaseClass {
	//public ChromeDriver driver;
	//public static ChromeDriver driver;

	/*@Given("open the browser")
	public void loadbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@And("load the application url")
	public void loadurl()
	{
		driver.get("http://leaftaps.com/opentaps/");
	}*/
	@Given("Enter the username as {string}")
	//@Given("Given Enter the username as demosalesmanager ") 
	public void enterUserName(String username) throws InterruptedException
	{   Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("Enter the password as {string}")
	public void enterPassword(String password) throws InterruptedException
	{   Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("click on login button") 
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Home page displayed") 
	//@Then("Home page displayed ")
	public void verifyHomepage()
	{
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed) {
			System.out.println("Page verified");
		}
		else
		{
			System.out.println("Page not verified");
		}
	}
	
	@But("Error message should be displayed") 
		//@But("Error message should be displayed") 
		public void errorMessage()
		{
			System.out.println("Enter Credentials");
		}
	
	@When("click on {string} link")
	public void clickonlink(String link)
	{
	driver.findElement(By.linkText(link)).click();
	
	}
	@Then("My home page displayed")
	public void checkpage()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	@When("clicking on {string} link")
	public void leadslink(String link1)
	{
		driver.findElement(By.linkText(link1)).click();
	}
}

