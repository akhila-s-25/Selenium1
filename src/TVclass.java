

public class TVclass {

	public static void main(String[] args) {
		
		SamsungTV SamsungObj=new SamsungTV();
		
		System.out.println("**********SAMSUNG TV**********");
		SamsungObj.movies();
		
		SamsungObj.channels();
		
		SamsungObj.music();
		
		
		
		SamsungObj.brightness();
		
		SamsungObj.display();
		
		SamsungObj.resolution();
		
		System.out.println("********SONY TV************");
		
		SonyTv SonyObj=new SonyTv();
		
		SonyObj.movies();
		SonyObj.channels();
		SonyObj.music();
		
		
		System.out.println("********PANASONIC TV*********");
		
		 Panasonic PanObj = new Panasonic();
		 
		 PanObj.brightness();
		
		
		
		
		
		
		
		
		
	}

}


class SamsungTV implements LEDTv,LCDTv{

	 
	@Override 
	public void movies() {
		
		System.out.println("SAMSUNG TV  Movies");
		
	}

	@Override
	public void channels() {
		System.out.println("SAMSUNG TV  Channels");
		
	}

	@Override
	public void music() {
		
		System.out.println("SAMSUNG TV songs");
		
	}

	@Override
	public void brightness() {
		
		System.out.println("SAMSUNG TV Brightness");
		
	}

	@Override
	public void display() {
		
		System.out.println("SAMSUNG TV Display");
		
	}

	@Override
	public void resolution() {
		
		System.out.println("SAMSUNG TV Resolution");
	}

	 
	
	
	
	
	
	
	
	
	
	
	
}

 class SonyTv extends SamsungTV {

	
	SonyTv(){
		
		System.out.println("default constructor");
	}
	
	
	
	
	
}

 class Panasonic extends SamsungTV{

	 
	
	 
	 
	
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
