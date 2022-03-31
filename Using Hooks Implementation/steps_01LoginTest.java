package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class steps_01LoginTest  extends BaseClass{
	
	@Given("A chrome browser is launched")
	public void openBrowser() {			
	}
	
	@And("Load the Leaftaps url")
	public void loadURL() {		
		
	}
	
	@Given("give username as {string}")
	public void enterUsername(String username) {
		WebElement findusername = driver.findElement(By.id("username"));
		findusername.sendKeys(username);
	}
	
	
	@And("give password as {string}")
	public void enterPassword(String password) {
		WebElement findpassword = driver.findElement(By.id("password"));
		findpassword.sendKeys(password);
	}
	
	@When("click login to enter the application")
	public void clickLogin() {
	    WebElement clicklogin = driver.findElement(By.className("decorativeSubmit"));
		clicklogin.click();
	}
	
	@Then("Welcome page should be displayed")
	  public void welcome_page_should_be_displayed() {
	    
	 }

}
