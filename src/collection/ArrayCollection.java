package collection;

import java.util.*;
// add,addAll,remove,removeAll,Clear, contains,IsEmpty,size     Collections- Shuffle and  short

public class ArrayCollection {
    // arraylist used to store Duplicate are Allowed and Sequence preserved/
	// useful when retriving Data.
    //Growable in nature and Heterogeneous data stored .......
   // arraylist implited by list I and List I by Collections c
  // collection class i by collection and collection i by iterator
public static void main (String[] args) {

	
ArrayList<Object> ar = new ArrayList<Object>();
ar.add("Shyam");
ar.add(2.05);
ar.add('A');
ar.add(95);
ar.remove(2.05);
System.out.println(ar.size());


System.out.println(ar);
System.out.println("............................................................");

ArrayList<String> arr = new ArrayList<String>();
arr.add("Shyam");
arr.add("RAm");
arr.add("NAth");
arr.add("DAD");
System.out.println(arr);
System.out.println("............................................................");

ArrayList<String> arr2 = new ArrayList<String>();
arr2.add("ssss");
arr2.add("hhh");
arr2.add("yyy");
arr2.add("mm");
arr2.add("aaa");
//arr2.clear();
arr2.remove(0);
//arr2.removeAll(arr2);
System.out.println(arr2.contains("mm"));
System.out.println(arr2.get(1));
System.out.println(arr2.addAll(arr));
System.out.println(arr2);
Collections.shuffle(arr2);
Collections.sort(arr2); 
System.out.println(arr2);


System.out.println("............................................................");

List<Integer> list2 = new ArrayList<Integer>();
list2.add(21);
list2.add(11);
list2.add(51);
list2.add(1);
 System.out.println(list2);
 System.out.println("............................................................");
 
// Collections.sort(list2);
// System.out.println(list2);

// Collections.sort(list2);
// for(Integer number:list2){
//   System.out.println(number);
// }
  // Linkedlist used when Addition and diletion operation less
  // Shifting of oll object takes place during addition/ deletion so performance slow....
 
 
 
  //*****************************************************
 
  // Linkedlist used when Addition and delation operation more/ manupilation
  // during addition/ deletion link between object removed and deleted object in garbage collector.
  // Duplicate and Sequence preserved...
 

 LinkedList<Object> Llist = new LinkedList<Object>();
   Llist.add("Shyam");
   Llist.add(2.05);
   Llist.add('A');
   Llist.add(95);
   System.out.println(Llist);
 
   System.out.println("............................................................");
 
 
  //.................................................
  // SET -Duplicate and Sequence not preserved... Heterogeneous and null allowed ..HasSet and Linked HasSet
  // Default capacity 16 and load factor 0.75 ..
  // After 75p filled  created new object and previous garbage..
 
  HashSet <Object> hs = new HashSet <Object>(100,(float) 0.90);
  hs.add("narwade");
  hs.add(5415);
  hs.add('p');
  hs.add(95.24);
  System.out.println(hs);
 
  // linked HasSet same as HasSet only insertion order preversed..
  System.out.println("............................................................");
}
}
