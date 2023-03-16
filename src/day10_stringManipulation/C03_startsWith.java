package day10_stringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {

        String str = "Java harika";

        System.out.println(str.startsWith("java"));

        System.out.println(str.startsWith("Ja"));

        System.out.println(str.startsWith(str));

        System.out.println(str.startsWith(""));

        System.out.println("=====================================================");


        System.out.println(str.endsWith("a"));

        System.out.println(str.endsWith("ka"));

        System.out.println(str.endsWith("Java harika"));

        System.out.println(str.endsWith(str.substring(str.length() - 1)));


    }
}
