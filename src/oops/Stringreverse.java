package oops;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="madame"; 
		
		String v="";  //Don't give spaces
		int i=s.length();
		
		for (int j=i-1;j>=0;j--)
		{
		
		v=v+s.charAt(j);
			
			
		}
		
		System.out.println(v);
		
		if(v.equals(s))
			
		{	
		
		 System.out.println("it is palindrome");	
		}
		
		/*else 
			
		{
		
		System.out.println("it is not a palindrome");
		}
		
		*/
		
		String h="seemanth";
		
		int k=h.length();
		
		for(int l=0;l<k;l++)
		{
			
		
		System.out.print(h.charAt(l));
		
		
		
		}
	}

}
