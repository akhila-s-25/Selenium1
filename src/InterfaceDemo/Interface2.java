package InterfaceDemo;

public interface Interface2 {

	
	public static final int rollnum=9;
	
	public static final int marks=95;
	
	public static final String Name="Akhila";
	
	  void AA();
	  void AB();
	  



}

interface interface3{
	
	int age=28;
	
	void AD();
	
	
	
	
	
}

	class childinter implements Interface1,Interface2,interface3{

		
		public void AA() {
			System.out.println(Name);
			
		}

	
		public void AB() {
			
			System.out.println(rollnum);
		}
		
		
		void AC() {
			
			System.out.println(marks);
			
			
		}  


		@Override
		public void AD() {
			
			System.out.println(age);
			
		}


		@Override
		public void A() {
			
			System.out.println("Interface 1 method");
			
		}


		@Override
		public void B() {
			
			System.out.println("Interface 1 method");
			
		}
		
		
	}
	
