
public class Polymorphism {

	
	//Polymorphism
	
	void Multiply (int a, int b) {
		
		int result =a*b;
		
		System.out.println(result);
		
	}
	
    void Multiply (int a, int b, int c) {
		
		int result1 =a*b*c;
		
		System.out.println(result1);
		
	}
	
  void Multiply (int a, int b, int c, int d) {
		
		int result2 =a*b*c*d;
		
		System.out.println(result2);
		
	}
    void Multiply (int a, int b, int c, int d, int e) {
		
		int result3 =a*b*c*d*e;
		
		System.out.println(result3);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Polymorphism obj = new Polymorphism();
		
		obj.Multiply(2, 3);
		obj.Multiply(2, 3, 4);
		obj.Multiply(2, 3, 4, 5);
		obj.Multiply(2, 3, 4, 5, 6);
		
		
		
		
		
	}

}
