package TestngPractise;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page.LandingPage;
import resources.Base;



public class Homepage extends Base {
	
	public WebDriver driver;

	public static Logger log =LogManager.getLogger(Homepage.class.getName());
	
@BeforeTest

public void openbrowser() throws IOException {

	driver=launchbrowser();
	log.info("HI");
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	log.info("Test sucessfully1");
}

@Test(dataProvider="gethomedata")



public void homepge(String user,String email,String pwd,String genderval,String date) 

{
		LandingPage H=new LandingPage(driver);
		try {
		H.entername().sendKeys(user);
		log.info(user);
		H.enterEmail().sendKeys(email);
		log.info("Test sucessfully3");
		H.enterPassword().sendKeys(H.decodeString(pwd));
		log.info("Test sucessfully4");
		H.enterGender(genderval);
		log.info("Test sucessfully5");
		H.enterEmployment().click();
		log.info("Test sucessfully6");
		H.enterdob().sendKeys(date);
		log.info("Test sucessfully7");
		H.button();
		}
		catch (Exception e) {
			System.out.println("Error message is displayed");
			System.out.println(e.getMessage());
		}
	

}

@AfterTest

public void closebrowser() {
	
	driver.close();
}


@DataProvider

public Object[][] gethomedata() throws IOException {
	
 Object[][] dataval=LandingPage.getExcelData();
 
 return dataval;
 
}





}
