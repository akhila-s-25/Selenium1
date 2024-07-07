package AbstractDemo;

public class school{
	
	   public static void main(String[] args) {
		   
		   
		   Teacher obj =new Teacher (9,600000);
		   
		   obj.age();
		   obj.marks();
		   obj.result();
		  
	  
	   
	   }
	
}

abstract class student {

	 int rollNum;
	 
	student(int rollNum){
		
		this.rollNum=rollNum;
		
		System.out.println("abstract class constructor " + rollNum);
		
	}
	
	     abstract void age();
           
           abstract void marks();
           
           void result() {
        	   
        	   System.out.println("Result");
           }
           
//     student(){
//    	 
//    	 
//     }  	
	
}


class Teacher extends student{

	 int salary;
	 
	 Teacher(int rollNum,int salary){
		 
		 super(rollNum);
		 this.salary=salary;
		 System.out.println("child class constructor : " + salary);
		 
		 
	 }
	
	
	@Override
	void age() {
		System.out.println("age");
		
	}

	@Override
	void marks() {
		
		System.out.println("Marks");
	}

	
	 void result() {
  	   
  	   System.out.println("override Result");
     }
     
	
	
}


 