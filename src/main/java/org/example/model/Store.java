package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        System.out.println("\n*** STORE PRODUCT LIST ***\n");
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println();
        }
        System.out.println("*** END OF PRODUCT LIST ***\n");
    }

    public static void main(String[] args) {
        // ProductForSale array oluşturma
        ProductForSale[] products = new ProductForSale[3];

        // Array'e objeler ekleme
        products[0] = new Chocolate("Dark Chocolate", 5.99, "Premium Belgian Dark Chocolate", 85);
        products[1] = new Coke("Coca Cola", 2.50, "Classic Coca Cola 330ml", false);
        products[2] = new Bread("Sourdough", 3.25, "Fresh Artisan Sourdough Bread", "Rye");

        // listProducts metodunu çağırma
        listProducts(products);

        // Test için sales price hesaplama
        System.out.println("=== SALES PRICE EXAMPLES ===");
        System.out.println("3x Chocolate: $" + products[0].getSalesPrice(3));
        System.out.println("5x Coke: $" + products[1].getSalesPrice(5));
        System.out.println("2x Bread: $" + products[2].getSalesPrice(2));
    }
}