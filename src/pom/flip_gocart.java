package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class flip_gocart {
	@FindBy(xpath="(//span[contains(.,'₹')])[1]")
	private WebElement price;
	
	@FindBy(xpath="(//button[.=' + '])[1]")
	private WebElement add;
	
	@FindBy(xpath="(//div[.='Remove'])[1]")
	private WebElement remove;
	
	@FindBy(xpath="(//div[.='Remove'])[1]")
	private WebElement popup;
	
	
	//String text1;
	
	//String text2;
	
	
	
	public flip_gocart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getprice() throws InterruptedException
	{
		String text1 = price.getText();
		//String val = Integer.toString(text);
		System.out.println("the price is:"+text1);
		Thread.sleep(2000);
		String newtext1= text1.replace("₹", "0");
		String data1 = newtext1.replace(",", ".");
		System.out.println(data1);
		
		Thread.sleep(3000);
	
	
	//public void increment() throws InterruptedException
	//{
		  
		
			for ( int i = 0; i <=0; i++) 
			{
				Thread.sleep(2000);
				add.click();
			
			}
			Thread.sleep(3000);
          String text2= price.getText();
          System.out.println("the updated price is :"+text2);
          Thread.sleep(2000);
          String newtext2 = text2.replace("₹", "0");
          String data2 = newtext2.replace(",", ".");
  		System.out.println(data2);
          
          Thread.sleep(3000);
          String s1=data1;
      	int val1=Integer.parseInt(s1);
      	System.out.println(val1);
      	
  	Thread.sleep(3000);
      	
   	 String s2=data2;
           int val2=Integer.parseInt(s2);
           System.out.println(val2);
           
           int diff=val2-val1;
           System.out.println("the difference amt is:"+diff);
         
          
         
          
		
	}

//	public void calculation() throws InterruptedException
//	{
//	String s1=text1;
//	int val1=Integer.parseInt(s1);
//	System.out.println(val1);
//	
//	Thread.sleep(3000);
//	
//	 String s2=text2;
//     int val2=Integer.parseInt(s2);
//     System.out.println(val2);
//     
//     int diff=val1-val2;
//     System.out.println("the difference amt is:"+diff);
//	
//	}
//	
//	
	public void itemremove()
	{
		remove.click();
	}

	
	public void removepop() throws InterruptedException
	{
		popup.click();

		Thread.sleep(2000);
		 
		String msg = popup.getText();
		System.out.println(msg);
		//Assert.assertTrue(msg.contains("Remove"));
		Assert.assertEquals(msg, "REMOVE");
		
			System.out.println("Successfully removed");
	}
	
}
