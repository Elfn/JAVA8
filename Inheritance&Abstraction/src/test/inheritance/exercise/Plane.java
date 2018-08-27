package test.inheritance.exercise;

/**
 * Created by Elimane on Aug, 2018, at 08:48
 */
public class Plane extends Vehicle {

    public Plane() {
        seats = new Customer[4][5];
    }

    String[] labels = new String[]{"A","B","C","D","E"};


    public String reserveSeat(Customer customer) {
        int i, j = 0;
        boolean isFound = false;
        //By default array is empty
//        for(int i=0; i<seats.length;i++)
//            for (int j=0; j<seats.length;j++)
//            {
//
//                    seats[i][j].setName("Empty");
//            }
        //Here we process the array
        for (i = 0; i < seats.length; i++) {
            if (isFound)
                break;

            for (j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == null) {

                    if(j == 1)
                    {
                        if(seats[i][0] == null || !seats[i][0].getGender().equals(customer.getGender()))
                        {
                            continue;
                        }
                    }

                    seats[i][j] = customer;
                    isFound = true;
                    break;


                }
            }


        }
        String seat = (i - 1) * seats[0].length + j +1+labels[j];
        return seat+" ";
    }


    public void listSeats() {
        int i, j = 0;
        for (i = 0; i < seats.length; i++) {
            for (j = 0; j < seats[i].length; j++) {

                if (seats[i][j] == null) {
                    System.out.println("Empty");
                } else {
                    String seat = (i+1)+labels[j];
                    System.out.println(("SEAT "+seat+ " - " + seats[i][j].getName() + " - " + seats[i][j].getSurName()));
                }
            }
        }

    }
}
