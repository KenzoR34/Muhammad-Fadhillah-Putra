package minimarket;

public class produk {

    // atribut
    protected String namaProduk;
    protected double harga;

    // constructor
    public produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // method tampilkan detail
    public void tampilkanDetail() {
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp " + harga);
    }
}