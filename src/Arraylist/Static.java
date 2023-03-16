package Arraylist;

public class Static {
    public static void main(String[] args) {


    }

    public class Calculator {
        public static int add(int a, int b) {
            return a + b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

    }

    public class Circle {
        public static final double PI = 3.14159;

        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return PI * radius * radius;
        }

        public double getCircumference() {
            return 2 * PI * radius;
        }
    }



}
