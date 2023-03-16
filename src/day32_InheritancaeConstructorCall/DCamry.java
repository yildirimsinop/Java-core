package day32_InheritancaeConstructorCall;

public class DCamry extends BToyota {
    DCamry (String pc) {
        super("Deniz");
        System.out.println("String parametreli Camyr");

    }

    DCamry () {

    }



    public static void main(String[] args) {

        // Eger kullanilan argumente uygun bir constructor
        // parent class'da yoksa CTE olur.

        DCamry camry2 = new DCamry("celal");
        //Parametreli Araba constructor
        //String parametreli Toyota constructor
        //String parametreli Camyr

        System.out.println("================");

        DCamry camry1 = new DCamry();

        //Parametresiz Araba constructor
        //Parametresiz Toyota constructor

        System.out.println("================");

    }


}
