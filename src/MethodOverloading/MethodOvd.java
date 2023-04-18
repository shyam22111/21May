package MethodOverloading;

public class MethodOvd {
	
	public void m1() {
		System.out.println(" m1 no argument method exicuted");
	}
	public void m1(float f) {
		System.out.println(" m1 1 argument method exicuted");
	}
	public String m1(int a, int b) {
		System.out.println(" m1 2 argument method exicuted with return type");
		return "shyam";
	}
	public int m1(int a) {
		System.out.println(" m1 1 argument method exicuted with int return type");
		return 10;
	}
public static void main(String[] args) {
	  
	MethodOvd ov = new MethodOvd();
	ov.m1();
	System.out.println(	ov.m1(34));
	System.out.println(	ov.m1(89, 67));
	ov.m1(3.98f);
	ov.m1(34);
	ov.m1(89, 67);
	
}
}
