package day42_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueueDataTuru {
    public static void main(String[] args) {

        Queue<String> q1 = new LinkedList<>();
        q1.add("H");
        q1.add("Y");

        q1.offer("K");

        // Kapasite sinirlamasi yapmadiginiz surece add() ile ayni islemi yapar.

        System.out.println(q1.remove());
        // Queue eklemeyi sona yapip, kullanmayi bastan yaptigi icin
        // parametreyi girmedigimizde bastaki elemani remove eder ve bize döndürür.

        System.out.println(q1.remove("K")); // true

        System.out.println(q1.remove());

        // System.out.println(q1.remove()); // NoSuchElementException

        System.out.println(q1.poll()); // null

        // q1.poll() remove ile ayni islemi yapar yani bastaki elemnti sile ve bize dondurur.
        // aralarindaki fark boz queue'da calistirildiklarinda
        // remove exception firlatir ama poll firlatmaz


        q1.add("H");
        q1.add("Y");

        System.out.println(q1.peek());

        // silmeden queu'nun basindaki elementi bize getiriyor. Eger queue bossa null getiriyor.

        System.out.println("element :" + q1.element());

        q1.clear(); // queue'yi bosaltiryor.

        // q1.remove();
        // q1.remove();
        System.out.println(q1.peek());

        // System.out.println("element :" + q1.element());



        System.out.println(q1);


    }
}
