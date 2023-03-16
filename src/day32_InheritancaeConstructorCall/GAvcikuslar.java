package day32_InheritancaeConstructorCall;

public class GAvcikuslar extends FKuslar{
    public static void main(String[] args) {

        GAvcikuslar avci1 = new GAvcikuslar();

        FKuslar avci2 = new GAvcikuslar();

        EHayvanlar avci = new GAvcikuslar();


        /*
            Bir child class'da obje olusturmak icin child class constructor'i kullanilir.

            Ama data turunu
            o objenin bagli oldugu class'lardan secebiliriz.

            Eger constructor ve data turu farkli secilirse
            bu durumda class uesi olan variable ve method'lar farkli davranislar gosterirler.

         */
    }
}
