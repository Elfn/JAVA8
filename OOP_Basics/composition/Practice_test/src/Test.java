/**
 * Created by Elimane on Aug, 2020, at 04:15
 */

import classes.Marriage;
import classes.Person;

/**
 *
 * Composition => Is to make object instance include others objects instances
 * of same or different types
 *
 */
public class Test {

    public static void main(String[] args) {

        Marriage marriage = new Marriage();

        marriage.place = "LAS VEGAS";

        Person p1 = new Person("Oliver", "Queen");
        Person p2 = new Person("Felicity","Smoak");

        marriage.person1 = p1;
        marriage.person2 = p2;

        System.out.println("Happy marriage to "+p1.name+" and "+p2.name);

    }

}
