import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Elimane on May, 2018, at 00:26
 */
public class UrlExtractor {

    public static void main(String[] args)
    {
        String regex = "(http(s)?)://(www\\.)?([a-z0-9]+.[a-z]{2,})/([a-z0-9_]*)";

        Pattern p = Pattern.compile(regex);

        String[] urlsTable = {"https://www.google.com/search", "https://google.com/search", "http://www.google.com/search", "https://www.google.com/user_"};

        for(String url : urlsTable)
        {
            Matcher input = p.matcher(url);

            boolean isMatched = input.matches();

            if(isMatched)
            System.out.println(url+" => "+isMatched+" Whole match: "+input.group(0)+" Protocol: "+input.group(1)+" Domain name: "+input.group(4)+" Local path: "+input.group(5));

        }

    }
}
