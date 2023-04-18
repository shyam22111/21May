package String;

public class Reverse {

	public static void main(String[] args) {
		String main = "I love Minal";
		String reverse ="";

			
		String arr[]=main.split(" ");
		
		for(int i=main.length()-1;i>=0;i--) {
			reverse= reverse+main.charAt(i);
		}
		System.out.println(reverse); // reverse string 
		
	
		
		for(int a=0;a<arr.length;a++) {   // split string
			System.out.print(arr[a]);
		
			
		}
		
		
	}
}
