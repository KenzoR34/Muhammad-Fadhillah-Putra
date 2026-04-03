public class postestmodul5 {

    private String kodeBarang;
    private String nama;
    private int jumlahStok;
    private double harga;

    protected String jenis;

    public postestmodul5(String kodeBarang, String nama) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.jumlahStok = 0;
        this.harga = 0;
    }
    public String getKodeBarang() {
        return kodeBarang;
    }
    public String getNama() {
        return nama;
    }
    public int getJumlahStok() {
        return jumlahStok;
    }
    public double getHarga() {
        return harga;
    }
    public void setJumlahStok(int jumlah) {
        if (jumlah >= 0) {
            this.jumlahStok = jumlah;
        } else {
            System.out.println("Stok tidak boleh minus!");
        }
    }
    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga harus lebih dari 0!");
        }
    }
    public void addStok(int tambah) {
        if (tambah > 0) {
            jumlahStok += tambah;
            System.out.println("Tambah stok: " + tambah);
        }
    }
    public void reduceStok(int kurang) {
        if (kurang > 0 && jumlahStok >= kurang) {
            jumlahStok -= kurang;
            System.out.println("Kurang stok: " + kurang);
        } else {
            System.out.println("Gagal, stok tidak cukup / input salah");
        }
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void tampilInfo() {
        System.out.println("=== DATA BARANG ===");
        System.out.println("Kode   : " + kodeBarang);
        System.out.println("Nama   : " + nama);
        System.out.println("Jenis  : " + jenis);
        System.out.println("Stok   : " + jumlahStok);
        System.out.println("Harga  : Rp" + harga);
        System.out.println("===================");
    }

    public static void main(String[] args) {
        postestmodul5 b1 = new postestmodul5("BRG01", "Laptop");

        b1.setJenis("Elektronik");
        b1.setHarga(7000000);
        b1.addStok(10);
        b1.reduceStok(3);

        b1.tampilInfo();
    }
}

