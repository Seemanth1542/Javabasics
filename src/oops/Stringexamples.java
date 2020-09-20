package oops;

public class Stringexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// b string is assigned to a but doesn't create new String 
		String n= "Seemanth";
		
		String k= "Seemanth";
		
		
		// Creates new memory in heap area because of creating object
		String p=new String ("Seemanth");
		
		String d=new String ("Seemanth");
		
		
		// other string examples
		
		String s= "Welcome to 2020";
		
		String s1="  Dangerous   ";
		
		// starts from index=0
		System.out.println(s.charAt(7));
		
		System.out.println(s.charAt(8));
		
		
		
		
		// says index of character in index
		
		System.out.println(s.indexOf(" "));
		
		System.out.println(s.indexOf("2"));
		
		System.out.println(s.indexOf("c"));
		
		// gives length from 1
		
		System.out.println(s.length());
		
		System.out.println(s1.length());
		
		//starts with index o , starting index inclusive , ending index is exclusive
		
		System.out.println(s.substring(3, 8));
		
		System.out.println(s.substring(1));
		
		
		//concat
		
		
		 String str1 = "Hello";  
	        String str2 = "Javatpoint";  
	        String str3 = "Reader";  
	        // Concatenating one string   
	        String str4 = str1.concat(str2);          
	        System.out.println(str4);  
	        // Concatenating multiple strings  
	        String str5 = str1.concat(str2).concat(str3);  
	        System.out.println(str5);  
		
		//trims front and back spaces
	        
	        
	        String s2="  hello string   ";  
	        System.out.println(s1+"javatpoint");//without trim()  
	        System.out.println(s1.trim()+"javatpoint");//with trim()  
	        
	        
	        
	        
	        System.out.println(s.toUpperCase());
	        
	        System.out.println(s.toLowerCase());
	        
	        System.out.println(s1.trim());
		
	        
	        String arr[]=s1.split("g");
	        System.out.println(arr[0]);
	        System.out.println(arr[1]);
	        System.out.println(s.replace("o", "s"));
	        
	        
	        
	        
		
		
	}

}
