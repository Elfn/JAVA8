import javax.xml.transform.Result;

/**
 * Created by Elimane on May, 2018, at 05:04
 */
public class StringMethods {



    public static void main(String[] args){
                  //0123456789101112131415
        String s = "(objects)MyString object and regexp section";
        int l = s.length();

        System.out.println(l);

        char c = s.charAt(s.length()-1);
        System.out.println(c);

        int i = s.indexOf("object",15);
        System.out.println("This: "+i);

        String sub = s.substring(15);
        System.out.println(sub);

        sub = s.substring(s.indexOf("object",14));
        System.out.println(sub);

        sub = s.substring(s.indexOf("object",14),26);
        System.out.println(sub);


//        sub = s.substring(s.indexOf("My",14));
//        System.out.println(sub);

        if(s.indexOf("My") >= 0) {
            sub = s.substring(s.indexOf("My"), 11);
            System.out.println(sub);
        }
        else
            System.out.println("My is not founnd in => "+s);



       String srepl = s.replace("object","OJB");
        System.out.println(srepl);

        System.out.println("\n");
        System.out.println("STRING ARRAY\n");

        String[] words = s.split(" ");

        for (String word : words)
        {
           // System.out.println(word);
        }

        System.out.println(wordCount.getInstance().deleteAll(s,"regexp"));

        // Result




    }





}
