package Inheritence;

public class Inheritence {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.BA();
        
	}

}

class A{
	 
	int i=10;
	static void AA() {
		
		System.out.println("Parent AA");
	}
	
	void AB() {
		
		System.out.println("Parent AB");
	}
	
	void AC() {
		
		System.out.println("Parent AC");
	}
	
}


class B extends A{
	
	
	
     void BA() {
		 AA();
		 AB();
		
		System.out.println( i +" child BA");
		
	}
	



  static void AA() {
		
		System.out.println("Child AA");
	}

  void AB() {
		
		System.out.println("child AB");
	}
	




}

class C extends B {
	
	

	
	void CC() {
		
		
		System.out.println("CC");
	}
		
	
	
}


class D extends C{
	

	void DD() {
		
		System.out.println("nbhdvn");
	}
	
}





