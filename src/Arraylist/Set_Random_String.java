/*package Arraylist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Set_Random_String {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;
        String str4 = "HelloWorld";

        // String concatenation
        System.out.println(str4); // Output: HelloWorld

        System.out.println("============================");


        Random number = new Random();
        Boolean number2 = number.nextBoolean();

        System.out.println(number2);

        System.out.println("==========================");

        HashMap<String, Double> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Get value associated with a key
        int age1 = map.get("Alice");
        System.out.println(age1); // Output: 25

        // Update value associated with a key
        map.put("Bob", 40);
        int age2 = map.get("Bob");
        System.out.println(age2); // Output: 40

        // Remove a key-value pair from the map
        map.remove("Charlie");
        System.out.println(map); // Output: {Alice=25, Bob=40}

        System.out.println("===================================");


        HashSet<String> set = new HashSet<>();

        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Check if an element is present in the set
        boolean present = set.contains("Banana");
        System.out.println(present); // Output: true

        // Remove an element from the set
        set.remove("Orange");
        System.out.println(set); // Output: [Apple, Banana]

 */



































           /*
        HashSet, benzersiz elemanların bir koleksiyonunu depolamak için kullanılan bir sınıftır. HashSet içindeki
        elemanlar da benzersiz olmalıdır, yani her eleman sadece bir kez yer alabilir.
        Ayrıca, HashSet öğeleri sıralı değildir ve her elemanın önceden belirlenmiş bir konumu yoktur.
        Örnek olarak, bir HashSet nesnesinde bir liste tutmak isteyebilirsiniz:

       csharp
       Copy code
       HashSet<String> mySet = new HashSet<String>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");
        boolean hasBanana = mySet.contains("Banana"); // true
        HashSet'te, her elemanın sadece bir kez yer alabileceğini unutmayın.
        Yani mySet.add("Banana"); satırını iki kez çağırsanız bile, Banana sadece bir kez yer alacaktır.


        HashSet er en klasse som brukes til å lagre en samling unike elementer. Elementer i HashSet må også være unike,
        noe som betyr at hvert element bare kan vises én gang. HashSet-elementer er heller ikke ordnet,
        og hvert element har ingen forhåndsbestemt posisjon.
        Merk at hvert element bare kan vises én gang i et HashSet. Så mySet.add("Banana");
        Selv om du ringer linjen to ganger, vises Banana bare én gang.

         */

