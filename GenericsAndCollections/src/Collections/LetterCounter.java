package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Elimane on Jan, 2020, at 12:20
 */
public class LetterCounter {



   public Map<String, Integer> harfSay (String sentence)
   {
       Map<String,Integer> map = new HashMap<String, Integer>();

      for(int i=0; i < sentence.length(); i++){
          Character chr = sentence.charAt(i);
          //Here we check if the char is alreeady in the map
         //If not we put it into map as key and give "1" as value assumed as occurence
         //If yes
          if(map.containsKey(chr.toString())){
                int counter = map.get(chr.toString());
                counter++;
                map.put(chr.toString(), counter);
          }
          else {
              //Else we put char as key and 1 as value meaning that first occurence
                map.put(chr.toString(), 1);
          }

      }
      return map;
   }


   public void printTheLetterCounts(Map<String,Integer> m){

      Collection<Map.Entry<String,Integer>> collection = m.entrySet();

      Iterator<Map.Entry<String,Integer>> it = collection.iterator();

      while (it.hasNext())
      {
          Map.Entry<String,Integer> entry = it.next();
         System.out.println("{ letter: "+entry.getKey()+", occurence: "+entry.getValue()+" }");
      }


   }

}
