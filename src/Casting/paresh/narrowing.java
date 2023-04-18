package Casting.paresh;

public class narrowing {

	public class ExplictCastingExample { // Narrowing approach

		public static void main(String[] args) {
			
			double d = 3.141567898751425;
			float f =(float) d;
			long l=(long) f;
			int i =(int) l;
			short s=(short) i;
			byte b=(byte) s;
			

			System.out.println("Double value is:- "+ d);
			System.out.println("Float value is:- "+ f);
			System.out.println("Long value is:- "+ l);
			System.out.println("Int value is:- "+ i);
			System.out.println("Short value is:- "+ s);
			System.out.println("Byte value is:- "+ b);
		}
	}
}
