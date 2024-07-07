
public class Student {

//Program 1 : Print Roll Number , Student Name, Marks
	
	
	int roll_num=1;
	int roll_num1=2;
	
	String Name="Bunny";
	String Name1="Sunny";
	 
	
      void S1_Marks() {
		
		System.out.println("Marks=95");
		
		
		 }
	
      void S2_Marks() {
	   System.out.println("Marks=50");
	   
   }
	
	
	
	  public static void main(String[] args) {
		
        Student s1=new Student();
        Student s2=new Student();
        
         System.out.println("Roll Number :" +s1.roll_num);
         System.out.println("Name " + s1.Name);
         
        
           s1.S1_Marks();
         
         System.out.println(".............");
       
         System.out.println("Roll Number :" +s2.roll_num1);
         System.out.println("Name " + s2.Name1);
        
         
         s2.S2_Marks(); 
         
          
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
