import minimarket.makananringan;

public class main {
    public static void main(String[] args) {

        // membuat objek
        makananringan snack = new makananringan(
                "Keripik Kentang",
                12000,
                "Balado"
        );

        // tampilkan detail
        snack.tampilkanDetail();
    }
}
