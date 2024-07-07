
public class Car {
  
	
	int cost;
	String color;
	
	// without using constructor
	
	public static void main(String[] args) {
		

		Car  Maruti = new Car();
		
		Car Hundai = new Car();
		
		Car Tata = new Car();
		
		Maruti.cost=100000;
		
		Hundai.cost=200000;
		
		Tata.cost=300000;
		
		Maruti.color="Blue";
		
		Hundai.color="white";
		
		Tata.color="Orange"; 
		
		
		System.out.println(Maruti.cost);
		
		
		
		
		
		
		
	}

}
