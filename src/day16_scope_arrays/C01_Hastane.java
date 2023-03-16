package day16_scope_arrays;



public class C01_Hastane {

    public static void main(String[] args) {

        ADoktor dok1 = new ADoktor();

        System.out.println(dok1.askerlikYaptiMi); // false

        dok1.isim = "Kemal";
        dok1.soyIsim = "Yilmaz";
        dok1.dogumYili = 1980;
        System.out.println(dok1.isim);

        ADoktor dok2 = new ADoktor();
        System.out.println(dok2.isim); // null
        dok2.soyIsim = "Celik";
        System.out.println(dok2.soyIsim); // Celik

        System.out.println(dok1); //referansini yazdirir.

        System.out.println(dok1.fakulte); // Tip
        System.out.println(dok2.fakulte); // Tip

        dok1.isim = "Burcu";
        System.out.println(dok2.isim);

        dok1.fakulte = "Tip fakultesi";
        System.out.println(dok2.fakulte);

        ADoktor dok3 = new ADoktor();
        System.out.println(dok3.dogumYili); //0
        System.out.println(dok3.fakulte); // Tip fakultesi

        System.out.println(ADoktor.fakulte);

        // static variable'lar icin tavsiye edilen erisim yontemi
        // classIsmi.staticUyeIsmi seklinde yazimdir.
        // bu kulllanim bicimine static yontem denir.











    }
}
