
public class CarConstructor {

	int cost;
	
	String color;
	
	
	CarConstructor(int cost, String color){
		
		this.cost=cost;
		this.color=color;
		
		//System.out.println(cost);
		//System.out.println(color);
	}
	
	
	
	public static void main(String[] args) {
		
		
		CarConstructor Maruti= new CarConstructor(100000,"Blue");
		
		CarConstructor Hundai= new CarConstructor(200000,"White");
		
	
		CarConstructor Tata= new CarConstructor(300000,"Orange");
	
	     System.out.println("cost of Maruti: " +Maruti.cost);
	
	     System.out.println("color of Maruti : " +Maruti.color);
	
	     System.out.println("cost of Hundai : " +Hundai.cost);
	 	
	     System.out.println("color of Hundai : " +Hundai.color);
	
	     System.out.println("cost of Tata : " +Tata.cost);
	 	
	     System.out.println("color of Tata : " +Tata.color);
	
	
	
	}




















}
