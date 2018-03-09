import Serializer.ItemSerializer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import model.Item;
import model.User;

import java.io.IOException;

/**
 * Created by Elimane on Mar, 2018, at 01:18
 */
public class Main {

    public static void main(String[] args) throws JsonProcessingException {
//        Item myItem = new Item(1, "theItem", new User(2, "theUser"));
//        try {
//            //ObjectMapper is a class which provide functionalities to write and read JSON
//            String serialized = new ObjectMapper().writeValueAsString(myItem);
//            System.out.println(serialized);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        Item myItem = new Item(1, "theItem", new User(2, "theUser"));
        ObjectMapper mapper = new ObjectMapper();

        SimpleModule module = new SimpleModule();
        module.addSerializer(Item.class, new ItemSerializer());
        mapper.registerModule(module);

        String serialized = mapper.writeValueAsString(myItem);

        System.out.println(serialized);
    }
}
