package day29_stringBuilder_accessModifier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime zaman = LocalDateTime.now();

        System.out.println(zaman);  //2023-03-13T20:34:08.485307700


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");

        System.out.println(zaman.format(dtf1));  // 13/03/2023

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d:MMM:YY");

        System.out.println(zaman.format(dtf2)); // 13:mar.:23

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("d.MMMM.YYYY EEEE");

        System.out.println(zaman.format(dtf3)); // 13.mars.2023 mandag

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("HH:mm a");

        System.out.println(zaman.format(dtf4)); // 20:45 p.m.


    }
}
