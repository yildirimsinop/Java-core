package day27_ImmutableClasses_DateAndTime;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime zaman = LocalDateTime.now();

        System.out.println(zaman); // 2023-03-11T00:37:03.241020900

        System.out.println(zaman.getDayOfMonth()); //11

        System.out.println(zaman.getDayOfYear()); //70


    }
}
