

//Parent Interface
public interface TVInterface {

	
	   void movies();
	   
	   void channels();
	   
	   void music();
		
	   
}


// child 1 Interface
interface SmartTv extends TVInterface{
	
	
	
	     void ottPlatform();
	     
	     void InternetBrowsing();
	     
	     void voicecontrol();
	
	
	
}

// child 2 Interface
interface LEDTv extends TVInterface{
	
	void display();
	
	void resolution();
	
	
}

// child 3 Interface
interface LCDTv extends TVInterface{
	
	
	
	
	void brightness();
	
	
}