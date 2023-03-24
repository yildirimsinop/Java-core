package day39_AbstractClass;

public abstract class Araba {

    // Araba class'ini inherit eden tum class'lar
    // motor, kasa, marka ve tekerlek method'larini override etmek zorunda kalsin.
    // ancak abs, klima method'lari opsiyonerl olsun
    // isteyen child bu method'lari override etsin, isteyen override etmesin.

    public abstract void motor ();

    public abstract void marka ();

    public abstract void kasa ();

    public abstract void tekerlek ();


    public void abs () {
        System.out.println("Guvenlik artirmak isteyen arabalar abs kullanmali");
    }

    public void klima () {
        System.out.println("Konfor artirmak isteyen arabalar klima kullanmali");
    }



}
