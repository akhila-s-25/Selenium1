package Inheritence;

public class Constructor_Inheritence {

	public static void main(String[] args) {
    
	  N obj = new N("Bunny", 2);
		
		
	}

}

class M{
	
	int a;
	M(String C ){
		System.out.println(C);
		System.out.println("Parent default");
		
	}
   
	
}
  
class N extends M{

	
	 N(String b, int a){
		 
		 
		 super(b);
		 
		 
	 }
	
	}	
	
	



