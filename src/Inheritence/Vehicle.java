package Inheritence;


public class Vehicle {

	public static void main(String[] args) {
	
// ...........Single level inheritence with more than one child...............
					
// Bike is a Parent class for which Bicycle and Bus are inherited child classes
		
	// 1. Calling  Parent Bike methods
		
	     Bike bike = new Bike();
	     
		 bike.start();
		 bike.stop();
		
		 System.out.println("*****************"); 
		
	// 2. Calling child Cycle methods 
	    
		 Cycle cycle = new Cycle();
		 
		 cycle.start();
		 cycle.stop();
		 cycle.bell();
	
		 System.out.println("*****************"); 
			
    //  3. Calling child bus methods
		
		  Bus bus = new Bus();
		  bus.start();
		  bus.stop();
		  bus.Ticket();
		
		 
		 System.out.println("*****************"); 
		 
		
	// 4. Creating Child object using Parent reference
		 // Top Casting
		  
		 Bike obj =new Cycle();
		 
		 obj.start();
		 obj.stop();
		 
		 // Here, Child Cycle methods are hidde, only we can call Parent Bike methods as we used Parent class as reference.
		 // But, at the run time child Cycle class method version overrides the parent Bike methods as object type is cycle.
		 // For Non static methods, the version that is executed is depends on the object that is being referred to but not reference type.
		 
		 // For Static methods, the version that is executed is depends on the Reference type but not object type. 
		 		 
		 
		 
	}

}

class Bike{
	
	void start() {
		
		System.out.println("Bike started");
	}
	
	
	void stop() {
		
		System.out.println("Bike stopped");
		
	}
	
	
}

class Cycle extends Bike{
	
	
   void start() {
		
	   System.out.println("cycle started");
	}
	
	
	void stop() {
		
		System.out.println("cycle stopped");
		
		
	}
	
	void bell() {
		
		System.out.println("bell rings");
		
	}
	
	
}


class Bus extends Bike  {
	
	
	void start() {
		
		   System.out.println("Bus started");
		}
		
		
	 void Ticket() {
		 
		 System.out.println("Bus Ticket");
	 }
		
}



	
	
	
	 
	 
	
	
	
	
	
	
	
	
	
	
	

