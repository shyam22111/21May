package collection.byParesh;

import java.util.*;

public class shortingEx {

		
		public static void main(String[] args) {
			
		ArrayList<String> al = new ArrayList<String>(); 
		
		// adding the elements inside the arraylist
		
		al.add("Volvkswagon");
		al.add("bullet");
		al.add("Activa");
		al.add("Bmw");
		al.add("mercedez-benz");
		al.add("Audi");
		al.add("hondacity");
		al.add("skoda");
		al.add("maruti");
		
		// printing the arraylist
		System.out.println("The arraylist before sorting :-"+ al);
		
		// Sorting the arraylist in ascending order.
		
		Collections.sort(al);
		System.out.println("Arraylist after Sorting in ascending order");
		System.out.println(al);	
			
		// sorting in desceding order.
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Arraylist after Sorting in descending order");
		System.out.println(al);	
			
			
			
			
		}

	
}
