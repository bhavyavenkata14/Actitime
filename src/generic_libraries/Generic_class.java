package generic_libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Generic_class implements Auto_const {

	
	public WebDriver driver;

	static{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		System.setProperty(CHROME_KEY,CHROME_VALUE);
	}
	
	@Parameters({"browser"})
	
	@BeforeMethod
	public void openappln()
	{
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do;jsessionid=m000p39yffm7");
	}


 @AfterMethod
 public void closeappln()
 {
	 
		driver.quit();
 }
}
