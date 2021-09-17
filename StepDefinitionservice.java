package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionservice {
	public static ChromeDriver driver;
	
	@Given("open the browser")
	public void open_service()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Given("load url")
	public void loadurl_service()
	{
		driver.get("https://dev80921.service-now.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("Enter the username")  
	public void enter_username_service() throws InterruptedException
	{
		driver.switchTo().frame("gsft_main");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	}
	@Given("Enter the password") 
	public void enter_password_service() throws InterruptedException
	{   //driver.switchTo().frame("gsft_main");
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("ZLJfxEMwp81w");
	}
	
	@When("click on login") 
	public void click_login_service()
	{
		driver.findElement(By.xpath("//button[@name='not_important']")).click();
	}
	
	@Given("Enter the incident on filter") 
	public void enter_incident_service()
	{
		driver.findElement(By.id("filter")).sendKeys("Incident" ,Keys.ENTER);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
