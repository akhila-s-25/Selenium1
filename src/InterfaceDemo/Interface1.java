package InterfaceDemo;

public interface Interface1 {

	 int a=10;
	 static int b=5;
	 final int c=9;
	 
	
	void A();
	void B();
	
	default void c() {
		
		System.out.println("c");
	}
	
	 static void d() {
		 
		 System.out.println("static methods ");
	 }
	
	private void e() {
		 
		System.out.println("Private methods");
		 
		 
	 }
	 
	 
}

class child implements Interface1{

	@Override
	public void A() {
		System.out.println("A");
	}

	@Override
	public void B() {
		System.out.println("B");
		
	}
	
	
}


 
