import java.util.Objects;

/**
 * Created by Elimane on Jan, 2020, at 22:46
 */
public class Customer implements Comparable{
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Customer() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;

        if(this.age == ((Customer)o).age)
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return 11 * age + 13 * name.hashCode();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        return (this.age == 0 || ((Customer)o).age == 0) ? 0 : (this.age  > ((Customer)o).age) ? 1 : (this.age < ((Customer)o).age) ? -1 : null;

    }
}
