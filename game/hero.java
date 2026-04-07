package game;

public class hero {
    protected String nama;
    protected double health;
    protected double attackPower;

    // constructor
    public hero(String nama, double health, double attackPower) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    // method display
    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
    }

    // method berlatih
    public void berlatih() {
        attackPower += 10;
        System.out.println(nama + " sedang berlatih. Attack Power bertambah 10!");
    }

    // method terima serangan
    public void terimaSerangan(double damage) {
        health -= damage;
        System.out.println(nama + " menerima damage sebesar " + damage);
    }
}
