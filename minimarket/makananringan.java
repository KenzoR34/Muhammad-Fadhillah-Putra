package minimarket;

public class makananringan extends produk {

    // atribut tambahan
    private String rasa;

    // constructor menggunakan super
    public makananringan(String namaproduk, double harga, String rasa) {
        super(namaproduk, harga);
        this.rasa = rasa;
    }

    // override method
    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail(); // panggil milik parent
        System.out.println("Rasa        : " + rasa);
    }
}