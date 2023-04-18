package MainMethodOverloding;

public class OverLad {
	public void main(int a) {	
		System.out.println(" 1 arg method");
	}
public void main() {
	System.out.println(" no arg method");
	}
public static void main(int a, int b) {
	System.out.println(" 2 arg method");
}
public void main(String s) {
	System.out.println(" 1 str arg method");
}
public int main(float f) {
	int a=10;
	return a;
}

public static void main(String[] args) {
	OverLad OV = new OverLad();
	OV.main();
	OV.main(0);
	main(0,12);
	OV.main(3.76f);
	OV.main("SH");
	System.out.println(OV.main(3.76f));
}

}
