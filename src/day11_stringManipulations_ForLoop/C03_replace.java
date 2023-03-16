package day11_stringManipulations_ForLoop;

public class C03_replace {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.replace('J', 'H'));

        System.out.println(str.replace("a", ""));

        System.out.println(str.replace("Java", "X"));

        System.out.println(str.replace("v", "yayaya"));

        str.replace("va", "lala"); // yapilan degisiklik bu satir icindir
                                                                       // yazdirilmaz ise gozmeyiz, atama yapilmagidi icin
                                                                       // kalici olmaz

        // str'daki space'leri yok edin

        System.out.println(str = str.replace(" ", ""));

        System.out.println(str); // JavaCandir

        System.out.println(str.replace("a", ""));

        System.out.println(str.replaceFirst("a", ""));

        System.out.println(str.replaceFirst("C", "K"));



    }
}
