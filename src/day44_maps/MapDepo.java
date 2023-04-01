package day44_maps;

import java.util.*;

public class MapDepo {

    // ogrenci map olusturup bize donduren bir method olusturun

    public static Map<Integer, String> ornekMapOlustur () {
        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-10-H-MF");
        ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
        ogrenciMap.put(103, "Ali-Cem-11-H-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Ayse-Cem-11-M-TM");
        ogrenciMap.put(106, "Fatma-Han-10-K-Soz");

        return ogrenciMap;

    }

    public static String isimSoyIsimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {


        String ogrenciValue = ogrenciMap.get(ogrenciKey); // Ayse-Can-10-H-MF

        String [] valueArr = ogrenciValue.split("-"); // [Ayse, Cem, 11, M, TM]

        String isimSoyisim = valueArr [0] + " " + valueArr [1]; // Ayse Cem

        return isimSoyisim;

    }

    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey, String yeniSube) {

        // yoksa gelen map'i aynen geri dondurecegiz.
        // ogrenci key map'de var mi?

       if ( ogrenciMap.containsKey(ogrenciKey)) {
           // istenen Key varsa, update edip yeni map'i dondurecegiz

           String istenenKeyinValuesu = ogrenciMap.get(ogrenciKey); // Ayse-Can-10-H-MF
           String [] istenenKeyValueArr = istenenKeyinValuesu.split("-"); // [Ayse, Can, 10, H, MF]
           // yeni sube degerini atayalim

           istenenKeyValueArr [3] = yeniSube; // [Ayse, Can, 10, H, MF]

           String istenenKeyinYeniValesu =  istenenKeyValueArr[0] + "- " +
                                            istenenKeyValueArr[1] + "- " +
                                            istenenKeyValueArr[2] + "- " +
                                            istenenKeyValueArr[3] + "- " +
                                            istenenKeyValueArr[4];


                   ogrenciMap.put(ogrenciKey, istenenKeyinYeniValesu );


       }
       return ogrenciMap;
    }

    public static void subeOgrenciBilgileriniYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {

        Collection<String> valueCollection =ogrenciMap.values();

        System.out.println("Isim  Soyisim  Sinif");
        System.out.println("====================");

        for (String eachValue: valueCollection
             ) {
            // value'yu parcalarina ayir

            String [] valueArr = eachValue.split("-"); // [Ayse, Can, 10, H, MF]
            // sube ismini kontrol et, istenen sube ise isim, soyisim, sinif yazdir.

            if (valueArr[3].equals(subeAdi)) {

                System.out.println(valueArr[0] + " " + valueArr[1] + " " + valueArr[2]);
            }

        }
    }

    public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitisNo) {

        // hem Key, hemde value lazim oldugundan keySet'i olusturduk sonra o key uzerinden value'yu map'den aldik.

       Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

       // dondurecegimiz Listeyi olusturalim

        List<String> isimListesi = new ArrayList<>();

        // Key degerlerini tek tek elden gecirip istenen aralikta olanlari bulalim.

        String value;
        String [] valueArr;
        String istenenIsim;

        for (Integer eachKey: ogrenciKeySeti
             ) {

            if (basNo<= eachKey && eachKey<=bitisNo) {
                // buraya verilen sinir degerlerine uyan
                // eachKey'ler gelecek

                // sinira uygun key'in value'sunu alalim

                value = ogrenciMap.get(eachKey); // Ayse-Cem-11-M-TM
                // value'u parcalara ayilarim
                valueArr = value.split("-"); // [Ayse, Cem, 11, M, TM]

                //value array'inden Listeye ekleyelim
                istenenIsim = valueArr[0] + " " + valueArr [1] + " " + valueArr [4];

                //istenen ismi olusturduk, bunu listeye ekleyelim.

                isimListesi.add(istenenIsim);
            }
        }

        return isimListesi;
    }

    public static void numaraIsimSoyisimYazdir(Map<Integer, String> ogrenciMap) {

        Set<Integer> keySeti = ogrenciMap.keySet();
        String value;
        String [] valueArr;

        for (Integer eachKey: keySeti
             ) {
            value = ogrenciMap.get(eachKey);
            valueArr=value.split("-"); // [Ayse, Cem, 11, M, TM]

            System.out.println(eachKey + " " + valueArr [0] + " " + valueArr [1]);
        }
    }

    public static Set<String> siraliOgrenciListesiOlustur(Map<Integer, String> ogrenciMapi) {

        Set<String> siraliOgrenciSeti = new TreeSet<>();

        // tum elementlerin key ve value'lerine birlikte ihtiyac oldugundan
        // Entry kullanmaliyiz.

        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMapi.entrySet();
        // Her bir entry'i elden gecirip
        // bilgileri istedigimiz formatta alalim

        String istenenBilgi;
        String value;
        String[] valueArr;

        for (Map.Entry<Integer, String> eachEntry: ogrenciEntrySeti
             ) {
            // 101=Ali-Can-10-H-MF   Entry
            // Bolum, sinif, sube, isim, soyisim ve numaralarini yazdirin

            value = eachEntry.getValue();
            valueArr = value.split("-");

            istenenBilgi= valueArr [4] + ", " + valueArr [2] + ", " + valueArr [3] + ", " +
                          valueArr [0] + " " + valueArr [1] + ", " + eachEntry.getKey();

            siraliOgrenciSeti.add(istenenBilgi);

            // Map'de herhangi bir degisiklik istenmediginden Array'i yeniden
            // birlestirip, entry.setValue() yapmamiza gerek yok.

        }
        
        
        return siraliOgrenciSeti;
    }
}
