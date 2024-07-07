
public class Test4 {

	public static void main(String[] args) {
		
		Test4 obj=new Test4();
		
		
		
		// 1.CALLING METHOD WITH RETURN TYPE AND NO INPUT
		
		  String IPLWinner=  obj.winner();
	
	       System.out.println(IPLWinner);
	       
	    //2. CALLING METHOD WITH RETURN TYPE AND INPUT
			
	       int SumOfNum =obj.addNumbers(2, 3);
			
			System.out.println("sum of 2 +3 = "+ SumOfNum);
	       
	       
		// 3.CALLING METHOD WITH NO RETURN TYPE AND WITH INPUT
		
		       obj.Marks("Mahesh");
	     
	    
	
	    // 4. CALLING METHOD WITH NO RETURN TYPE AND NO INPUT
	       
	             obj.student();
	    
	
	}


    // 1. METHOD WITH RETURN TYPE AND INPUT
	
	      int addNumbers(int a, int b) {
		 
		      int sum =a+b;
		    
		      return sum;
		 
			 }

    
	//  2. METHOD WITH NO RETURN TYPE AND WITH INPUT 
	      
	   void Marks(String Name) {
			
	    	  
	    	  int Marks=95;
	    	  int Marks1=70;
	    	  
	    	  if(Name.equals("Akhila")) {
	    		  
	    		  System.out.println("Marks: "+ Marks+" Congratulations..!! You have Passed exam");
	    		  
	    		  
	    		  
	    	  }else if (Name.equals("Mahesh")) {
	    		  
	    		  
	    		  System.out.println("Marks: "+ Marks1+" Congratulations..!! You have Passed Exam");
	    	  
	    	       
	    	  }
			
	    	
	    	
	      }




     // METHOD WITH RETURN TYPE AND NO INPUT
	   
	    String winner() {
	    	
	    	
	    	String winner ="csk";
	    	
	    	return winner;
	    	
	    	
	    	
	    }


      // METHOD WITH NO RETURN TYPE AND NO INPUT
	    
	    
	       void student() {
	    	   
	    	   System.out.println("No Return Type and No Input");
	    	   
	    	   
	       }




























































































}
