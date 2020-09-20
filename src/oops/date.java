package oops;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d=new Date();
		
				
		System.out.println(d.toString());
		
		
		SimpleDateFormat p=new SimpleDateFormat("d/M/yyyy");

		System.out.println(p.format(d));
		
		SimpleDateFormat sdf=new SimpleDateFormat("E D d/M/yyyy  hh:mm:ss a");
		
		System.out.println(sdf.format(d));
		
	}

}
