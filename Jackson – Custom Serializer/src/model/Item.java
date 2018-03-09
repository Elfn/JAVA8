package model;

/**
 * Created by Elimane on Mar, 2018, at 01:15
 */
public class Item {
    public int id;
    public String itemName;
    public User owner;

    public Item(int id, String itemName, User owner) {
        this.id = id;
        this.itemName = itemName;
        this.owner = owner;
    }
}
