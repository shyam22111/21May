package collection.byParesh;

import java.util.ArrayList;

public class ArrayListBasic {
	
		
		public static void main(String[] args) {
			
			// Declaration of arraylist.
			
		   ArrayList al = new ArrayList();      // generic way of declaration
			
//			ArrayList<String> al = new ArrayList<String>();  // Specific
//			ArrayList <Integer>al1 = new ArrayList<Integer>();
			
			// Adding the elements inside the arraylist.
			
			al.add(15);
			al.add("abc");
			al.add('A');
			al.add(15);
			System.out.println(al);
			al.add(2, 'B');                // adding the values in any position
			System.out.println(al);
			al.set(2, "xyz");              // replacing the value of any perticular index
			System.out.println(al);
			//al.remove(4);                  // removing the specific index value
			System.out.println(al);
			System.out.println("Checking the empty status:-"+ al.isEmpty());
			System.out.println("How many elements are present:- "+ al.size());
			System.out.println("The index of any element:- "+ al.indexOf(15));
			System.out.println("The last index of any element:- "+ al.lastIndexOf(15));
			System.out.println("Presence of any element:-"+ al.contains(15));
			System.out.println("The data at perticuar index:- "+ al.get(1));
			
			
			// how to read data.
			
			// 1. regular for loop.
			for(int i=0; i<al.size();i++) {
				System.out.print(al.get(i)+ " ");
			}
			System.out.println();
			
			// 2. advanced for loop.
			
			for(Object value:al) {
				System.out.print(value+ " ");
			}
			
			
		}

	}
