package MethodOverriding;



public class mainMetod {

	public static void main(String[] args) {
		parent p = new parent();
		p.BuyCar();// overridden method
		p.location();
		
		System.out.println(".................................................");
		
		child c =new child();
		c.BuyCar();    // overridded method
		c.location();  // inherited method
	}
	
}
