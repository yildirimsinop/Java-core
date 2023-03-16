package day05_incrementDecrement_Concatenation;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int a = 20;

        a++;

        int b = a;

        System.out.println(a + ", " + b);


        a = 20;

        b = a;

        a++;

        System.out.println(a + ", " + b);


        b = ++a;

        System.out.println(a + ", " + b);

        b = a++;

        System.out.println(a + ", " + b);


        a = 20;
        System.out.println(a++);

        System.out.println(+a);

    }
}
