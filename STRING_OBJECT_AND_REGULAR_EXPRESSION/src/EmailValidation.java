import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Elimane on May, 2018, at 23:07
 */
public class EmailValidation {

    public static void main(String[] main)
    {

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z0-9]+(\\.[a-z]{2,})+";

        Pattern pattern = Pattern.compile(emailPattern);


        String[] emailsTable = {"ELIMANE42@gmail.com.ok", "fof42_1991@gmail.com.ok", "elimane42@gmail.com.ok", "elimane42@gmail.c.ok.us"};

        for(String email : emailsTable)
        {
            Matcher input = pattern.matcher(email);

            boolean isMatched = input.matches();

            System.out.println(email+" => "+isMatched);
        }





    }

}
