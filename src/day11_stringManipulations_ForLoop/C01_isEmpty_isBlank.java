package day11_stringManipulations_ForLoop;

public class C01_isEmpty_isBlank {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.isEmpty());

        System.out.println(str.isBlank());


        str = "   ";

        System.out.println(str.isEmpty());

        System.out.println(str.length());

        System.out.println(str.isBlank());

        str = "";

        System.out.println(str.isEmpty()); // true

        System.out.println(str.length()); // 0

        System.out.println(str.isBlank()); //true



    }
}
