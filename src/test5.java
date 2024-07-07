
public class test5 {
  
	
	void Student (String Name) {
		
		
		System.out.println("Name: "+Name);
		
	}
	
void STUDENT (String Name) {
		
		
		System.out.println("Name: "+Name);
		
	}
	
    void Student (String Name, int RollNo) {
		
		
		
		System.out.println("Name : " + Name + " Roll No : "+RollNo);
		
	}
	
  void Student (String Name, int RollNo, int Marks) {
		
		
		
	  System.out.println("Name : " + Name + " Roll No : "+ RollNo + "Marks :" + Marks);
		
	}
   
	public static void main(String[] args) {
		
		test5 obj = new test5();
		
		obj.Student("AKhila");
		obj.Student("Akhila", 3);
		obj.Student("AKhila",3,70);
		
		

	}

}
