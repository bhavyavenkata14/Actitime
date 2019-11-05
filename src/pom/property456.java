package pom;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import generic_libraries.Generic_properties;

public class property456 extends Generic_properties{
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		
		Generic_properties.property_file("./p.properties", "iw");
		
	}
	

	
	

	
}
