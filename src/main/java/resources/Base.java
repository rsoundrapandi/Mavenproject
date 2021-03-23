package resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
public Properties getProperties() throws IOException {
	
	 prop=new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Data.properties");
		prop.load(fis);
		return prop;
		
}
	
	

public WebDriver launchbrowser() throws IOException {
	

	
	String browserName=prop.getProperty("browser");
	
	System.out.println(browserName);

	if(browserName.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
	}
	
	else if (browserName.equals("firefox"))
	{
	 driver= new FirefoxDriver();
	//firefox code
	}
	else if (browserName.equals("IE"))
	{
//	IE code
	}

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
		
}	
	
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy h-m-s");
		DateFormat dateFormater = new SimpleDateFormat("dd-MM-yyyy");
	    Date date = new Date();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports-"+dateFormater.format(date)+"\\"+testCaseName+"-"+dateFormat.format(date)+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}
		
		
		
	
}



