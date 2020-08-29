package classes;
/**
 * Data encapsulation => Is to hide critical data by preventing access with access modifiers
 */

/**
 * Created by Elimane on Aug, 2020, at 04:38
 */
public class CreditCard {

     private String cardNumber;
     private String cardOwner;
     private String cvc;

     public String getCardNumber() {

          /*
          Security checks
           */

          return cardNumber;
     }

     public void setCardNumber(String cardNumber) {

           /*
          Data validation
           */

          this.cardNumber = cardNumber;
     }

     public String getCardOwner() {

           /*
          Security checks
           */

          return cardOwner;
     }

     public void setCardOwner(String cardOwner) {

            /*
          Data validation
           */

          this.cardOwner = cardOwner;
     }

     public String getCvc() {

           /*
          Security checks
           */

          return cvc;
     }

     public void setCvc(String cvc) {

            /*
          Data validation
           */

          this.cvc = cvc;
     }
}
