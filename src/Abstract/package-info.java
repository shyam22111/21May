package Abstract;
//Abstract Keyword/Abstract Method/Abstract Class
//================================================
//
//Abstract (General Concept):- Not Complete, Partial thing , Not Clear.
//Abstract Keyword is applicable to methods and classes only.
//
//General Method Writing:-     public void test()             <=== Method Declaration	
//{
//
//	    <=== Method Definition
//}	
//
//
//Abstract Method:- 
//==================
//
//=> The methods which has only declaration not the definition that methods are called as abstract methods
//=> An abstract method is declared with abstract keyword before methodname.
//=> There is no body present in absract method.
//=> An abstract method in java does not have curly braces it ends with semicolon ();
//
//
//Abstract Class:- 
//=================
//
//=> A class declared with abstract keyword is known as abstract class.
//=> Abstract class is nothing but an incomplete class where programmer can declare complete as well as incomplete methods.
//=> An Incomplete method is method where method declaration will be present and definition will not available.
//=> Abstract class can be created without any abstract method also.
//=> We cant create object of abstract class.
//=> To create object of abstract class there is approach called as concrete class.
//
//
//Concrete Class:- 
//==================
//
//=> A class which provides definition for all the incomplete methods which are present inside abstract classs with the help of 
//extends keyword is known as concrete class.
//=> We can create the object of concrete class.
//
//
//##########################
//Steps to write the program.
//
//Create abstract class
//create concrete class
//create main class.
//
//##########################
//
//
//Program 1:- 
//=================================================================================================================================
//
//public abstract class Demo {
//// complete method.
//public void test() {
//System.out.println("Hi");
//}
//
//// incomplete method
//public abstract  void test1();
//public abstract  void test2();
//
//}
//
//public abstract class Demo1 extends Demo {
//public void test1() {
//System.out.println("Test 1");	
//}
//}
//
//public class Demo2 extends Demo1 {
//
//public void test2() {
//System.out.println("Test 2");
//}
//public static void main(String[] args) {
//
//Demo2 d2 = new Demo2();
//d2.test();
//d2.test1();
//d2.test2();
//}
//}
//
//
//
//
//
//Program 2 :-
//=====================================================================================================================================
//
//
//public abstract class Vehicle {
//public abstract int getnumberofwheels();
//}
//
//public class Bus extends Vehicle {
//public int getnumberofwheels() {
//return 6;
//}
//}
//
//public class Car extends Vehicle {
//public int getnumberofwheels() {
//return 4;
//}
//}
//public class Bike extends Vehicle {
//
//public int getnumberofwheels() {
//return 2;
//}
//
//}
//
//
//public class VehicleMain {
//public static void main(String[] args) {
//
//Bus b = new  Bus ();
//System.out.println(b.getnumberofwheels());
//
//Car c = new  Car ();
//System.out.println(c.getnumberofwheels());
//
//
//Bike bk = new  Bike ();
//System.out.println(bk.getnumberofwheels());
//
//}
//}
//
//
//
//
//Note:- 
//======================================================
//1. Static method can not be abstract.
//2. Abstract concept is not allowed for constructor.
//3. In Abstract class you can create static method but static method can not be abstract.
