package Constructor;

public class ConstructorVelo {
	
	int a ;
	String str;
	

	
	ConstructorVelo(){
		
	}

	ConstructorVelo(int c, String d){
		a=c;
		str= d;
		
		
	}

	ConstructorVelo(String d,int c){
		a=c;
		str= d;
}
	
	public void Test() {
		System.out.println(a);
		System.out.println(str);
	}
}