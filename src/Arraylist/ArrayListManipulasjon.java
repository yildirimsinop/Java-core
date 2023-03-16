import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListManipulasjon {
    public static void main(String[] args) {
        ArrayList<String> navn = new ArrayList<>();

        navn.add("Ola");
        navn.add("Kari");
        navn.add("Per");

        System.out.println("ArrayList før manipulasjon: " + navn);

        // Legg til et navn på plass 1
        leggTilNavn(navn, 1, "Lena");

        System.out.println("ArrayList etter manipulasjon: " + navn);

        // Fjern navnet på plass 2
        fjernNavn(navn, 2);

        System.out.println("ArrayList etter manipulasjon: " + navn);
    }

    private static void leggTilNavn(ArrayList<String> navn, int index, String nyttNavn) {
        Iterator<String> iterator = navn.iterator();
        int count = 0;

        while (iterator.hasNext()) {
            if (count == index) {
                navn.add(index, nyttNavn);
                break;
            }
            iterator.next();
            count++;
        }
    }

    private static void fjernNavn(ArrayList<String> navn, int index) {
        Iterator<String> iterator = navn.iterator();
        int count = 0;

        while (iterator.hasNext()) {
            if (count == index) {
                iterator.remove();
                break;
            }
            iterator.next();
            count++;


            /*
            La oss si at du ønsker å lagre lagerdata for en supermarked.
            Dataene kan inneholde informasjon om hvert produkt, for eksempel produktnavn, strekkode og mengde.
            Du vil kanskje lagre disse dataene i en liste, fordi lagerdataene for supermarkedet har en bestemt rekkefølge,
            og du vil kunne enkelt legge til, fjerne eller oppdatere dataene. I dette tilfellet,
            vil det være hensiktsmessig å bruke en liste.
             */
        }
    }
}
