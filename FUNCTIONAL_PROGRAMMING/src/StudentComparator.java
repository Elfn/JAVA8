import java.util.Comparator;

/**
 * Created by Elimane on Jan, 2018, at 15:14
 */
public class StudentComparator implements Comparator<Student>{

//    public static  List<Student> alphabetical(List<Student> students)
//    {
//        return  students.stream().sorted().collect(Collectors.toList());
//    }

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }


}
