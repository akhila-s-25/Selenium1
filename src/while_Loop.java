import java.util.Scanner;

public class while_Loop {

	public static void main(String[] args) {

                    
		            // 1. while loop
		

// Program 1 : Print Range from starting number to Last number number given by the user
				
	    // Scanner scanner = new Scanner(System.in);
				
				
		/* System.out.println("Enter First Number :"); //takes First number from the user
				
		  int  FirstNum =scanner.nextInt();  //scans it and  Store in a variable 
				
				
		  System.out.println("Enter Last Number :"); //takes Last number from the user
				
				
		  int LastNum = scanner.nextInt(); //scans it and  Store in a variable 
				
				
				
		  int number=FirstNum ;   // number which we are going to print starts from first number -Initial Value 
				
		    while(number<=LastNum) { //upto last number we have to print
				
					System.out.println(number);
				
				       number++;  // increment the value to print range from first to last number.
				}
				
				
				System.out.println("......End of Program 1......");
					
				System.out.println("");
				System.out.println("..Print numbers from 1 to 100..");	
		*/			
// Program 2 : Print from 1 to 100 numbers	
				
		/*		int i =1;
				
				while(i<=100) {
					
					
					System.out.println(i);
					
					i++;
				}
				
			System.out.println("....End of Program 2....");	
			System.out.println("");
			System.out.println("..Print even numbers from 1 to 100..");	
		*/		
// Program 3 :  Print even numbers from 1 to 100;
		/*		
		int e =2;
		
		while(e<=100) {
			
			System.out.println(e);
			
			  e+=2;
			
		}
	
*/
// Program 4: Print even numbers from user given range
		
	/*	
		   
		System.out.println("Enter 1st number :");
		
		     int Fnum = scanner.nextInt();
		     
		     
		    System.out.println("Enter 2nd number :");
		     
		  int Lnum=   scanner.nextInt();
		
				
				
			 int num =Fnum;	
			 
			   while(num<=Lnum) {
				   
				   if(num%2==0) {
				   
				   System.out.println(num);
				  
				   }
				      num++;
				   
			   }
				
				System.out.println("..........End of Program 4.......");
		*/		
// Program 5 : Print the numbers which are divisible by 5 from 1 to 100
			   
		/*	   
			   int d=5;
			   
			   while(d<=100) {
				   
				   System.out.println(d);
				   
				     d+=5;
				   
				   
				   
			   }

			System.out.println("..........End of Program 5.......");
				
			*/
	     

// Program 6 : Print the numbers which are divisible by 5 from user given Range
	     
	  /*      System.out.println("Enter First Number :");
				
			int num1 =scanner.nextInt();
				
		    System.out.println("Enter Second Number :");
		    
		    int num2 = scanner.nextInt();
		    
		    int num = num1;
		    
		    while(num<=num2) {
		    	
		    	if(num%5==0) {
		    	
		    		System.out.println(num);
		
		    }
				
			num++;	
				
	         }
		*/		
	

// Program  7 : Print sum of numbers from 1 to 100
	 /*    
	     int s = 1;
	     
	     int sum =0;
	     
	     while(s<=10){
	    	 
	    	   sum+=s; 
	    
	    	   s++;
	     }
	          
	     System.out.println(sum);    
	*/

// Program 8 : Print the sum of odd numbers from 1 to 10
	 /*    
	     int odd =2;
	     int sum_odd=0;
	     
	     while(odd<=10) {
	    	 
	    	 if(odd%2==1) {
	    		 
	    		 system.out.println(odd);
	    		
	    		 sum_odd+=odd;
	    		 
	    	 }
	    	 
	    	 odd++;
	    	 
	    	 
	     }
	     
	     
	     System.out.println(sum_odd);
	
	*/
	
	
// Program 9 : Print the numbers from 1 to 10 in reverse order.
	
	/*
	   int r =10;
	   
	   while(r>=1) {
		   
		   
		   System.out.println(r);
	       
		   r--;
	   
	   
	   }

	 */
		
// Program 10 : Print the Prime numbers from 1 to 100;
	   
// Prime Number : Any number which is divisible only by 1 and itself is a prime number
	   
	    // 0 and 1 are not prime numbers
		// 2 is the only even prime number
	   
	   
	   
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Minimum Number :");
		
		     int min=   scanner.nextInt();
		     
		System.out.println("Enter Maximum Number :");
		
		   int max =scanner.nextInt();
		   
		   
		   int number =min;
		   
		    
		   while(number<=max) {
			   
			   boolean isPrime=true;
			   
			   int i=2;
			   
			   if(number !=1) {
			      while(i<number) {
			    	  
			    	  if(number%i==0) {
			    		  
			    		  isPrime=false;
			    	        break;
			    	  }
			    	  
			    	  i++;
			    	  
			      } 
			     
			   }   else
			    	  isPrime=false;
			     
			     if(isPrime)
			    	  System.out.println(number);
			      
		             number++;
		   
		   }
			   
			   
			   
			   
			System.out.println("Thanks");   
			   
			   
			   
			   
		   }
		  
		   
		   
		   
		   
		 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	
	

	
	
	

}
