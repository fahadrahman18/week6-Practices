package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class steps_04DeleteLead extends BaseClass{
	WebElement getfirstelement;
	String leadNo;
	
	
	@Given("click phone")
	public void click_phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("enter {string} in phone number")
	public void enter_in_phone_number(String phn) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phn);
	}
	@Given("click find lead button")
	public void click_find_lead_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
	}
	@Given("print the first resultant ID and store it")
	public void print_the_first_resultant_id_and_store_it() throws InterruptedException {
		getfirstelement = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		leadNo = getfirstelement.getText();
		Thread.sleep(3000);		
		System.out.println("First resulting ID is " + leadNo);
	}
	@Given("click the first resultant ID")
	public void click_the_first_resultant_id() {
		getfirstelement.click();
	}
	@Given("Click the Delete button")
	public void click_the_delete_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(5000);
	}
	@Given("enter the stored lead ID in the Lead ID textbox")
	public void enter_the_stored_lead_id_in_the_lead_id_textbox() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[13]")).sendKeys(leadNo);		
		Thread.sleep(2000);
	}
	@Then("verify no results found because we deleted the ID")
	public void verify_no_results_found_because_we_deleted_the_id() throws InterruptedException {
		Thread.sleep(3000);
		String FinalResult = "No records to display";		
		String verifyresult = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	
		System.out.println(verifyresult);
				
		if (verifyresult.equals(FinalResult)) {
			System.out.println("Deletion successfull");
		}
		else {
			System.out.println("wrong");
		}
	}

}
