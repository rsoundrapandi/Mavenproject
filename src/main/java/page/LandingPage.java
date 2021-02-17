package page;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LandingPage {
	
	public WebDriver driver;
	
	 
		By userName=By.name("name");
		By emailAddress=By.name("email");
		By password=By.id("exampleInputPassword1");
		By gender=By.id("exampleFormControlSelect1");
		By employment=By.id("inlineRadio2");
		By dob=By.name("bday");
		By sumbit=By.cssSelector(".btn.btn-success");

	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
			// TODO Auto-generated constructor stub
	}
	
	public WebElement entername() {
	
		return driver.findElement(userName);
		
	}
	
	
	
	public WebElement enterEmail() {
		
		return driver.findElement(emailAddress);
		
	}
	
	public WebElement enterPassword() {
		
		return driver.findElement(password);
		
	}
	
	public void enterGender(String genderName){
		WebElement genderdp=driver.findElement(gender);
		genderdp.click();
		expilicitwait().until(ExpectedConditions.visibilityOf(genderdp));
		Select s=new Select(genderdp);
		s.selectByVisibleText(genderName);
		
		
	}
	
	public WebDriverWait expilicitwait() {
		
		WebDriverWait w=new WebDriverWait(driver,10);
		
		return w;
	}
	
	public WebElement enterEmployment() {
		
		return driver.findElement(employment);
		
	}

	public WebElement enterdob() {
	
		return driver.findElement(dob);
		
	}
		
	public String decodeString(String password) {
		byte[] decode = Base64.getDecoder().decode(password);
		 return(new String(decode));
		 
	}
	
	public void button() {
		
		 WebElement btn=driver.findElement(sumbit);
		 javascriptexecuter();
		 btn.click();
		 
	}
	
	public void javascriptexecuter() {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
	}
	
	
	public static Object[][] getData()
	{
		
		// Row stands for how many different data types test should run
				//coloumn stands for how many values per each test
				
				// Array size is 2
				// 0,1
				Object[][] data=new Object[2][5];
				//0th row
				data[0][0]="Test";
				data[0][1]="rsoundrapandi@gmail.com";
				data[0][2]="RWFzd2FyaUAyMg==";
				data[0][3]="Female";
				data[0][4]="02012022";
				//1st row
				data[1][0]="Test1";
				data[1][1]="rsoundrapandi1@gmail.com";
				data[1][2]="RWFzd2FyaUAyMg==";
				data[1][3]="Female";
				data[1][4]="02012023";
				
				return data;

	}


}
	

