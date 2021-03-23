package Stepdefinitions;



import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LandingPage;
import resources.Base;

//@RunWith(Cucumber.class)
public class Stepdefinition extends Base {
	
	public WebDriver driver;
	public Properties prop;
	
	@Before
    public void initialize_the_browser() throws Throwable {
		prop=getProperties();
		driver=launchbrowser();
       
    }
	
	 @Given("^Navigate to URL \"([^\"]*)\"$")
	    public void navigate_to_url_something(String strArg1) throws Throwable {
	        driver.get(strArg1);
	    }


    @When("^User Enter valid user details(.+),(.+),(.+),(.+) and (.+)$")
    public void user_enter_valid_user_details_and(String name, String email, String pwd, String gender, String dob) throws Throwable {
    	LandingPage H=new LandingPage(driver);
		H.entername().sendKeys(name);
		H.enterEmail().sendKeys(email);
		H.enterPassword().sendKeys(H.decodeString(pwd));
		H.enterGender(gender);
		H.enterEmployment().click();
		H.enterdob().sendKeys(dob);
    	H.button();
    	
		
    }
    
   
    @Then("^Validate the successful message is displayed$")
    public void validate_the_successful_message_is_displayed() throws Throwable {

    	System.out.println("Success");
    
    }

    

   

    @After
    
    public void close_browsers() throws Throwable {
    	
    	driver.quit();
     
    }

}



	    
