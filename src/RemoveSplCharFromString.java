
public class RemoveSplCharFromString {
	
// Remove Junk from String
	// By using Regx- Regular Expression, Repalce All method
	
	
	public static void main(String[] args) {
		
		
		String S ="S @h% 8y(a4 & m";
		String A = " R8 )&E 7)(7MO-=V4#E&^Dj#!3un-#k";
		
	
		
		String S1 =S.replaceAll("[^a-zA-Z]", "");
     	String S2 =A.replaceAll("[^a-zA-Z]", "");
         System.out.println(S1);
          System.out.println(S2);
        
	}

}
