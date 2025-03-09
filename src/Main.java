package app;

public class Main {

    public static void main(String[] args) {

        String[] products = {"iphone", "Honor"};
        double[] prices = {1435.38, 6564.67};
        int[] quantities = {3, 8};


        for (int i = 0; i < products.length; i++) {

            double totalSales = prices[i] * quantities[i];


            double dailySales = totalSales / quantities[i];


            System.out.printf("Product No %d: %s,%n", i + 1, products[i]);
            System.out.printf("total sales for %d days is EUR %.2f,%n", quantities[i], totalSales);
            System.out.printf("sales by day is EUR %.2f.%n%n", dailySales);
        }
    }
}