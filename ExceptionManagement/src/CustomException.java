/**
 * Created by Elimane on Mar, 2020, at 22:03
 */
public class CustomException {

    public static void main(String[] args) throws PriceException {
        Product p = new Product();

        p.setPrice(6000);

        System.out.println(p.getPrice());
    }
}
