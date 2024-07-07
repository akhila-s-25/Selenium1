
public class Do_while_loop {

	public static void main(String[] args) {
// Do While Loop
		
// Program 1 : Print Prime Numbers from 1 to 100 
		
	/*	
		int P=1;
		
		
		do {
		
			boolean isPrime=true;
			
			int i =2;
			
			if(P!=1) {
				
				while(i<P) {
					
					
					if(P%i==0) {
						
						isPrime=false;
						break;
						
						
					}
				  
					i++;
				
				}
				
			}
			
			else isPrime=false;
			
			if(isPrime) {
				
				System.out.println(P);
			}
				
				
				P++;	
			}
		

		while(P<=100);
		
		
	*/

// Program 2 : Print odd numbers from 1 to 100
		
		int odd=1;
		
		do {
			
		     if(odd%2==1) {
			 System.out.println(odd);
			
		     }
			odd++;
			
		}while(odd<=100);
		
		
		
// Program 3 : Print numbers from 1 to 10
		
		int a =1;
		
		
		do {
			
			System.out.println(a);
			a++;
			
		}while(a<=10);
		
		
		
		
		
		
		
		

		
		
		

	}

}
