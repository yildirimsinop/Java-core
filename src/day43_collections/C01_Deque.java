package day43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {

        Deque<String> dq1 = new LinkedList<>();
        dq1.add("K");
        dq1.add("B");
        dq1.addLast("F");
        dq1.addFirst("A");

        System.out.println(dq1.getFirst()); // A
        System.out.println(dq1.getLast());  // F

        System.out.println(dq1.remove()); //  A
        System.out.println(dq1.poll()); // K

        System.out.println(dq1.removeLast()); //F
        System.out.println(dq1.remove()); // B

        // System.out.println(dq1.remove()); //  java.util.NoSuchElementException
        System.out.println(dq1.poll());
        // bos deque olmasina ragmen exception firlatmaz, eleman silemedigi icin bize null dondurur.

        dq1.add("K");
        dq1.add("B");

        dq1.push("F"); // [F, K, B]
        // deque'in basina element ekler eger dque ile ilgili sinirlandirma varsa ve yer kalmamissa
        // IllegalStateException verir.

        System.out.println(dq1.pop());  // F
        // ilk elementi siler ve bize dondurur removeFirst() ile ayni islevi gorur.

        System.out.println(dq1.element()); // K
        // Ilke elementi silmeden bize dondurur. Bos deque'de calisirsa exception firlatir.

        System.out.println(dq1.peek()); // K
        // Ilke elementi silmeden bize dondurur. Bos deque'de calisirsa exception firlatmaz
        System.out.println(dq1.peekFirst()); // K
        System.out.println(dq1.peekLast()); // B

        System.out.println(dq1.offer("C")); // true liste [K, B, C] oldu.
        System.out.println(dq1.offerFirst("M")); // true liste [M, K, B, C] oldu.


        System.out.println(dq1);

    }
}
