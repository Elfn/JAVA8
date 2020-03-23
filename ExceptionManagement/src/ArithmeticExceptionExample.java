/**
 * Created by Elimane on Mar, 2020, at 21:43
 */
public class ArithmeticExceptionExample {
    public static void main(String[] args)
    {

        //UNCHECKED Exception is not verified and red
        // lined by the compilator like below
        //It is an exception that we can't see until
        //we launch program

        int x = 0;



          int  y = 3 / x;

        System.out.println(y);
    }
}
