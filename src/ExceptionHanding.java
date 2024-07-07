
public class ExceptionHanding {
	
	int a=4;
	
	public static void main(String[] args) {
          
		
		
		ExceptionHanding obj =new ExceptionHanding();
		
		obj=null;
		
		try {
		System.out.println(obj.a);
		}
		
		catch(Exception e) {
			
			System.out.println("Null Pointer exception handled");
			
		}
		
		System.out.println("thanks");

		try {
		
			int i=2/0;
		System.out.println(i);
		
		}
		catch(Exception e) {
			
			System.out.println("Arithmetic Exception handled");
		}
		
		
		
		System.out.println("**********");
		
		
		
}
}