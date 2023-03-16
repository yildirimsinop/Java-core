package day26_passByvalue_immutableClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class C06_ImmutableClasses {
    public static void main(String[] args) {

        String str = "Java guzeldir";

        System.out.println(str.toUpperCase()); // JAVA GUZELDIR

        System.out.println(str);

        str.toLowerCase(Locale.ROOT);

        System.out.println(str);

        // String immutable oldugu icin, method ile yapilan degisikler String'i kalici degistirmez.


        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.remove(0);

        System.out.println(harfler);

        // List ve Array mutable olduklari icin method ile yapilan degisiklikler kalici olur.



    }
}
