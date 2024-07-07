import java.util.Scanner;
public class Test1 {

// Program to check whether a string is a valid password.

	
	
	public static void main(String[] args) {
	
		 Scanner scanner=new Scanner(System.in);
		
		 System.out.println("Please Enter Correct Password :");
		 
		 
	       
          String Password=  scanner.nextLine();
          
          
          System.out.println("User Entered Password :" +Password);


             if(Password.equals("")) {
            	 
            	 System.out.println("Password should not be blank , Enter valid Password");
            	 
             
            	 
             } else if(Password.equals("Pokemon@123")) {
            	 
            	 
            	 System.out.println("Password is correct");
             
             } else
             {
            	 
            	 System.out.println("Incorrect Password, Enter Valid Password");
             }
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
            	 
             }

















}
