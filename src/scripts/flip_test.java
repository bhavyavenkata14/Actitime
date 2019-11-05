package scripts;


import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_libraries.Generic_class;
import pom.flip_gocart;
import pom.flip_home;
import pom.flip_login;
import pom.flip_product;
import pom.flip_select;

public class flip_test  extends Generic_class  {
	@Test
	public void login() throws InterruptedException, AWTException
	{
			
//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//		
//		WebDriver driver=new FirefoxDriver();
//		
//
//		driver.get("https://www.flipkart.com");
		
		
		flip_login fl=new flip_login(driver);
		fl.setemail("8660178944");
		
		Thread.sleep(1000);
		fl.setpwd("bhavya555");
		
		fl.submitclick();
		
		Thread.sleep(3000);
		
		flip_home fh=new flip_home(driver);
		fh.kidsmouseover(driver);
		
		Thread.sleep(3000);
		fh.toysclick();
		
		
		Thread.sleep(3000);
		flip_select fs=new flip_select(driver);
		fs.imgclick(driver);
		
		Thread.sleep(5000);
		
		flip_product fp=new flip_product(driver);
		
		
		String pid = driver.getWindowHandle();
		System.out.println(pid);
		
		Set<String> cid = driver.getWindowHandles();
		cid.remove(pid);
		for(String we:cid)
		{
			driver.switchTo().window(we);
		}
		
		
		//Thread.sleep(3000);
		fp.selectsize();
		
	Thread.sleep(6000);
	fp.cartclick();
	
	Thread.sleep(3000);
	
	flip_gocart fg=new  flip_gocart(driver);
	fg.getprice();
	
	//To increment:
	//Thread.sleep(3000);
	//fg.increment();
	
	
	
	//Thread.sleep(5000);
	//fg.calculation();
	
	Thread.sleep(9000);
	
	fg.itemremove();
	Thread.sleep(2000);
	fg.removepop();

	

//	String msg = popup.getText();
//	System.out.println(msg);
//	
		
	
	//flip_gocart gocart=new flip_gocart(driver);
	//gocart.increment();

	
	
	

		
		
		
		
		
		
	
	
	
	
		
		
		
	}

}
