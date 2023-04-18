package collection.byParesh;

import java.util.*;

public class AscDsc {
public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		
		al.add(56);
		al.add(516);
		al.add(561);
		al.add(156);
		al.add(85);
		al.add(27);
		al.add(228);
		al.add(19);
		al.add(33);
	
		System.out.println("The arraylist before sorting");
		System.out.println(al);
		
		// sorting the in ascending order
		Collections.sort(al);
		
		System.out.println("The arraylist after sorting in ascending order");
		System.out.println(al);
		
		// sorting the in descending order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("The arraylist after sorting in descending order");
		System.out.println(al);
		
		
		
	}
}
