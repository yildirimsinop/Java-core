package day09_switch_stringManipulation;

public class C04_equals {
    public static void main(String[] args) {

        String str1 = "Java";

        String str2 = "JAVA";

        String str3 = "java";

        String str4 = "JaVa";


        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));

        // eger buyuk kucuk harfe dikkat etmeden String'leri karsilastirmak isterseniz.

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str4));

        String str5 = "Java";

        String str6 = "Ja";

        String str7 = "va";

        String str8 = str6.concat(str7);

        System.out.println(str8);
        System.out.println("=====================================");

        System.out.println(str1 == str5);
        System.out.println(str1 == str8);

        /*
        == ile Stringleri karsilastirirsak hem metin degerine hem de referanslarina bakar.
        equals ile Stringleri karsilastirirsak sadece metin degerlerine bakar.

        == ile Stringleri karsilastirdigimizda bekledigimizden farkli sonuclar alabiliriz, bu yuzden
        iki String'i karsilastiracaksak == degil equals kullaniriz.

         */

    }
}
