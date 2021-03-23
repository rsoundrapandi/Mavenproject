package Cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;

//import org.junit.runner.RunWith;


//import cucumber.api.junit.Cucumber;

//import cucumber.api.testng.CucumberFeatureWrapper;
//import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = {"src/test/java/Features"},
	    glue= {"Stepdefinitions"},monochrome=true,
plugin = { "html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json",
		"junit:target/cucumber-reports/cucumber.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class TestRunner extends AbstractTestNGCucumberTests{

	
}

/* public class TestRunner {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	   
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs cucmber Features", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void testDownClass() {
		testNGCucumberRunner.finish();
	}

} */

