package day27_ImmutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

        // dogumunuzdan bugune ne kadar zaman gecti?

        LocalDate bugun = LocalDate.now();

        LocalDate dogumgunu = LocalDate.of(1984,03,22);


        Period gecenSure = Period.between(dogumgunu, bugun);

        System.out.println(gecenSure); //P38Y11M17D

        System.out.println(gecenSure.getYears()); //38


    }
}
