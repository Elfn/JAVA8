package ExoCustomExceptions;

/**
 * Created by Elimane on Mar, 2020, at 22:17
 */
public class MyGreatTime {

    private int second;
    private int minute;
    private int hour;

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) throws ValueException {

        if(second > 60 || second < 0)
            throw new ValueException("[Error], Second value is incorrect, it must be between 0 and 60");

        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) throws ValueException {

        if(minute > 60 || minute < 0)
            throw new ValueException("[Error],  Minute value is incorrect, it must be between 0 and 60");


        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) throws ValueException {

        if(hour > 24 || hour < 0)
            throw new ValueException("[Error],  Hour value is incorrect, it must be between 0 and 24");


        this.hour = hour;
    }
}
