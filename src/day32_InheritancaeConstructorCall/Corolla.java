package day32_InheritancaeConstructorCall;

public class Corolla extends BToyota {

    Corolla (int p) {
        super(5);
        System.out.println("Parametreli Corolla constructor");

    }

    Corolla () {

    }

    Corolla (String str) {
        this ();
        System.out.println("String parametreli Corolla constructor");

    }
    public static void main(String[] args) {

        Corolla corolla3 = new Corolla("Ilker");

        System.out.println("==================");

        Corolla corolla1 = new Corolla();

        System.out.println("==================");

        Corolla corolla2 = new Corolla (3);
    }
}
