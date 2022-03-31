package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = "src/test/java/features", glue = "steps", 
					monochrome = true, 
					publish = true, 
					tags = "@smoke or @sanity")
public class RunTests extends AbstractTestNGCucumberTests {
	
// public class RunTests extends AbstractTestNGCucumberTests {	

}
