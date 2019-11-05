package generic_libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


	
	public class Generic_parallel implements Auto_const {

		
		public WebDriver driver;

		static{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			System.setProperty(CHROME_KEY,CHROME_VALUE);
		}
		
		@Parameters({"browser"})
		
		@BeforeMethod
		public void test_parallel(String browser )
	{
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("http://localhost/login.do;jsessionid=m000p39yffm7");
		}else{
			driver=new ChromeDriver();
			driver.get("http://localhost/login.do;jsessionid=m000p39yffm7");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}


	 @AfterMethod
	 public void closeappln()
	 {
		 
			driver.quit();
	 }
	}



