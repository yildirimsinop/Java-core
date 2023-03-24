package day39_AbstractClass;

public class CHondaCivic extends BHonda {
    @Override
    public void motor() {

        System.out.println("Honda Civic araclar vtec teknolojili motorlar kullanir");

    }

    @Override
    public void kasa() {

        System.out.println("Civic sedan veya hb kasa kullanir");

    }

    @Override
    public void tekerlek() {

        System.out.println("civic araclar 205x55x16 teker kullanir");

    }

    @Override
    public void yakit() {

        System.out.println("civic araclar benzinlidir.");

    }

    @Override
    public void guvenlik() {

        System.out.println("civic araclar guvenlik standartlarina uygundur.");

    }

    @Override
    public void abs() {
        System.out.println("Honda Civic arabalar standart olarak abs kullanir.");
    }

    @Override
    public void klima() {
        System.out.println("Honda Civic arabalar standart olarak klima kullanir.");
    }

    public static void main(String[] args) {
        CHondaCivic civic1 = new CHondaCivic();

        /*
            Abstract parent class'lardaki abstract method'lar concrete child class'lar
            tarafindan mecburen override edilir.

            Ancak abstract parent'lardaki concrete method'lari override etmek mecburu
            degildir. Eger child class'a uyarlamak isterseniz override edebilirsiniz veya
            override etmeyip parent class'daki haliyle kullanabilirsiniz.

         */

        civic1.abs();  // Araba
        civic1.klima();  // Araba
        civic1.marka(); // Honda
        civic1.ozelTeknoloji(); // Honda
    }
}
