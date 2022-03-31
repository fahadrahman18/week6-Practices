package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass {
	
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void precondition() {
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement findusername = driver.findElement(By.id("username"));
		findusername.sendKeys("Demosalesmanager");
		WebElement findpassword = driver.findElement(By.id("password"));
		findpassword.sendKeys("crmsfa");

	}
	
	@AfterMethod
	public void postcondition() {
		
		driver.close();
		

	}

}
