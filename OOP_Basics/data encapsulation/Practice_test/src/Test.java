import classes.CreditCard;

/**
 * Created by Elimane on Aug, 2020, at 04:37
 */
public class Test {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard();

        creditCard.setCardNumber("1234-5433-2443-5565");

        System.out.println("Card number is"+creditCard.getCardNumber());

    }
}
