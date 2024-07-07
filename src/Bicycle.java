
public class Bicycle {

	String colour;
	
	String Type ;
	
	int Cost ;
	
	Bicycle(String colour, String Type, int Cost ){
		
		this.colour=colour;
		this.Type=Type;
		this.Cost=Cost;
		System.out.println("default constructor called");
	
	
	}
	 
	
    void start() {
    	
    	 System.out.println("Start cycling");
    	
    }			
	
	void Break() {
		
		
		System.out.println("Cycle Break applied succesfully");
	}
    
	
	
  
	
	public static void main(String[] args) {
		
		
		
		Bicycle cycle=new Bicycle("Orange", "Ladybird", 25000);
		
		
		System.out.println("color of cycle :" +cycle.colour);
		System.out.println("cycle type :" +cycle.Type);
		System.out.println("cost of cycle :" +cycle.Cost);
	
		 
		cycle.start();
		
		cycle.Break();
		
        Bike honda =new Bike("white","Honda",200000);
        
          System.out.println("......child class.........");   
        
      System.out.println(honda.colour);
        
        honda.start();
        honda.Break();
        honda.gear();
        
        
	
	}
}

class Bike extends Bicycle {
	
     Bike(String colour, String Type, int Cost) {
		super(colour, Type, Cost);
		
	}


	
	
	
	//String colour;
	
	void start() {
    	
   	 System.out.println("Start bike");
   	
   }			
	
	void Break() {
		
		
		System.out.println("stop bike");
	}
	
	
	void gear () {
		
		
		System.out.println("gear applied successfully");
		
	}
	
	
 
	 
	
	
	
}


