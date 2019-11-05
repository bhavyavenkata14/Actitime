package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flip_login {

	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit;
	
	
	public flip_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setemail(String ename)

	{
		email.sendKeys(ename);
	}
	public void setpwd(String pass)

	{
		pwd.sendKeys(pass);
	}
	public void submitclick()

	{
		submit.click();
	}

	
	
	
}
