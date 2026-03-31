// SOAL 1
class MesinKopi {
    int bijiKopi;
    int air;
    int susu;

    // SOAL 2
    public void isiUlangBahan(int tambahKopi, int tambahAir, int tambahSusu) {
        this.bijiKopi += tambahKopi;
        this.air += tambahAir;
        this.susu += tambahSusu;

        System.out.println("Bahan berhasil diisi ulang!");
    }

    // SOAL 3 
    public boolean cekKetersediaanCappuccino() {
        return (this.bijiKopi >= 15 && this.air >= 50 && this.susu >= 100);
    }

    // SOAL 4 
    public MesinKopi() {
        this.bijiKopi = 0;
        this.air = 0;
        this.susu = 0;
    }
}


// MAIN 
public class latihansoalmodul4 {
    public static void main(String[] args) {
        MesinKopi mesinLobby = new MesinKopi();
        mesinLobby.isiUlangBahan(20, 100, 150);
        System.out.println("Cek cappuccino: " + mesinLobby.cekKetersediaanCappuccino());
    }
}

