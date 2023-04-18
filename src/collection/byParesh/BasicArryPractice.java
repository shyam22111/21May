package collection.byParesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicArryPractice {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		//add method 
		ar.add("Shyam");
		ar.add(18);
		ar.add('A');
		ar.add(true);
		ar.add(8.9f);
		System.out.println(ar);
		
		System.out.println("........................................................");
		ArrayList<String> SA = new ArrayList<>();
		SA.addAll(ar);
		// all data saved in String data type
		System.out.println(SA);
		System.out.println("....................................................");
		
		ArrayList<Integer> IA = new ArrayList<>();
		IA.add(65);
		IA.add(1, 54);
		System.out.println(IA);
		
		System.out.println(".........................................................");
		
		List<String> LS = new ArrayList<>();
		LS.add("4 Aniket");LS.add("5 Pratap");LS.add("6 velocity");LS.add("7 Sandeep");
		LS.add("1 shyam"); LS.add("2 Vinod");LS.add("3 Manish");LS.add("4 Aniket");LS.add("5 Pratap");LS.add("6 velocity");LS.add("7 Sandeep");
		System.out.println(LS);
	System.out.println("............................................");
	
		System.out.println(LS.get(6));System.out.println(LS.get(1));
		
		
		//  for loop and advanced for loop
		
		for(int i=0;i<LS.size();i++) {
			System.out.println(LS.get(i));
		}
		
		System.out.println(".............................................");
		// advanced for loop
		
		for(String s :LS) {
			System.out.println(s);
		}
		
		System.out.println("........................................................");
		for(int i =0;i<IA.size();i++) {
			System.out.println(IA.get(i));
			
		}
		
		System.out.println("................................................");
		for(int n:IA) {
			System.out.println(n);
		}
		System.out.println("......................................");
	    Collections.sort(LS);
	    System.out.println(LS);
	    Collections.shuffle(LS);
	    System.out.println(LS);
		
	    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	    
	}
	
}
