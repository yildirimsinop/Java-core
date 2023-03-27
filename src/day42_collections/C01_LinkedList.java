package day42_collections;

import java.util.LinkedList;

public class C01_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("K");
        ll1.add("S");

        // LinkedList 3 tana Interface'i implements etmistir.
        // List, Queue, Deque interfaceleri
        // Dolayisiyla interface'lerden sonra gelen ilk concrete class oldugundan
        // BU 3 interface'deki tum abstract method'lari override etmistir.

        // LinkedList olusturulurken secilen data turune gore
        // bu 3 interface'den birinin ozelliklerini alabilir
        // veya data turu LinkedList secilirse, 3 interfac'in ozelliklerini de toptan alir.

        LinkedList<String> ll2 = new LinkedList<>();

        //Daha onceden arrrayList olustururken, List<> interface'ini data turu olarak kullandigimizdan
        // bu sekilde olusturulan LinkedList'lerin ozelliklerini biliyoruz.

        ll2.add("R");
        ll2.add("Z");
        ll2.add(0,"A");

        ll2.addAll(2,ll1);
        ll2.add("H");
        ll2.add("T");

        ll2.set(3,"I"); // [A, R, K, I, Z]



        System.out.println(ll2.get(1)); //R

        System.out.println(ll2);

        System.out.println(ll2.retainAll(ll1)); //true
        ll2.add("V");
        ll2.add("Y");

        System.out.println(ll2);
        System.out.println(ll2.hashCode()); //3372

        System.out.println(ll2.subList(0, 2));


    }
}
