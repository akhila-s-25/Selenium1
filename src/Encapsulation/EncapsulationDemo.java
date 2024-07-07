package Encapsulation;
import java.util.Scanner;

class BankBalance   {
	
	BankBalance(int AccountNumber ){
		
		System.out.println("Your Account Number is : " + AccountNumber);
		
		
	}

	private String balance="10000000000000000000000000000000000000000000€  euros ";
	   
	private int AccountNum=123;
	   
	 
	 //getter method
	 public void getbalance(int AccountNumber) {
		 
		 
		 if (AccountNumber==1234567890) {
			 
			 System.out.println("Your Bank Balance : " +balance);
			 
			 System.out.println("Thanks...!!!");
			// return balance;
			 
			 
		 }
		 else {
			 
			 System.out.println("Please enter correct account number..");
		 }
		//return (Integer) null;
	 
		 
		 
		 
	 }
	 
	
	 
	 // setterMethod
	 
	 public void setAccountNum(int AccountNum) {
		 
		 this.AccountNum=AccountNum;
		 
		 System.out.println("Your new account number : "+ this.AccountNum);
	 }
	
}




public class EncapsulationDemo  {
	  
	// Encapsulation : Hiding the data behind the methods by declaring variables with private modifier so that
	// outside classes wont be able to access the private data which helps in data security.
	// they can access the data only through getter and setter methods.
	// it provides privacy and security, allowing only authorized users to access and change the data.
	
	
	public static void main(String[] args) {
	
		
	
		Scanner scanner =new Scanner(System.in);
		  
		   
		System.out.println("Enter your Good Name Please : ");
		
		scanner.next();
		  
		System.out.println("Hi Nikitha Manvikar...!! ");
		  
		System.out.println("***********");
		  System.out.println("Please Enter your Account Number : ");
		   
		  int   AccountNumber=scanner.nextInt();
		  
		  BankBalance obj=new BankBalance(AccountNumber);
		  
		   obj.getbalance(AccountNumber);
		   
		  //scanner.next();
		  
		  System.out.println();
		
	       obj.setAccountNum(12345);
	   
	       
	       
	}

}