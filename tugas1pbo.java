import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    int usia;
    double tinggi;

    void tampilkanData() {
        System.out.println("\nDATA MAHASISWA");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Usia  : " + usia);
        System.out.println("Tinggi: " + tinggi + " cm");
    }

    void operasiAritmatika() {
        double hasil = (usia * 2) + 10 / 5 - 3;
        System.out.println("\nHasil operasi (usia * 2) + 10 / 5 - 3 = " + hasil);
    }

    void operasiPerbandingan() {
        boolean hasil = usia > 18;
        System.out.println("\nApakah usia > 18 ? " + hasil);
    }

    void operasiLogika() {
        boolean hasil = (usia > 18) && (tinggi > 160);
        System.out.println("\nApakah usia > 18 DAN tinggi > 160 ? " + hasil);
    }

    void konversiTipeData() {
        double usiaDouble = (double) usia;
        int tinggiInt = (int) tinggi;

        System.out.println("\nKONVERSI TIPE DATA");
        System.out.println("Usia (int -> double): " + usiaDouble);
        System.out.println("Tinggi (double -> int): " + tinggiInt);
    }
}

public class tugas1pbo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();

        System.out.print("Masukkan Nama : ");
        mhs.nama = input.nextLine();

        System.out.print("Masukkan NIM : ");
        mhs.nim = input.nextLine();

        System.out.print("Masukkan Usia : ");
        mhs.usia = input.nextInt();

        System.out.print("Masukkan Tinggi Badan (cm) : ");
        mhs.tinggi = input.nextDouble();

        mhs.tampilkanData();
        mhs.operasiAritmatika();
        mhs.operasiPerbandingan();
        mhs.operasiLogika();
        mhs.konversiTipeData();
    }
}
