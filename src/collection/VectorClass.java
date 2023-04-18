package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;



public class VectorClass {
public static void main(String[] args) {
	 
	Vector<Integer> vc = new Vector<>();
	vc.add(43);vc.add(64);vc.add(3);vc.add(27);vc.add(63);vc.add(6);
	System.out.println(vc);
	System.out.println("..............................");
	
	// Read data  3 ways + Enumirator /// .capacity additional method
	for(int i=0;i<vc.size();i++) {
		System.out.println(vc.get(i)+" ");
	}
	System.out.println("...........................................");
	// advanced for 
	for(int g:vc) {
		System.out.println(g);
	}
	System.out.println("...............................");
    Iterator itr = vc.iterator(); // if we dont know length or size
    while(itr.hasNext()) {
	   System.out.println(itr.next());
   }
  System.out.println(".......................................");
  
  
  // Additional by using ennumirator
        Enumeration<Integer> v = vc.elements();
        while(v.hasMoreElements()) {
        	System.out.println(v.nextElement());
        }
        System.out.println("...........................................................");
}    
	
	
	
}
