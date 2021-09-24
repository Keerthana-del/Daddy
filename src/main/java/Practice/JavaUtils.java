package Practice;

import java.util.Date;
import java.util.Random;

public class JavaUtils {
	/**
	 * @Keerthana
	 * this method is used to generate random number
	 * @return randomnumber
	 */
	public static String getRandomData()
	{
		Random ran=new Random();
		int randomdata = ran.nextInt();
		return " "+randomdata;
	}
	/**
	 * @keerthana
	 * this method is used to generate currentdate
	 * @return currentdate
	 */
	public static String getCurrentDate()
	{
		Date date=new Date();
		String currentdate = date.toString();
		return currentdate;	
	}
	
	
}
