package day11_stringManipulations_ForLoop;

public class C05_replaceAll {
    public static void main(String[] args) {

        String str = "     J&ava54 C+an01dir,,,     ";

        // str'i Java Candir haline getirin


        str = str.trim();

        System.out.println(str);

        System.out.println(str = str.replaceAll("\\d", ""));

        System.out.println(str = str.replaceAll(" ", "5"));

        System.out.println(str = str.replaceAll("\\W", ""));

        System.out.println(str = str.replaceAll("5", " "));

        System.out.println(str);


    }
}
