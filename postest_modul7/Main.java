package postest_modul7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<MetodePembayaran> list = new ArrayList<>();

        list.add(new EWallet());
        list.add(new KartuKredit());

        for (MetodePembayaran m : list) {

            m.bayar(100000);

            if (m instanceof EWallet) {
                EWallet ew = (EWallet) m;
                ew.bayar(100000, "08123456789");
            }

            if (m instanceof KartuKredit) {
                KartuKredit kk = (KartuKredit) m;
                kk.verifikasiPIN();
            }

            System.out.println();
        }
    }
}
