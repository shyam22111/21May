package Casting.paresh;

public class widening {

	public class ImpicitCastingExample { //widening approach
		
		public static void main(String[] args) {
			
			byte b = 50;
			short s=b;
			int i=s;
			long l =i;
			float f =l;
			double d =f;
			
			System.out.println("Byte value is:- "+ b);
			System.out.println("Short value is:- "+ s);
			System.out.println("Int value is:- "+ i);
			System.out.println("Long value is:- "+ l);
			System.out.println("Float value is:- "+ f);
			System.out.println("Double value is:- "+ d);
			
			
		}

	}
}
