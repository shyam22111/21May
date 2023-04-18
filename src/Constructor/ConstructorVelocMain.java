package Constructor;

public class ConstructorVelocMain {

	public static void main(String[] args) {
		ConstructorVelo ob1 = new ConstructorVelo();
		ob1.Test();
		System.out.println("...........................................................");
		ConstructorVelo ob2 = new ConstructorVelo(101,"Shyam");
		ob2.Test();
		System.out.println("...........................................................");
		ConstructorVelo ob3= new ConstructorVelo("Sucess",102);
		ob3.Test();

	}

}
