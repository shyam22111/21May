

public class ReverseString1 {
	

	public static void main(String[] args) {
		
		String name = "Panshewadi", reverse="";   
		
		for(int i=name.length()-1; i>=0;i--) {   // we have to go reverse so length-1( heighest) index comes firt. then last but one....
			reverse=reverse+name.charAt(i);
		}
		System.out.println(reverse);
	}      

}
// i=name.length()-1 = last index 
//i>=0 = condition 
//i-- = decrement
// reverse=reverse+name.charAt(i) = reverse blank = reverse=i = reverse=i+d = reverse=id+a ............