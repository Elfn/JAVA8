package test.inheritance.exercise;

import test.inheritance.exercise.*;

/**
 * Created by Elimane on Aug, 2018, at 08:52
 */
public class Main {

    public static void main(String[] args)
    {

        Vehicle vehicle = new Vehicle();
        Car car1 = new Car();
        Plane plane1 = new Plane();
        Bus bus1 = new Bus();




        Customer c1 = new Customer("1","John","McCall",true, Gender.MALE);
        Customer c2 = new Customer("2","Olivia","Maxwell",true, Gender.FEMALE);
        Customer c3= new Customer("3","Davis","Parton",true, Gender.MALE);
        Customer c4 = new Customer("4","John","Vixen",true, Gender.MALE);
        Customer c5 = new Customer("5","Erica","Bilt",false, Gender.FEMALE);

        //
        System.out.println("///CAR SEATS");
        String res = car1.reserveSeat(c1);
        String res2 = car1.reserveSeat(c2);
        String res3 = car1.reserveSeat(c3);
        String res4 = car1.reserveSeat(c4);
        String res5 = car1.reserveSeat(c5);
        System.out.println(c1.getName()+" "+c1.getSurName()+" reserved seat no : "+res);
        System.out.println(c2.getName()+" "+c2.getSurName()+" reserved seat no : "+res2);
        System.out.println(c3.getName()+" "+c3.getSurName()+" reserved seat no : "+res3);
        System.out.println(c4.getName()+" "+c4.getSurName()+" reserved seat no : "+res4);
        System.out.println(c5.getName()+" "+c5.getSurName()+" reserved seat no : "+res5);

        System.out.println("///PLANE SEATS");
        String resPlane = plane1.reserveSeat(c1);
        String res2Plane = plane1.reserveSeat(c2);
        String res3Plane = plane1.reserveSeat(c3);
        String res4Plane = plane1.reserveSeat(c4);
        String res5Plane = plane1.reserveSeat(c5);
        System.out.println(c1.getName()+" "+c1.getSurName()+" reserved seat no : "+resPlane);
        System.out.println(c2.getName()+" "+c2.getSurName()+" reserved seat no : "+res2Plane);
        System.out.println(c3.getName()+" "+c3.getSurName()+" reserved seat no : "+res3Plane);
        System.out.println(c4.getName()+" "+c4.getSurName()+" reserved seat no : "+res4Plane);
        System.out.println(c5.getName()+" "+c5.getSurName()+" reserved seat no : "+res5Plane);


        System.out.println("///BUS SEATS");
        String resBus = bus1.reserveSeat(c1);
        String res2Bus = bus1.reserveSeat(c2);
        String res3Bus = bus1.reserveSeat(c3);
        String res4Bus = bus1.reserveSeat(c4);
        String res5Bus = bus1.reserveSeat(c5);
        System.out.println(c1.getName()+" "+c1.getSurName()+" reserved seat no : "+resBus);
        System.out.println(c2.getName()+" "+c2.getSurName()+" reserved seat no : "+res2Bus);
        System.out.println(c3.getName()+" "+c3.getSurName()+" reserved seat no : "+res3Bus);
        System.out.println(c4.getName()+" "+c4.getSurName()+" reserved seat no : "+res4Bus);
        System.out.println(c5.getName()+" "+c5.getSurName()+" reserved seat no : "+res5Bus);

        System.out.println("List of seats of car:");
        car1.listSeats();
        System.out.println("List of seats of bus:");
        bus1.listSeats();
        System.out.println("List of seats of plane:");
        plane1.listSeats();



    }
}
