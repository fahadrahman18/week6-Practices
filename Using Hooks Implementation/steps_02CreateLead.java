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

public class steps_02CreateLead extends BaseClass {
	
	  
	@Given("Click on {string} link")  //CRM\\/SFA
	public void clickCrmSfa(String linkText) {		
		WebElement proceedtohomepage = driver.findElement(By.linkText(linkText));
		proceedtohomepage.click();
	}
	
	//By.xpath("//div[text()='"+pageText+"']"))
	@Then("{string} should be displayed")
	public void in_the_application_home_page(String displayName) {
	    boolean displayed = driver.findElement(By.xpath("//div[text()='"+displayName+"']")).isDisplayed();
	    System.out.println(displayed);
	}
	
	@Given("Click create Lead button")
	public void clickCreateLeads() {
		 WebElement clickcreateleads = driver.findElement(By.linkText("Create Lead"));
		 clickcreateleads.click();
	}
	
	@And("Give company name as {string}")
	public void enterCompanyName(String companyName) {
		 WebElement entercompanyname = driver.findElement(By.id("createLeadForm_companyName"));
		 entercompanyname.sendKeys(companyName);
	}
	
	@And("Give firstname as {string}")
	public void enterFirstName(String fname) {
	    WebElement enterfirstname = driver.findElement(By.id("createLeadForm_firstName"));
	    enterfirstname.sendKeys(fname);
	}
	
	@And("Give lastname as {string}")
	public void enterLastName(String lname) {
		WebElement enterlastname = driver.findElement(By.id("createLeadForm_lastName"));
	    enterlastname.sendKeys(lname);
	}
	
	@And("Give phone number as {string}")
	public void enterphnnum(String phnNo) {
		WebElement enterlastname = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
	    enterlastname.sendKeys(phnNo);
	}
	
	@When("clicks create lead button")
	public void clickCreateLeadsButton() {		
		WebElement createlead = driver.findElement(By.name("submitButton"));
		createlead.click();	
	}
	
	@Then("Leads should be created")
	public void leads_should_be_created() {
		
		System.out.println("Lead created successfully");
	 
	}

}
