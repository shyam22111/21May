package collection.byParesh;

import java.util.*;

public class VectorPractice {

		
		public static void main(String[] args) {
			 
			Vector vec = new Vector();
			
			// Adding the elements inside the arraylist.
			
					vec.add(15);
					vec.add("abc");
					vec.add('A');
					vec.add(15);
					vec.add(15);
					vec.add("abc");
					vec.add('A');
					vec.add(15);
					vec.add(15);
					vec.add("abc");
					vec.add('A');
					vec.add(15);
					System.out.println(vec);
					vec.add(2, 'B');                // adding the vvecues in any position
					System.out.println(vec);
					vec.set(2, "xyz");              // replacing the vvecue of any perticular index
					System.out.println(vec);
					//vec.remove(4);                  // removing the specific index vvecue
					System.out.println(vec);
					System.out.println("Checking the empty status:-"+ vec.isEmpty());
					System.out.println("How many elements are present:- "+ vec.size());
					System.out.println("The index of any element:- "+ vec.indexOf(15));
					System.out.println("The last index of any element:- "+ vec.lastIndexOf(15));
					System.out.println("Presence of any element:-"+ vec.contains(15));
					System.out.println("The data at perticuar index:- "+ vec.get(1));
					System.out.println("Checking the capacity:- " + vec.capacity());	
			
			
					// for+ advanced for loop + iterator+ list iterator + ennumeration
					
					 Enumeration en = vec.elements();
					 while(en.hasMoreElements()){
						 System.out.println(en.nextElement());
					 }
		}

	}


