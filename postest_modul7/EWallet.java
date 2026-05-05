package postest_modul7;

class EWallet extends MetodePembayaran {

    @Override
    void bayar(double nominal) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + "...");
    }

    void bayar(double nominal, String nomorHp) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + " dari nomor " + nomorHp + "...");
    }
}