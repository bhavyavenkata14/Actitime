package pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class property123   {
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream("./p.properties"));
		
		String data = p.getProperty("city");
		System.out.println(data);
		
		
		String data1 = p.getProperty("country");
		System.out.println(data1);
		
		
		String data2 = p.getProperty("iw");
		System.out.println(data2);
		
		
		
		
		 String s=data2;
//         int val2=Integer.parseInt(s2);
       long val= Long.parseLong(s);
         System.out.println(val);
         
        
		
		
		
	
		
		
	
		
	}
}
