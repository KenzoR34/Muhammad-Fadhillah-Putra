import java.util.Scanner;

public class no1modul2 {
    public static void main(String[] args) {

 Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang ruangan (m): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar ruangan (m): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi ruangan (m): ");
        double tinggi = input.nextDouble();

        double luasDinding = 2*(panjang*tinggi)+2*(lebar*tinggi);
        double literCat = Math.ceil(luasDinding / 10);

        System.out.println("Luas permukaan dinding: " + luasDinding + " m2");
        System.out.println("Liter cat yang dibutuhkan: " + literCat + " liter");

        input.close();
    }
}
