package myProject;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.UUID;
public class Date {
	public static void dateTutorialLocale() 
	{
		Locale locale = new Locale("tr","TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss ",locale );
		Date date = new Date();
		System.out.println(date);
		String format = dateFormat.format(date);
		System.out.println(format);
	}
	public static void main(String[] args) {
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
		
		
	}

}
