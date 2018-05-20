/**
 * Created by Elimane on Feb, 2018, at 08:56
 *
 *
 * Most use built in object of Java, used for text operation
 it includes char Array and Utility methods
 -It is immutable because all text operations will not be done on the original string
 -So we have to assign the result of operations to another string variable(in the stack memory) to make it persistent
 */
public class Main
{
    public static void main(String[] args)
    {
        String s1  = new String("My name is");

        String s2 = "Elimane";

        String s3 = new String("My name is");

        String s = s1+" "+s2;

        System.out.println(s);

        // false because s1 & s3 have'nt the same id in memory
        System.out.println(s1 == s3);

        //true because s1 & s3 are the reference of the same object
        System.out.println(s1.equals(s3));

        // s has no anymore the same id in memory in contrast to s on line 14
       s = s1.concat(s3);
//        String s4 = new String("My name isMy name is");
//
        System.out.println(s);
//        System.out.println(s==s4);
//        System.out.println(s.equals(s4));

        //show index of second is
        int indexOfIs = s.indexOf("is",16);

        System.out.println(indexOfIs);

        wordCount countword = wordCount.getInstance();




        //Word counter
        System.out.println(countword.count(s1)+" words");

        //Concat

//        String[] array = {"f", "o", "o", "b","a","r"};
//        String w = ConcatArrayItems.concat(array);
//        System.out.println(w);
//
//        char w1  = w.charAt(w.indexOf(1));
//        s = s.replace(w1,'a');
//
//        System.out.println(s);

//        String sentence = "Now Let’s go to do something. Let me explain it first";
        String sentence = "Javathlon is the best java course";

        String searchWord = "Java";

        System.out.println("The word "+searchWord+" exists "+wordCount.getInstance().occurenceFinder(sentence,searchWord)+" times in the sentence");


        System.out.println(wordCount.getInstance().deleteAll(sentence,searchWord));

        System.out.print("TITLE CASE : "+TitleCase.casify("tHe IMPOrtance of the independency waR"));
    }
}
