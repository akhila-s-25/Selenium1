package InterfaceDemo;

public class Tvclass {

	public static void main(String[] args) {
		
		SamsungTV SamsungObj=new SamsungTV();
		
		System.out.println("**********SAMSUNG TV**********");
		SamsungObj.movies();
		
		SamsungObj.channels();
		
		SamsungObj.music();
		
		SamsungObj.ottPlatform();
		
		SamsungObj.InternetBrowsing();
		
		SamsungObj.voicecontrol();
		
		SamsungObj.brightness();
		
		SamsungObj.display();
		
		SamsungObj.resolution();
		
		System.out.println("********SONY TV************");
		
		SonyTv SonyObj=new SonyTv();
		
		SonyObj.movies();
		SonyObj.channels();
		SonyObj.music();
		SonyObj.ottPlatform();
		SonyObj.InternetBrowsing();
		SonyObj.voicecontrol();
		
		
		System.out.println("********PANASONIC TV*********");
		
		 Panasonic PanObj = new Panasonic();
		 
		 PanObj.brightness();
		
		
		
		
		
		
		
		
		
	}

}


class SamsungTV implements SmartTv,LEDTv,LCDTv{

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

	@Override
	public void ottPlatform() {
		
		System.out.println("SAMSUNG TV OTT Platform");
	}

	@Override
	public void InternetBrowsing() {
	
		System.out.println("SAMSUNG TV Internet Browsing");
		
	}

	@Override
	public void voicecontrol() {
		
		System.out.println("SAMSUNG TV VoiceControl");
		
	}

	
	

	
	
	
	
	
	
	
	
	
	
	
}

 class SonyTv implements SmartTv{

	@Override
	public void movies() {
		
		System.out.println("Sony TV Movies");
	}

	@Override
	public void channels() {
		
		System.out.println("Sony TV Channels");
	}

	@Override
	public void music() {
		
		System.out.println("Sony TV Music");
		
	}

	@Override
	public void ottPlatform() {
		
		System.out.println("Sony TV OTTPlatform");
		
	}

	@Override
	public void InternetBrowsing() {
		
		System.out.println("Sony TV Internet Browsing");
		
	}

	@Override
	public void voicecontrol() {
		
		System.out.println("Sony Tv Voice control");
		
	}

	
	
	
	
	
	
}

 class Panasonic extends SamsungTV{

	 
	
	 
	 
	
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
