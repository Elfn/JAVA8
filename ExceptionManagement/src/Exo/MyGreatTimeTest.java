package Exo;

/**
 * Created by Elimane on Mar, 2020, at 22:26
 */
public class MyGreatTimeTest {
    public static void main(String[] args) throws ValueException {
        MyGreatTime greatTime = new MyGreatTime();

        greatTime.setMinute(5);
        greatTime.setHour(24);
        greatTime.setSecond(4);

        System.out.println(greatTime.getMinute());
        System.out.println(greatTime.getHour());
        System.out.println(greatTime.getSecond());
    }
}
