package day32_InheritancaeConstructorCall;

public class BToyota extends Araba {

    BToyota () {

        System.out.println("Parametresiz Toyota constructor");
    }

    BToyota (Integer pt) {

        System.out.println("Parametreli Toyota constructor");
    }

    BToyota (String pt2) {

        super ("Mehmet");
        System.out.println("String parametreli Toyota constructor");
    }
}
