import java.util.*;
import java.text.*;

public class DateTest
{

	public static void main(String args[])
	{
		SimpleDateFormat TIME = new SimpleDateFormat("hh:mm:ss");
		Date d = new Date(1000);
		System.out.println(TIME.format(d));
		System.out.println(d);
	}
	
}