package day16_scope_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String[] isimler = {"Nurefsan", "Berke", "Mustafa"};
        int [] sayilar = {3, 4, 5, 6, 7, 8, 9, 6, 6};
        char [] karakterler = {'e', '4', ',', '.'};

        // Array non-primitive data turlerindendir.
        // Eger Array'i Liste seklinde olusturmayip
        // new keyword kullaniyorsak
        // UZUNLUGUNU yazmak ZORUNDAYIZ.


        String [] arr = new String[5];

        // Bir Array tanimlanan uzunluktan daha fazla veya az eleman alamaz.

        // Bir Array'i yazdirmak istersek
        // Array'ler direk yazdirilamaz.

        System.out.println(isimler);

        System.out.println(Arrays.toString(sayilar));

        System.out.println(Arrays.toString(isimler));

        System.out.println(Arrays.toString(arr));

        int [] a = new int[7];
        System.out.println(Arrays.toString(a));

        // Array'deki elementlere nasil ulasiriz ?
        // Index ile

        a[0] = 5;

        System.out.println(Arrays.toString(a));

        a[3] = 7;

        System.out.println(Arrays.toString(a));

        // a[7] = 6; // .ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(a));

        // sayilar Array'inin 4.index'indeki elementi yazdirin

        System.out.println(sayilar[4]);

        System.out.println(isimler[1]);



    }
}
