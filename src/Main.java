import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("1今天的日期为:"+today);
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("2一周后的日期为:"+nextWeek);

        Clock clock = Clock.systemUTC();
        System.out.println("1Clock : " + clock.millis());

        // Returns time based on system clock zone
        Clock defaultClock = Clock.systemDefaultZone();
        System.out.println("Clock : " + defaultClock.millis());
    }
}