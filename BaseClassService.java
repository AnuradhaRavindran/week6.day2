package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassService extends AbstractTestNGCucumberTests {
   public static ChromeDriver driver;
  // public String nameId;

	
	@BeforeMethod
	
	public void precondition() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev80921.service-now.com/navpage.do");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.switchTo().frame(0);
		//driver.findElement(By.linkText("Sign up and Start Building")).click();
		driver.switchTo().frame("gsft_main");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("Rithika");
		driver.findElement(By.xpath("//button[@name='not_important']")).click();
		driver.findElement(By.id("filter")).sendKeys("Incident" ,Keys.ENTER);
	}
	
	

}
