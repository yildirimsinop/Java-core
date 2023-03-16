package Arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple example of using a HashMap in Java.
 */
public class HashMapExample {

    /**
     * Adds key-value pairs to the HashMap.
     *
     * @param map the HashMap to add values to
     */
    public static void addValues(HashMap<String, Integer> map) {
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
    }

    /**
     * Gets the value associated with a key from the HashMap.
     *
     * @param map the HashMap to get the value from
     * @param key the key to get the value for
     * @return the value associated with the key, or -1 if the key is not found
     */
    public static int getValue(HashMap<String, Integer> map, String key) {
        Integer value = map.get(key);
        if (value == null) {
            return -1;
        }
        return value;
    }

    /**
     * Updates the value associated with a key in the HashMap.
     *
     * @param map the HashMap to update the value for
     * @param key the key to update the value for
     * @param value the new value for the key
     */
    public static void updateValue(HashMap<String, Integer> map, String key, int value) {
        map.put(key, value);
    }

    /**
     * Removes a key-value pair from the HashMap.
     *
     * @param map the HashMap to remove the key-value pair from
     * @param key the key to remove from the map
     */
    public static void removeValue(HashMap<String, Integer> map, String key) {
        map.remove(key);
    }

    /**
     * Main method to demonstrate HashMap usage.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        addValues(map);

        // Get value associated with a key
        int age1 = getValue(map, "Alice");
        System.out.println(age1); // Output: 25
        // Update value associated with a key
        updateValue(map, "Bob", 40);
        int age2 = getValue(map, "Bob");
        System.out.println(age2); // Output: 40

        // Remove a key-value pair from the map
        removeValue(map, "Charlie");
        System.out.println(map); // Output: {Alice=25, Bob=40}
    }
}



        /*
         HashMap, anahtar-değer çiftlerini depolamak için kullanılan bir koleksiyon sınıfıdır.
         Bir HashMap nesnesinde, her bir anahtar (key), bir değer (value) ile eşleştirilir. HashMap içindeki anahtarlar benzersiz olmalıdır,
         yani bir anahtarın sadece bir kez var olabilir. Bir HashMap örneği oluşturduktan sonra, öğeler eklemek,
         silmek ve sorgulamak için put(), remove() ve get() metodlarını kullanabilirsiniz.


         HashMap er en samlingsklasse som brukes til å lagre nøkkelverdi-par. I et HashMap-objekt er hver nøkkel tilordnet en verdi.
         Nøkler i HashMap må være unike, noe som betyr at en nøkkel bare kan eksistere én gang.
         Etter at du har opprettet en HashMap-forekomst, kan du bruke metodene put(), remove() og get() for å legge til, slette og spørre elementer.



 */
