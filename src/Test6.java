
public class Test6 {

	public static void main(String[] args) {
		
		parent1 P_obj=new parent1();
		child1 C_obj =new child1();
		
		
		//parent1.PA();
		
		P_obj.PA();
		P_obj.PB();
		
	 
	System.out.println("......................");
	
	  //  child1.PA();
	  // C_obj.PA();
	  // C_obj.PB();
	   C_obj.CA();
	
	}

}


class parent1{
	
      void PA() {
    	  
    	  System.out.println("parent method");
      }
	
      void PB() {
    	  
    	  System.out.println("parent method 1");
    	  
    	  
      }
	
	
}

class child1 extends parent1{
	
	   
	 void PA() {
   	  
   	  System.out.println("New version of inherited parent method in child class");
     
	 }
	
	 void CA() {
		 
		 
		 System.out.println("New child method");
	 }
	

	
}






