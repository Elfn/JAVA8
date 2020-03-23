/**
 * Created by Elimane on Mar, 2020, at 00:19
 */
public class Test {
    //Exception is an object that
    //describes unusual behavior of a program
    public static void main(String[] args)
    {

        try {
            //Any variable created in the try block is removed from
            //Memory after the execution of the try block
            //so i variable is not visible outside try-catch block
            int i = Integer.parseInt("A");//Here we have an exception(Unusual practice)

        }
        catch(NumberFormatException e){
            //Here we handle exception
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finished");
        }

    }
}
