package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_libraries.Actions1;

public class flip_select {
	@FindBy (xpath="(//a[@class='_2mylT6'])[3]")
	private WebElement select;
	
	
	@FindBy (xpath="//button[contains(.,'ADD TO CART')]")
	private WebElement cart;
	
	
	
	
	public flip_select(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void imgclick(WebDriver driver) throws AWTException, InterruptedException 
	{
		//Set<String> cid = driver.getWindowHandles();
		
		
		//for(String we:cid)
	//	{
		
		//Actions act=new Actions(driver);
		//act.contextClick(select).perform();
		//Thread.sleep(2000);
		//Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_T);
		//r.keyRelease(KeyEvent.VK_T);
		//Thread.sleep(2000);
		//driver.switchTo().window(we);
		//}
		select.click();
	}
	
	
	//public void cartclick()
	//{
	//	cart.click();
	//}
	//public void addcart(WebDriver driver)
	//{
		
		//String pid = driver.getWindowHandle();
//		System.out.println(pid);
		
	//	Set<String> cid = driver.getWindowHandles();
		//System.out.println(cid);
		
		
		//for(String we:cid)
		//{
			//driver.switchTo().window(we);
			
		//}
	//}

}
