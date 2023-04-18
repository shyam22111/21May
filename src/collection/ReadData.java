package collection;

import java.util.*;
public class ReadData {
public static void main(String[] args) {
	
	// 3 ways read data 
	// for loop , advanced for loop and itrator
	ArrayList<Integer> Ar = new ArrayList<Integer>();
	Ar.add(34);Ar.add(63);Ar.add(85);Ar.add(36);Ar.add(24);Ar.add(54);Ar.add(68);Ar.add(49);Ar.add(43);
	
	System.out.println(Ar);
	System.out.println("................................................");
	//1) approch
	for(int i=0;i<Ar.size();i++) {
		System.out.println(Ar.get(i));
	}
	System.out.println(".................................................");
	
	// 2) approch 
	for(int l:Ar) {
		System.out.println(l);
	}
	
	System.out.println("..................................................");
	// 3 approch
	 Iterator it = Ar.iterator();
	 // when we dont know length / size then we have to use while loop 
	 
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	
	System.out.println("===================================================");

	// Ascending And Descending .........................
	
	Collections.sort(Ar);
    System.out.println(Ar);
    System.out.println("......................................................");

    
    Collections.sort(Ar,Collections.reverseOrder());
    System.out.println(Ar);
    System.out.println("..............................................................");
    Collections.shuffle(Ar);
    System.out.println(Ar);
}

}
