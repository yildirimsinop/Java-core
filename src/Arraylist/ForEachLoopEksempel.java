import java.util.ArrayList;

public class ForEachLoopEksempel {
    public static void main(String[] args) {
        ArrayList<String> navn = new ArrayList<String>();
        navn.add("Ola");
        navn.add("Kari");
        navn.add("Per");

        for (String s : navn) {
            System.out.println(s);
        }

    }
}
