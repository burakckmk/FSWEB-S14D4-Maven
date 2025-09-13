package org.example.model;

public class Coke extends ProductForSale {
    private boolean isZeroSugar;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.isZeroSugar = false; // default value
    }

    public Coke(String type, double price, String description, boolean isZeroSugar) {
        super(type, price, description);
        this.isZeroSugar = isZeroSugar;
    }

    public boolean isZeroSugar() {
        return isZeroSugar;
    }

    @Override
    public void showDetails() {
        System.out.println("=== COKE DETAILS ===");
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Zero Sugar: " + (isZeroSugar ? "Yes" : "No"));
        System.out.println("===================");
    }
}