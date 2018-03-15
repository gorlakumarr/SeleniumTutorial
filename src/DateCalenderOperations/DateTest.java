package DateCalenderOperations;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class DateTest {
	@Test
	public void dateformat() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		System.out.println(dateFormat.format(date));

		Calendar calendar = Calendar.getInstance();
		System.out.println(dateFormat.format(calendar.getTime()));

		calendar.add(Calendar.DATE, 1);
		calendar.add(Calendar.MONTH, 1);
		calendar.getTime();
		System.out.println(dateFormat.format(calendar.getTime()));
	}

}
