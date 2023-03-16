package day11_stringManipulations_ForLoop;

import java.util.SortedMap;

public class C02_nullPointer {
    public static void main(String[] args) {

        // null bir deger degildir.
        // null bir pointer'dir, yanina yazildigi non-primitive variable'a deger atanmadigini isaret eder.


        String str; // str olusturuldu ama deger atanmadi.

        //Java method icerisinde deger atamadan variable olusturulmasina izin verir.
        // ama deger atamadan kullanilmasina izin vermez.

        // str.concat ("Java"); CTE

        // Bazen programlarda variable'lar olusturulur ama
        // daha sonra deger atanacagi icin deger atamasi yapilmaz
        // deger atamasi yapilmadan listeleme bile CTE verdigi icin
        // deger verilmedigini isaretleyecek, ama CTE olusmasini engelleyecek
        // bir cozum olarak null pointer olusturulmustur.


        str = null; // str = "null" degil
                    // null olarak isaretlenmis, degeri null atanmis degil

        System.out.println(str);
        // System.out.println(str.concat("java")); // Run time Error -----NullPointerException

        // System.out.println(str.length()); // Run time Error -----NullPointerException

        System.out.println(str + "Java"); //nullJava

        String str2 = str + "Java";

        System.out.println(str2);

        String str3 = ""; // str3'e deger atanmistir
                          // atanan degr hiclik'tir

        System.out.println(str3.concat("Java")); // java

        // System.out.println(str.isEmpty()); // NullPointerException

        // null olarak isaretlenen bir String HIC BIR METHOD'LA kullanilamaz

        System.out.println(str3.isEmpty());









    }
}
