package com.careerit.cj.day15;

public class CountryManager {

	
		public static void main(String[] args) {
			
				CountryInfo[] countryInfo= {new Canada(),new USA(),new India()};
				
				for(CountryInfo obj :countryInfo) {
					System.out.println(obj.currencyCode()+"   : "+obj.currency());
				}
			
		}
}
