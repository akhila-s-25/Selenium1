
public class Methods {

	public static void main(String[] args) {


		Methods obj = new Methods();
		
		boolean Result= obj.A();
		
		System.out.println(Result);
		 
		char letter =obj.c();
		
		System.out.println(letter);
		
		double D =obj.d();
		
		System.out.println(D);
	
	    byte B =obj.b();
	     
	    System.out.println(B);
	
	    Short SH= obj.sh();
	
	    System.out.println(SH);
	
	    long L = obj.LG();
	    
	    System.out.println(L);
	
	    int II=obj.I(2,3);
	    
	    System.out.println(II);
	
	    String SS=obj.S(123456789);
	    
	    System.out.println(SS);
	    
	    
	    
	    float F=obj.f(2.5f,3.5f);
	   
	    System.out.println(F);
	    
	    
	    obj.No_Retn_Wth_In(1);
	}

	
	  boolean A() {
		  
	  
		  return true;
		 	  
	  }
	
	
	
	 
	 char c() {
		 
		 char d='s';
		 
		 return d;
		 
		 
		 
	 }
	 
	 
	 double d() {
		 
		 double d1=2.5;
		 
		 double d2 = 3.5;
		 
		 double sum =d1+d2;
		 
		 return sum;
	 }
	 
	 
	
	 byte b() {
		 
		 
		 byte a=1;
		 
		 return a;
	 }
	 
	 
	 
	 short sh() {
		 
		 short sh=2;
		 
		 return sh;
		 
		 
		 
	 }
	 
	 
	 long LG() {
		 
		 long l=4L;
		 
		 return l;
		 
	 }
	 
	 
	 
	 int I(int i,int i1) {
		 
		
		 
		 int sum = i+i1;
		 return sum;
		 
		 
		 
	 }
	
    float f(float f1,float f2) {
		 
		
		 
		 float sum =f1+f2;
		 
		 return sum;
	 }
	 
	 
    
     
    
    String S(int HallTicketNum) {
    	  
    
    	   //System.out.println(HallTicketNum);
    	  
    	if(HallTicketNum==123456789) {
    	    
    		System.out.println("");
    	}
    	     
    	String Name="Akhila";
    	return Name;
     
      
    	
      
      
      }
	 
	
    void  No_Retn_Wth_In(int i) {
    	
    	
    	System.out.println(i);
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

}
	
	
	
	
	
	
	
	
	
	

