package day40_Interfaces;

public class I07_ConcreteCholdOf2Interfaces implements I05_Interface, I06_Interface {

    /*
        1- Bir class sadece bir class'a extends edilebilir ancak birden fazla interface'e
        implements edilebilir.

        2- Concrete child class implement ettigi tum
     */
    @Override
    public void mehthod1() {

    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
