package classes.java.io;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Elimane on Aug, 2018, at 23:09
 */
public class Day {

    public Day() {
    }

    public static Date getTime()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR,0);
        calendar.set(Calendar.MINUTE,0);
    return calendar.getTime();

    }
}
