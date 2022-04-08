package testNGConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG02_DuplicateLead {
	
	@Test(retryAnalyzer = testNGConcepts.RetryFailedTestCases.class)
	public void TestCase02() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

// 		get url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();  //maximize window

// 		Giving credential and login
		WebElement enterusername = driver.findElement(By.id("username"));
		enterusername.sendKeys("Demosalesmanager");
		
		WebElement enterpassword = driver.findElement(By.id("password"));
		enterpassword.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	
//      Perform create leads				
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fahed");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rahman");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("mr");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("cse");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Running tests");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		
   
// 		perform Drop down action
		WebElement statedropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(statedropdown);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
	
//		performs Edit Lead
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Altered the text");
		driver.findElement(By.className("smallSubmit")).click();

// print the title of the page
		System.out.println(driver.getTitle());

	}

	}


