package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flip_home {
	@FindBy(xpath="//span[contains(.,'Men')]")
	private WebElement men;
	//@FindBy(xpath="//span[contains(.,'Baby')]")
	
	
	@FindBy(xpath="(//a[contains(.,'T-Shirts')])[1]")
	private WebElement tshirts;
	
	
	

	public flip_home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void kidsmouseover(WebDriver driver)
	{
		
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
	}
	public void toysclick()
	{
		tshirts.click();
	}

}
