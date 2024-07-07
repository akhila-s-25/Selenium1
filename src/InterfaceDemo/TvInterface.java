package InterfaceDemo;

//Parent Interface
public interface TvInterface {

	
	   void movies();
	   
	   void channels();
	   
	   void music();
		
	   
}


// child 1 Interface
interface SmartTv extends TvInterface{
	
	
	
	     void ottPlatform();
	     
	     void InternetBrowsing();
	     
	     void voicecontrol();
	
	
	
}

// child 2 Interface
interface LEDTv extends TvInterface{
	
	void display();
	
	void resolution();
	
	
}

// child 3 Interface
interface LCDTv extends TvInterface{
	
	
	
	
	void brightness();
	
	
}