package oops;

public class withoutobject {
	
	String team;
	
	withoutobject()
	{
	
	this.team="MERCEDES";	
		
	}

	static void myMethod(String fname, int age) {
	    System.out.println(fname + " is " + age);
	  }

	  public static void main(String[] args) {
	    myMethod("Liam", 5);
	    myMethod("Jenny", 8);
	    myMethod("Anja", 31);
	    
	    withoutobject p=new withoutobject();
	    
	    System.out.println(p.team);
	    
	    p.myMethod("lewis Hamilton", 37);
	    
	
	

	}

}
