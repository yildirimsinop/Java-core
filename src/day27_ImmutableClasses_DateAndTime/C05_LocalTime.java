package day27_ImmutableClasses_DateAndTime;

import java.time.LocalTime;

public class C05_LocalTime {
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 00:30:59.543181700

        LocalTime saat2 = LocalTime.of(19, 10, 20);

        System.out.println(saat.compareTo(saat2)); //-1

        System.out.println(saat2.withNano(45565));


    }
}
