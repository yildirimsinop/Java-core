package day42_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListSoru {
    public static void main(String[] args) {

        // Soru : Kullanicidan deger alarak iki String Liste olusturun.
        // Kullanici deger girmeyi birakmak icin 0'a basmalidir.
        // Iki Liste olustuktan sonra asagidaki sekilde bir output hazirlayin
        // Liste1 : .....
        // Liste2 : .....
        // ortak elementler : ....

        System.out.println("Once List1'i olusturalim");
        List<String> list1 = kullanicidanAlarakListOlusturmak();

        System.out.println("Simdi ikinci listeyi olusturalim");
        List<String> list2 = kullanicidanAlarakListOlusturmak();

        System.out.println("Liste1 : " + list1);
        System.out.println("Liste2 : " + list2);
        list1.retainAll(list2);

        System.out.println("Ortak elemanlar : " + list1);


    }

    public static List<String> kullanicidanAlarakListOlusturmak () {
        // Soru : Kullanicidan deger alarak iki String Liste olusturup main method'a dondurecek
        // Kullanici deger girmeyi birakmak icin 0'a basmalidir.

        List<String> isimListesi = new LinkedList<>();

        Scanner scan = new Scanner(System.in);
        String isim = "";

        while (!isim.equalsIgnoreCase("0")) {

            System.out.println("Listeye eklemek icin isim giriniz \nBitirmek icin 0'a basiniz");

            isim = scan.nextLine();

            if (!isim.equalsIgnoreCase("0")) {
                isimListesi.add(isim);

            }
        }

        return isimListesi;
    }
}
