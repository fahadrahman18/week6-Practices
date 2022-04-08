package testNGConcepts;


import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class LearnRetry {
	
	@Test(retryAnalyzer = testNGConcepts.RetryFailedTestCases.class)
	public void createLead() {		
		System.out.println("Create Lead");
		throw new java.util.NoSuchElementException();
	}
	@Test(retryAnalyzer = testNGConcepts.RetryFailedTestCases.class)
	public void editLead() {
		System.out.println("Edit Lead");
		throw new java.util.NoSuchElementException();
	}
	@Test(retryAnalyzer = testNGConcepts.RetryFailedTestCases.class)
	public void deletLead() {		
		System.out.println("Delete Lead");
	}

}
