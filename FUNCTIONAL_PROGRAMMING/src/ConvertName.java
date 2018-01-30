/**
 * Created by Elimane on Jan, 2018, at 12:12
 */
public class ConvertName {

    public ConvertName() {
    }

    public static String makeCorrectName(Student student)
    {
        char firstLetter =  Character.toUpperCase(student.getName().charAt(0));
        String changedWord = student.getName().replace(student.getName().charAt(0),firstLetter);
        return  student.getName().charAt(0) == firstLetter ? student.getName() : changedWord+" <-- That name has been changed";
    }

}
