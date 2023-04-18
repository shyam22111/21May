package JavaProgramsIMP;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateChar2 {

	public static void main(String[] args) {
		
		findDuplicate();
		
	}
	
	public static void findDuplicate() {
		
		String str ="how to find duplicate characters in a string in java 8";
		char[] cr = str.toCharArray();
		
		
		HashMap<Character, Integer> HM = new HashMap<>();
		
		for(Character ccr : cr ) {
			if(HM.containsKey(ccr)) {
				HM.put(ccr, HM.get(ccr)+1);
			}
			else {
				HM.put(ccr, 1);
			}
			
		}
		
		// print entry values in HM 
		
	       Set<Entry<Character, Integer>> entryset = HM.entrySet();
	       for(Entry<Character, Integer> entry:entryset) {
	    	   if(entry.getValue()>1) {
	    		   System.out.println(entry.getKey()+" "+"repeted times"+entry.getValue());
	    	   } 
	    	   else {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
	       }
		
		
	}
	
}
