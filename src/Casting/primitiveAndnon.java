package Casting;
public class primitiveAndnon {
	
	public static void main(String[] args) {
		// primitive and non primitive casting 
		// one datatype to another 
		// one type of class info  into another class . non primitive
		
		// implicit casting 
		byte b= 12;
		short s= b;
		int i= s;
		long ll= 1232;
		float ff =ll;
		
		
		System.out.println(b+" "+s+" "+i+" "+ff+" "+ll);
		
		System.out.println(".....................................");
		// explicit casting
		
		long l =3424546;
		int ii=(int) l;
		short ss=(short) ii;
		byte bb= (byte) ss;
		// info loss ...............
		System.out.println(l);
		System.out.println(ii);
		System.out.println(ss);
		System.out.println(bb);
		System.out.println(".......................................");
		
		
		// boolean casting not possible in java 
		
	}

}
