package com.careerit.cj.day7;

public class ArrayInitExample {

		public static void main(String[] args) {
			
				String[] names = new String[3];
				
				names[0] = "Krish";
				names[1] = "Manoj";
				names[2] = "Charan";

				for(int i=names.length-1;i>=0;i--) {
					String name = names[i];
					System.out.println(name);
				}
		}
}
