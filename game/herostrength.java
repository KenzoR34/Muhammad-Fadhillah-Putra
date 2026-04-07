package game;

public class herostrength extends hero {
    private String tipe = "Strength";

    // Constructor
    public herostrength(String nama, double health, double attackPower) {
        super(nama, health, attackPower);
    }

    // Override display
    @Override
    public void display() {
        super.display();
        System.out.println("Tipe: " + tipe);
    }

    // Override terimaSerangan (damage jadi 50%)
    @Override
    public void terimaSerangan(double damage) {
        double damageDiterima = damage * 0.5;
        health -= damageDiterima;
        System.out.println(nama + " menerima damage sebesar " + damageDiterima + " (setelah dikurangi 50%)");
    }
}