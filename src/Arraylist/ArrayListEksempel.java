import java.util.ArrayList;

public class ArrayListEksempel {
    public static void main(String[] args) {
        String[] products = {"sjokolade", "kjeks", "kake", "chips"};
        int[] stocks = {120, 15, 0, 20};
        double[] prices = {2.50, 3.00, 4.50, 5.00};

// stokta kaç adet ürün kaldığını kontrol etmek için bir döngü kullanalım


        for (int i = 0; i < products.length; i++) {
            if (stocks[i] == 0) {
                System.out.println(products[i] + " utsolgt, må skaffes.");
            } else if (stocks[i] > 50) {
                    System.out.println(products[i] + " på lager, pris : " + prices[i] + " Kroner");

                } else if (stocks[i] < 50 && stocks[i] > 0) {
                    System.out.println(products[i] + "  går tom for lager : " + prices[i] + " Kroner");

                }
            }
        }
    }


