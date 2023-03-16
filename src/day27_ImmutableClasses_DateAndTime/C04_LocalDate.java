package day27_ImmutableClasses_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih); // 2023-03-11

        System.out.println(tarih.minusDays(100)); //2022-12-01
        System.out.println(tarih.minusWeeks(5).minusDays(3)); //2023-02-01

        System.out.println(tarih.plusMonths(5).plusWeeks(2).plusDays(3)); //2023-08-28
        System.out.println(tarih.plusYears(45).plusMonths(50).plusWeeks(20).plusDays(30));

        System.out.println(tarih.getMonthValue()); // 3
        System.out.println(tarih.getMonth()); //MARCH
        System.out.println(tarih.getDayOfWeek()); //SATURDAY
        System.out.println(tarih.getDayOfYear()); // 70

        System.out.println(tarih.isLeapYear()); //false

        System.out.println(tarih.withYear(2004).isLeapYear()); // true
        System.out.println(tarih.withYear(2020).withMonth(11).withDayOfMonth(13)); //2020-11-13

        System.out.println(tarih.lengthOfMonth()); //31
        System.out.println(tarih.withYear(2020).lengthOfYear()); //366

        System.out.println(tarih.withYear(1984).withMonth(3).withDayOfMonth(22).getDayOfWeek()); //THURSDAY Umit
        System.out.println(tarih.withYear(2010).withMonth(7).withDayOfMonth(03).getDayOfWeek()); //SATURDAY Ismail
        System.out.println(tarih.withYear(2012).withMonth(12).withDayOfMonth(26).getDayOfWeek()); //WEDNESDAY Hale
        System.out.println(tarih.withYear(1987).withMonth(9).withDayOfMonth(25).getDayOfWeek()); //FRIDAY Gulsah

        LocalDate date = LocalDate.of(2011,11,11);
        LocalDate date2 = LocalDate.of(2010,10,10);

        System.out.println(date2.isBefore(date)); //true
        System.out.println(date2.isAfter(date)); //false

        System.out.println(tarih.equals(date)); // false




    }
}
