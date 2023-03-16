package day12_forLoops;

public class C01_DikkatEdilecekler {
    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {

            System.out.println(i + " ");

            // fro loop calisti, ancak ilk deger icin bitis sarti false verdiginden
            // loop body'si HIC DEVREYE GIRMEDI


            for (int j = 0; j < 10; j--) {

                System.out.println(j + " ");

                // loop basladiktan sonra artis/azalis yontemi sebebiyle
                // bitis degerinden uzaklasiyorsa, loop teorik olarak sonsuza kadar calisir.
                // buna Sonsuz Loop denir.





            }

        }
    }
}
