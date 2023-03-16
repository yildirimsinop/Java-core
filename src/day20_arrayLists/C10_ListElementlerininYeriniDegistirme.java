package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_ListElementlerininYeriniDegistirme {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);

        // 2. indexdeki elemnt ile 5. index'deki elementin yerini degistirin


        System.out.println(sayilar); // [3, 5, 1, 4, 3, 7, 10]

        // once bir tanesini temp veriable atayalim

        int temp = sayilar.get(2);

        System.out.println(temp);

        sayilar.set(2, sayilar.get(5));

        // 5. index'e temp'deki degeri atayalim


        sayilar.set(5, temp);

        System.out.println(sayilar); // [3, 5, 7, 4, 3, 1, 10]

        // verilen bir listede, istenen 2 index'deki elementlerin yerini degistirip
        // yeni listeyi bize donduren bir method olusturun.
    }
}
