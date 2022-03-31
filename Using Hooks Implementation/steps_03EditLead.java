package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class steps_03EditLead extends BaseClass {


@Given("Click Find Leads")
public void click_findLeads() throws InterruptedException {
	driver.findElement(By.linkText("Find Leads")).click();
	Thread.sleep(3000);
}

@Given("enter the username as test")
public void enter_the_username_as_test() {
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Test");

}
@Given("click Find Leads button")
public void click_find_leads_button() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(3000);
}

@Given("click the first displayed Lead ID")
public void click_firstLeadId() throws InterruptedException {
	Thread.sleep(4000); 
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();   
}
@Then("Verify the title")
public void verify_title() {
	String titlename = driver.getTitle();	
	System.out.println("Title of the page is " + titlename);
}
@Given("click Edit button")
public void click_edit() {
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
}
@Given("update the company name as {string}")
public void update_the_company_name_as(String updatecom) throws InterruptedException {
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updatecom);	
	Thread.sleep(2000);
}
@Given("click the update button")
public void click_the_update_button() {
	driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
}
@Then("print the company name")
public void print_the_company_name() {
	String verifycomname = driver.findElement(By.id("viewLead_companyName_sp")).getText();	
	System.out.println("Changed company name is " + verifycomname);
}

}
