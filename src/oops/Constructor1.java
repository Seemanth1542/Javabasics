package oops;

public class Constructor1 {

	int a;
	
	Constructor1(int roll)
	{
	
	this.a=roll;
	}
	
	
	public int number()
	
	{
	
	return a;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor1 m=new Constructor1(1542);
		
		System.out.println(m.number());
		
		
		
	}

}
