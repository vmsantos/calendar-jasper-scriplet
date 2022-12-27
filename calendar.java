import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import net.sf.jasperreports.engine.JRDefaultScriptlet;

public class CalendarScriptlet extends JRDefaultScriptlet {

    // Declare variables
    private int year;
    private int month;
    private int dayOfMonth;
    private Calendar calendar;
    private Date date;
    private SimpleDateFormat dateFormat;

    // Constructor
    public CalendarScriptlet() {
        year = 0;
        month = 0;
        dayOfMonth = 0;
        calendar = new GregorianCalendar();
        date = new Date();
        dateFormat = new SimpleDateFormat("MMMM yyyy");
    }

    // Setter methods
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    // Getter methods
    public String getMonthYear() {
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        date = calendar.getTime();
        return dateFormat.format(date);
    }

    public String getWeekday() {
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        date = calendar.getTime();
        return new SimpleDateFormat("EEEE").format(date);
    }
}
