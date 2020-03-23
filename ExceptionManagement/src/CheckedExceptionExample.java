import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Elimane on Mar, 2020, at 21:29
 */
public class CheckedExceptionExample {
    public static void main(String[] args) {
//        try {
//            FileReader reader = new FileReader("/Users/Elimane");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //CHECKED Exception is an exception verify and
        //red lined by the compilator in order to obligate
        //developer to write try-catch, or propagate exception
        //During call

        CheckedExceptionExample checkedExceptionExample = new CheckedExceptionExample();
        try {
            checkedExceptionExample.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public void read() throws FileNotFoundException {
        //We propagated the exception
        FileReader reader = new FileReader("/Users/Elimane");

    }
}
