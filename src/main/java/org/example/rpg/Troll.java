package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable {

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }

    public void showMonsterInfo() {
        System.out.println("=== TROLL INFO ===");
        System.out.println("Name: " + getName());
        System.out.println("Hit Points: " + getHitPoints());
        System.out.println("Base Damage: " + getDamage());
        System.out.println("Bleed Damage: " + bleed());
        System.out.println("Poison Damage: " + poison());
        System.out.println("Total Attack Damage: " + attack());
        System.out.println("==================");
    }
}