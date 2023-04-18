package AccessModifier;
//
//Multiple Inheritance:-  (Multiple Parents)
//=====================================================
//=> The process of extending more than one parent class at a time then it is called as multiple inheritance.
//=> Java will not support multiple Inheritance.
//=> To overcome this Interfaces are provided.
//
//
//		Class A 	Class B
//			\	/
//			 Class C
//
//
//Class C extends A,B{
//
//	XXX  <=== Not allowed in java. you will get the error at the time of class creation only.
//
//}
//
//=> If both classes A and B contains the method with same method name then compiler will confuse which method to call.
//=> There is no way to resolve it.
//=> This issue is called as Diamond ambiguity Problem or ambiguity issue.
//
//
//Hybrid Inheritance:- 
//===============================================================
//
//=> If group of inheritances used simulteniously then it is called as Hybrid Inheritance.
//
//
//				Class A
//   				   ^	
//   				   |
//				Class B
//   				   ^	
//   				   |
//				Class C
//				/	\
//			Class D 	Class E
//				\	/
//				 Class F
//
//
//
//=> Multiple and Hybrid Inheritance is not supported by Java Classes.
//=> To overcome ambiguity issue java interfaces will help us.
//
//
//Access Modifiers:-
//=================================================================
//
//Access Modifieres:- It decides the scope of variables and methods.
//
//
//1. Public
//2. Protected
//3. Default 
//4. Private
//
//
//Private:- The Private access modifier can be accessible within the class only.
//
//Default:- If nothing has declared as a modifier, then java treat it as default.
//	  The default access modifier is accessible within the same package only.
//
//Protected:- It is accessible within package and can also access outside the package but needs inheritance.
//
//Public:- It is accessible anywhere in project.
//
//
//
//
//Variable Types:- 
//===================================================================
//
//Local Variable:- A variable declared inside the body of the method then it is called as local variable.
//
//Global Variable:- A variable declared inside the body of the class but outside the method then we call it as global variable.
//
//Static Variable:- A variable is declared with static keyword called as static keyword.
//		  Its shared among all object of the class.
//		  Memory allocation for static variable is done only once, when class is loaded.
//
//
//
//
