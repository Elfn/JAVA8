import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Elimane on May, 2018, at 23:18
 */
public class Regexp_Aphabetic_LowerCase_chars {

    //CHECK IF ALL LETTERS ARE LOWERCASE ALPHABETIC CASE


    //www.regexpal.com/ <= to test my templates

    ///^[a-z]+$/i for case sensitive

    public String regularExpression = "^[a-z]+$";  // write your regular expression here
    private Pattern pattern;

    public Regexp_Aphabetic_LowerCase_chars() {
        pattern = Pattern.compile(regularExpression);
    }

    public  boolean isStringFullOfLowercaseAlphabeticCharacters(String input) {
        // write your pattern matching code here.
        // if pattern matches return true, else false
      // Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = this.pattern.matcher(input);

        return matcher.matches();


    }

    public static void main(String[] args)
    {
        Regexp_Aphabetic_LowerCase_chars regexp_aphabetic_chars = new Regexp_Aphabetic_LowerCase_chars();
        System.out.println(regexp_aphabetic_chars.isStringFullOfLowercaseAlphabeticCharacters("eimn"));
    }
}
