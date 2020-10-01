package com.careerit.cj.day22;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

		public static void main(String[] args) {
				System.out.println(10>>2);
			    // YML or properties 
			
				Properties properties = new Properties();
				try {
					properties.load(new FileInputStream("db.properties"));
					properties.entrySet().forEach(ele->{
						System.out.println(ele.getKey()+" = "+ele.getValue());
					});
					
				
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
}
