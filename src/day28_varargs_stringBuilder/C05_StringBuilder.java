package day28_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java candir.");


        System.out.println(sb.capacity()); //16 +12 = 28
        System.out.println(sb.length()); //12

        System.out.println(sb.reverse()); // .ridnac avaj (Tersten yaziyor)
        sb.reverse();

        sb.replace(0,4, "Cocuklar");
        System.out.println(sb);

        sb.insert(8, "Bu bir yalandir");
        System.out.println(sb);

        String str = "Java cok guzel";

        sb.insert(21, str, 9, 14);
        System.out.println(sb);

    }
}
