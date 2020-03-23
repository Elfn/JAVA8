/**
 * Created by Elimane on Mar, 2020, at 22:02
 */
public class PriceException extends Exception {

//    private String message = "Error about price which is too much";
//
//    @Override
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }

    public PriceException(String msg)
    {
        super(msg);
    }
}
