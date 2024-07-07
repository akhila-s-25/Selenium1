package AbstractDemo;

public class Base_demo {

	public static void main(String[] args) {
	
		grandchild obj = new grandchild();
		
		obj.abstractMethod();
		obj.NormalMethod();
		obj.NormalMethod1();
	 System.out.println("git demo 4");
	}

}

 
abstract class abstractDemo{
	
	
	// constructor
	abstractDemo(){
		
		System.out.println("abstract class constructor");
		
	}
	
   // Unimplemented Method
	abstract void abstractMethod();
	
   // Implemented Method
	void NormalMethod() {
		
		System.out.println("Normal Method in parent class ");
		
	} 
}
  

abstract class child extends abstractDemo{
	
void NormalMethod1() {
		
		System.out.println("Normal Method in child class ");
		
	} 
	
	
	
}


class grandchild extends child {

	
	void abstractMethod() {
		System.out.println("Implemented");
		
	}
	
	
	
	
	
}