package JavaProgramsIMP;

import java.util.HashMap;

import java.util.Set;

public class DuplicateChar {
	
	// https://youtu.be/UaRbZqAsoco   
	// 2 for 2 if 

	public static void main(String[] args) {
	DuplicateCharStr("Java");
	DuplicateCharStr("Ramchandra");
	DuplicateCharStr("Maharashtra");

	}
	
	public static void DuplicateCharStr(String str) {
		
		
		char[] words = str.toCharArray();
		 
		HashMap<Character, Integer> HM = new HashMap<Character,Integer>();
		
		for(Character ch : words) {
			if(HM.containsKey(ch)) {
				HM.put(ch, HM.get(ch)+1);              // a=2    key a already contains value =1 +1 =2 
			}
			else {
				HM.put(ch, 1);           // java  j=1,a=1,v=1,               
				
			}
		}
		   // print HasMap 
		 Set<HashMap.Entry<Character, Integer>> entryset  = HM.entrySet();
		 
		 for(HashMap.Entry<Character, Integer> entry : entryset) {
			 if(entry.getValue()>1) {
				 System.out.println(entry.getKey()+":"+entry.getValue());
			 }
			 
		 }
		 
		 
	}

}
