package oops;

public class signals implements Traffic {
   
	
	
	public static void main(String[] args) {
	
      Traffic  b = new signals();
		
		b.red();
		
		b.yellow();
		
		b.green();
		
		
		
		

	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("Stop the vehicles");
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
	
		System.out.println("Ready to go");
		
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
	
		
		System.out.println("be alert");
	}




}
