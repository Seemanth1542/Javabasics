package oops;

class Constructor {

	String studentname;
	
	int studentid;
	
	String clgname;
	
	
	//Constructor()
	
	//{
	
	//this.clgname="Oxford University";	
		
	//}	
	 Constructor()
	{
	
	System.out.println(" No-argumets constructor");
	}
	 
	 
	 //parameterized constructor
	 
	 
	 Constructor(String name,int rollno)
	 {
	 
	 this.studentname=name;
	 this.studentid=rollno;
	 
	 }
	 
	 
	 public void details()
	 
	 {
	 
	 
	 System.out.println("student name : " +studentname  + " ,his admission number is : " +studentid);
	 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Constructor c=new Constructor();  
		new Constructor();
		
		Constructor c1=new Constructor("lewis hamilton",6);
		
		Constructor c2 =new Constructor("Valteri bottas",44);
		
		Constructor c3=new Constructor("nico Rosberg",52);
		
		
		
		System.out.println(c3.studentname);
		
		System.out.println(c3.studentid);
		
		
		c1.details();
		
		c2.details();
		
		
		
		
		
		
	}

}