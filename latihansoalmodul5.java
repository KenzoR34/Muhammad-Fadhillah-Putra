public class latihansoalmodul5 {
    // Soal 1,2,3
    static class Karyawan {

        private String idKaryawan;
        private String nama;
        private double gajiPokok;
        protected String departemen;

        public Karyawan(String idKaryawan, String nama) {
            this.idKaryawan = idKaryawan;
            this.nama = nama;
            this.gajiPokok = 0;
        }
        public String getIdKaryawan() {
            return idKaryawan;
        }
        public void setIdKaryawan(String idKaryawan) {
            this.idKaryawan = idKaryawan;
        }
        public String getNama() {
            return nama;
        }
        public void setNama(String nama) {
            this.nama = nama;
        }
        public double getGajiPokok() {
            return gajiPokok;
        }
        public void setGajiPokok(double gaji) {
            if (gaji >= 0) {
                this.gajiPokok = gaji;
            } else {
                System.out.println("Gaji tidak boleh negatif!");
            }
        }
        public void setDepartemen(String departemen) {
            this.departemen = departemen;
        }
        public void tampilkanDataKaryawan() {
            System.out.println("DATA KARYAWAN");
            System.out.println("ID          : " + idKaryawan);
            System.out.println("Nama        : " + nama);
            System.out.println("Departemen  : " + departemen);
            System.out.println("Gaji Pokok  : Rp" + gajiPokok);
        }
    }
    // Soal 4
    public static void main(String[] args) {

        Karyawan k1 = new Karyawan("K001", "Fadhil");

        k1.setDepartemen("IT");
        k1.setGajiPokok(-3000000); // harus ditolak
        k1.setGajiPokok(3000000);  // valid

        k1.tampilkanDataKaryawan();
    }
}

