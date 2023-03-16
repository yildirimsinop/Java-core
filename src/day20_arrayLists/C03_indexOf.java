package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Erdal");


        System.out.println(isimler); //[Kubra, Mustafa, Emre, Ferhat, Erdal]


        System.out.println(isimler.get(2)); // Emre

        // Ferhat'in index'ini yazdirin


        System.out.println(isimler.indexOf("Ferhat")); // 3

        System.out.println(isimler.lastIndexOf("Ferhat")); // 3

        System.out.println(isimler.indexOf("Hilal")); // -1

        System.out.println(isimler.lastIndexOf("Fatma")); // -1


        isimler.add("Mustafa");

        System.out.println(isimler);

        System.out.println(isimler.indexOf("Mustafa")); // 1

        System.out.println(isimler.lastIndexOf("Mustafa")); // 5



    }
}
