package HOMEWORK9;

import java.util.HashMap;
import java.util.Map;

/*7. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.

 */
public class QUE_7 {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> Map = new HashMap<>();

        // Adding key-value pairs to a HashMap
        Map.put("One", 1);
        Map.put("Two", 2);
        Map.put("Three", 3);
         //Using for each loop to iterate the map
        for (Map.Entry<String, Integer> pair : Map.entrySet()) {
            System.out.println("Key = " + pair.getKey() +
                    ", Value = " + pair.getValue());
        }

    }
}
