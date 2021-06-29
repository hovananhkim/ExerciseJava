package Basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Exercise10 {
    public String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public String getDayOfWeek(int day, int month, int year) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = String.format("%s/%s/%s", day, month, year);
        Date date = dateFormat.parse(dateString);
        return String.format("%tA",date);
    }
}