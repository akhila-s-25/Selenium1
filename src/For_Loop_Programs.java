
public class For_Loop_Programs {

	public static void main(String[] args) {
   
		 numbers();
		
		 evenNum();
		
		 oddNum();
		
		 PrimeNum();
		  
		 sumNum();
		
		 MultiplicationNum();		
		
		 factorial();	
		
		 divisible();	
		
		 multiplyTable() ;
		 
		 MultiplyTables();
		
		 star();
	 
	     Pyramid();
	       
	     PyramidNumbers();
	
		
	
		
	
	}

	
//1. Print numbers from 1 to 10
	
	    static void numbers() {
	    	
	    	System.out.println(".......Print 1 to 10 Numbers.....");
	    	
	    	
	    	  for(int i=1; i<=10; i++) {
	    		 
	    		 
	    		 System.out.println(i);
	    	  }
	    	  
	    	 System.out.println("..................");  	  
	    }
	    	
// 2. Print even numbers from 1 to 10
	    
	    static void evenNum() {
	    	
	    	System.out.println(".......Print even Numbers from 1 to 10.....");
	    	
	    	 
	    	for(int i=1; i<=10;i++) {
	    		
	    		if(i%2==0) {
	    		System.out.println(i);
	    		
	    	       }
	    	}
	    	System.out.println(".................."); 
	    	
	    }
	    	
	    	
	    	
// 3. Print Odd numbers from 1 to 10	    	
	    	
	      
	       static void oddNum() {
	    	  
	    	   System.out.println(".......Print odd Numbers from 1 to 10.....");
		    	
	    	    for(int i=1;i<=10;i++) {
	    	    
	    	    	if(i%2==1) {
	    	    		
	    	    		
	    	    		System.out.println(i);
	    	    	}
	    	    }	
	    	    System.out.println(".................."); 
	       }	

	    
	    	
// 4. Print Prime numbers from 1 to 100
	       
	       static void PrimeNum() {
		    	  
	    	   System.out.println(".......Print Prime Numbers from 1 to 100.....");
		    	
		    	 
		    	  int i;
		    	  
		    	  for( i=2; i<=100; i++) {
		    		  boolean isPrime=true;
		   
		    	       for(int j=2; j<i;j++) {
		    				  
	    				   if(i%j==0) {
	    					   
	    					   isPrime=false;
	    					   break;			   
		    		  
	    				   }    
	    				   
		    	       }
		    	      
		    	       if(isPrime) {
		    	      System.out.println(i); 
		    	       }
		    	      
		    	  }
		    			 
		    	  System.out.println(".................."); 	 
		    			 
		    		
		      }
	       
	       
	       
// 5. Print  sum of numbers from 1 to 10 
	       
	       static void sumNum() {
	    	   
	    	   System.out.println(".......Print Sum of Numbers from 1 to 10....."); 
	    	 
	    	   int sum =0;
	    	  
	    	   for(int i=1;i<=10;i++) {
	    		   
	    		   
	    		    sum+=i;
	    		   
	    	   }
	    	   
	    	   
	    	   System.out.println(sum);
	    	   
	    	   
	    	   
	       }
	       
	       
// 6. Print Multiplication of numbers from 1 to 10
	       
	       
	       static void MultiplicationNum() {
	    	   
	    	   System.out.println("......Print Multiplication of Numbers from 1 to 10....."); 
		    	 
	    	   
	    	   int multiply=1;
	    	   
	    	    for(int i=1; i<=10; i++) {
	    	   
	    	        multiply*=i ;
	    	   
	    	   
	    	    }
	    	   
	    	   System.out.println(multiply);
	       
	    	   
	    	   System.out.println(".......................");
	       
	       }
	    
// 7. Print Factorial value of 5
	       
	       
	       static void factorial() {
	    	  
	    	   System.out.println("......Print factorial value of 5 i.e., (5*4*3*2*1)=120....."); 
	    	   int fact =1;
	    	   
	    	   for(int i=1; i<=5;i++) {
	    		   
	    		   fact*=i;
	    		   
	    	   } 
	    		
	    	   System.out.println(fact);
	    	   
	    	   System.out.println("....................");
	       }
	    	   
	    	   
	    	   
// 8. Print numbers from 1 to 50 which are divisible by 5;
	       
	       static void divisible() {
	    	   
	    	   System.out.println("......Print numbers from 1 to 50 which are divisible by 5"); 
	    	  
	    	   for(int i=1; i<=50;i++) {
	    		   
	    		   if(i%5==0) {
	    			   
	    			   System.out.println(i);
	    			   
	    		   }
	    			   
	    	   }
	    		  
	    		  
	    	   System.out.println("....................");
	    		   
	       }   
	    	   
	    	   
// 9. Print Multiplication Table of given number
	       
	       
	       static void multiplyTable() {
	    	   System.out.println(".......Print Multiplication Table of a given number....."); 
	    	  
	    	   int number =5;
	    	   
	             for(int i=1; i<=10; i++) {
	    		   
	    		   
	    		   System.out.println(number+"*"+i+"="+number*i);
	    		   
	    		   
	    	   }
	    	  System.out.println("..........................."); 
	       }
	    	   
	    	   
// 10.   Print Multiplication tables of 5 to 10 numbers ;	    	   
	       
	    	   
	       static void MultiplyTables() {
	    	   
	    	   System.out.println(".......Print Multiplication Tables of a given numbers....."); 
	    	   
	    	   for(int i=5; i<=10;i++) {
	    		   
	    		   for(int j=1; j<=10; j++) {
	    			   
	    			   System.out.print(i*j + " ");
	    			   
	    		   }  
	    			   
	    		   System.out.println();
	    		   
	    	   } 
	    		   
	         System.out.println("..........................."); 
	       }   
	    	   
	    	   
// 11. Program to Print  5 Stars "*****" 5 times.
	
	
	
	 static  void star() {
		 
		 System.out.println(".......Print  5 Stars ***** 5 times....."); 
  	   
		  for(int i=1; i<=5 ;i++) {
			  
	          for(int j=1; j<=5; j++) {
			  
			     System.out.print("*");
	          }
			
	          System.out.println();
		  }
		
		  
		    
		      //    or 
		          
		     /*    for (int i=1; i<=5;i++){
		         
		              System.out.print("*****");
		         
		           }
		     
		     */
	        
		     System.out.println("...........................");   
	 
	           }
	 

              
	 
// 12. Program to Print Pyramid with Stars
	 
	   
	  static void Pyramid() {
		  
		  System.out.println(".......Print Pyramid with Stars ....."); 
		  
		     for(int i=1;i<=10;i++) {
		    	 
		    	 for(int j=1; j<=i;j++) {
		    		 
		    		 System.out.print("*");
		    		 
		    		 
		    	 }
		    	
		    	 System.out.println(); 
		    	 
		     }
		     System.out.println("...........................");   
			 
	  }
		  
	  
	            

// 13. Program to Print Pyramid with numbers
	  
	  
	      static void PyramidNumbers() {
	    	  System.out.println(".......Print Pyramid with numbers ....."); 
	    	   
	    	  for(int i=1;i<=5;i++) {
	    		   
	    		   for(int j=1; j<=i;j++) {
	    			   
	    			     System.out.print(j);
	    			   
	    			   
	    		   }
	    		  System.out.println(); 
	    		   
	    	   }
	    	  
	    	  System.out.println("...........................");   
				 
	    	  
	      }
	
	
	
	
	
	
	
	

	      
	      
	      
	    			 
	    	
	      
	      
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	      

} 
	

