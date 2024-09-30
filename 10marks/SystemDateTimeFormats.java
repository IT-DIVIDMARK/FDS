import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SystemDateTimeFormats {

    public static void main(String[] args) {
        Date currentDate = new Date();

        // Display date in various formats
        System.out.println("Current date is : " + new SimpleDateFormat("dd/MM/yyyy").format(currentDate));
        System.out.println("Current date is : " + new SimpleDateFormat("MM-dd-yyyy").format(currentDate));

        // Use Calendar class for weekday
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        String weekday = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
        String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int year = cal.get(Calendar.YEAR);
        System.out.println("Current date is : " + weekday + " " + month + " " + day + " " + year);

        // Display date and time with time zone
        System.out.println("Current date and time is : " + new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US).format(currentDate));
        System.out.println("Current date and time is : " + new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z").format(currentDate));

        // Display time only
        System.out.println("Current time is : " + new SimpleDateFormat("HH:mm:ss").format(currentDate));

        // Display week of year and week of month (using Calendar)
        int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
        System.out.println("Current week of year is : " + weekOfYear);
        System.out.println("Current week of month : " + weekOfMonth);

        // Display day of year
        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println("Current day of the year is : " + dayOfYear);
    }
}