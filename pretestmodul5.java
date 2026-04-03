public class pretestmodul5 {

    private String nomorRekening;
    private double saldo;

    // constructor
    public pretestmodul5(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        setSaldo(saldo);
    }

    // getter nomor rekening
    public String getNomorRekening() {
        return nomorRekening;
    }

    // getter saldo
    public double getSaldo() {
        return saldo;
    }

    // setter saldo
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo tidak boleh negatif!");
        }
    }

    // main
    public static void main(String[] args) {
        pretestmodul5 rek1 = new pretestmodul5("1234567890", 500000);

        System.out.println("Nomor Rekening : " + rek1.getNomorRekening());
        System.out.println("Saldo Awal     : " + rek1.getSaldo());

        rek1.setSaldo(750000);
        System.out.println("Saldo setelah update : " + rek1.getSaldo());

        rek1.setSaldo(-100000);
        System.out.println("Saldo sekarang : " + rek1.getSaldo());
    }
}
