import game.hero;
import game.herostrength;

public class main {
    public static void main (String [] args) {

        hero hero1 = new hero("Naruto", 120, 25);
        herostrength hero2 = new herostrength("Gatotkaca", 150, 20);

        System.out.println("=== STATUS AWAL ===");
        hero1.display();
        System.out.println();
        hero2.display();
        System.out.println();

        System.out.println("=== BERLATIH ===");
        hero1.berlatih();
        hero2.berlatih();
        System.out.println();

        System.out.println("=== TERKENA SERANGAN ===");
        hero1.terimaSerangan(50);
        hero2.terimaSerangan(50);
        System.out.println();

        System.out.println("=== STATUS AKHIR ===");
        hero1.display();
        System.out.println();
        hero2.display();
    }
}
