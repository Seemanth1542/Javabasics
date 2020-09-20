package oops;

public class smallestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] a= {{8,11,20},{34,56,6},{17,28,39}};
		
        int k=a[0][2];
	     
		int p=a[0][0];
		for (int i=0;i<a.length;i++)
		
		{
		
			
		for (int j=0;j<a[i].length;j++)
			
		{
			
		if (a[i][j]<=k)
			
		{	
			
		k=a[i][j];
		
		}
		
		else
			
		if(a[i][j]>=p)
			
		{	
	     
			
		p=a[i][j];	
		}
		
		}
	}

		
		System.out.println("smallest number is  "+ k);
		
		System.out.println("largest number is  " +p);
		
	}
	
	
}