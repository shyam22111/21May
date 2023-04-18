package Constructor;

public class Basic {
	
	
// imp  by deepak.................................
	// Jvm creat constructor every time on behalf of you when we not declare constructor. whenever you creat object.
	// jvm(class loder) provide default value. int 0, Sring Null, Default constructor,(no argument Con)
	// User defined ( no argument constructor)
	//User defined ( argument constructor)
	// constructor initialize at the class loading as class and constructor name same.
	
	
	
	
	// Constructor is a block similar to a method same name class name
	//dose not have any return type
	// 3P and d modifier
	//Execute automatically when we creat obj
	// It is like method no need to call execute automatic when we create obj
	// When we create object in a method at that time class veritable/instance veritable/ veritable for object .... accupies memory inside object.
	// when we create another object at that time same variables occupies memory inside the object 
	// if there are n number employ veiables have default value 0 and null for n number employee .. not a good approch.
	//having same info for n employee .. create prob in project.
	// So we want when we creat object at a it should initialize value for that object
	// 3 ways to initialize object, Reference veriable, By using method and by using construcor.
	// first approach, using ref veiable- then info inside veriable for n employee would be same , not good approch;
	//second approach, using obj reference veritable then for each object require extra line of code (obj.veriable1, obj.v2) if n =1000 then 2*1000 line.... Sill not good apprch.
	// So use parameterized constructor. ( constructor parameter and class veiable/obj veriable differenciate with the help of this keyword.)
	// When we creat obj and passes parameter info- goes at constructor parameter- constructor info goes to class veiable or object veriable and save it.
	// so different obj have different info.
	// as per requirement use those object with their different values.
	
	// * Conclusion - Without constructor obj does not initialize in proper way, if initialise we require to write extra line of code. if we initialise directly then all obj got same info.
	// So Constructor useful- initialize the object.
	//  new keyword create obj 
	
	//1. complier creates default constructor- only when we not creat con. and provides defalt value.
	//2. no argue constructor -user defined( execute logic inside constructor(method) like calling method directly. ( constructor directly called when obj create in main method)
	//3. Parameterized user defined
	
	//**** calling constructor- 1) no argument if we want it execute logic inside constructor
	                           //2) Parameterized constctor- call by passing parameter 
	                            // like as we call method by passing parameter.
	                            //number of constructor also used like method as per requirement.
	// only 37% difference in constructor and method . 
	int sal;
	String name;
	String A;
	int num;
	
	
public static void main(String[] args) {
	 Basic ob = new Basic();		
	 System.out.println(ob.sal);
	 System.out.println(ob.name);
	 // here we have not initialise the object althogh jvm creat internally constructor on behalf of you , and provide default value.

	 
	 

}
	}
