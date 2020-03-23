/**
 * Created by Elimane on Mar, 2020, at 22:01
 */
public class Product {

    private float price = 0;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) throws PriceException {

        if(price > 5000)
            throw new PriceException("[Error], Price is greater than 5000");

        this.price = price;
    }
}
