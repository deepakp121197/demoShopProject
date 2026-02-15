package demoShopes.qa.util;

import java.util.Date;

public class CurrentDateUtil {
	
	public static String getCurrentDate()
	{
		Date d = new Date();
		return d.toString().replace(":","_");
	}

}
