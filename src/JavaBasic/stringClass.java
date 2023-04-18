package JavaBasic;

public class stringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "  shyam             ";
		String b= "Narwade";
		
		System.out.println(a.length());// Finding The length of String

		System.out.println(a.toLowerCase()); 
		System.out.println(a.toUpperCase());
		System.out.println(a.indexOf('y'));
		System.out.println(a.indexOf('a'));
       // equal and equalingnorecase  // boolen output
		System.out.println(a.isBlank()); // Boolean OutPut
		System.out.println(a.charAt(4)); 
		System.out.println(a.compareTo(b));
		System.out.println(a.concat(" "+b));
		System.out.println(a.contains("y")); // Boolean OutPut
		System.out.println(b.contains("l"));// Boolean OutPut
		System.out.println(b.repeat(3));    // Repeat b string 3 times.
		System.out.println(a.replace("s", "t")); // replacing  charctor
		System.out.println(a.replace("yam","lol")); // replacing Sequence of charctor
		System.out.println(b.replaceAll("a", "m"));//replacing all charctor
		System.out.println(b.endsWith("e")); // Boolean output
		System.out.println(b.strip()); // know more
	
		System.out.println(a);
		System.out.println(a.trim()); // leading and tailing space removed
		   
		

	}

}
