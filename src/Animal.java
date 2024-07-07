
public class Animal {

	public static void main(String[] args) {
		
		Rabbit rabbit =new Rabbit();
		
		Cow cow=new Cow();
	
	System.out.println(".....Calling Parent class methods.....");
	System.out.println(" ");
	    
		//rabbit.eat();
	      
	   Rabbit.eat();  
		rabbit.sleep();
		
		System.out.println("  ");
		
		System.out.println(".......Calling Child class methods.....");
		
		System.out.println(" ");
		int result=Cow.eat();
		
		System.out.println(result);
		cow.sleep();
		cow.drink();
	  
		

	}
	
	
	
}


class Rabbit {
    
	static int eat() {
		
		System.out.println("eat method in  Rabbit Parent class");

          int i=1;
          return i;
	}
	
	
	void sleep () {
          
		System.out.println("sleep method in Rabbit Parent class");
	
	}

    
	
}
	
	

 class Cow extends Rabbit{
	
	
	
    static int eat() {
		
		System.out.println("Inherited eat method in  cow child class");
		 int i=5;
         return i;
	}
	
	
	  void sleep () {
          
		  System.out.println("Inherited sleep method in  cow child clas");
	
	}

	
      void drink() {
	
    	  System.out.println("additional drink method in  cow child clas");
    		
           }


     
}
 
 
 
 
 
 
 