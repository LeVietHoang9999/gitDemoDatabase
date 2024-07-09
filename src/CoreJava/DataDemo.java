package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Current Date & Current Time. 
		Date d = new Date();
		//System.out.println(d.toString());
		SimpleDateFormat ft =new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(ft.format(d));
	}

}
