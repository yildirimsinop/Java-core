package Arraylist;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

            class randomExample {
            public static void main(String[] args) {
                Random rand = new Random();

                // Generate random integer
                int num1 = rand.nextInt(10);
                System.out.println(num1);

                // Generate random double
                double num2 = rand.nextDouble();
                System.out.println(num2);

                // Generate random boolean
                boolean bool = rand.nextBoolean();
                System.out.println(bool);
            }
        }

    }
}
