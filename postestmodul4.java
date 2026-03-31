class DuitKu {
    String nama;
    String noHP;
    int saldo;
    public DuitKu(String nama, String noHP) {
        this.nama = nama;
        this.noHP = noHP;
        this.saldo = 0;
    }
    public void setor(int jumlah) {
        if (jumlah < 10000) {
            System.out.println("Setoran gagal! Minimal Rp 10.000");
        } else {
            saldo += jumlah;
            System.out.println("Setor berhasil: Rp " + jumlah);
            System.out.println("Saldo sekarang: Rp " + saldo);
        }
    }
    public void bayarTagihan(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Pembayaran berhasil: Rp " + jumlah);
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup");
        }
        System.out.println("Saldo sekarang: Rp " + saldo);
    }
}

public class postestmodul4 {
    public static void main(String[] args) {

        DuitKu anton = new DuitKu("Anton", "081234567");

        anton.setor(50000);
        anton.bayarTagihan(60000);
        anton.setor(20000);
        anton.bayarTagihan(60000);

        System.out.println("Sisa saldo Anton: Rp " + anton.saldo);
    }
}

