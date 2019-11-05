package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flip_product {
	
	//@FindBy(xpath="(//a[@class='_1TJldG _2I_hq9 _2UBURg'])[3]")
	@FindBy(xpath="//li[@id='swatch-3-size']/a")
	private WebElement size;
	
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement cart;
	

	public flip_product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectsize()
	{
		size.click();
	}
	

	public void cartclick()
		
		
		{
			
     		cart.click();
		}
		
	
}
