import java.util.Scanner;

public class postest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("SISTEM PAYROLL PERUSAHAAN");

        System.out.print("Nama Karyawan:");
        String nama = input.nextLine();

        System.out.print("Gaji Pokok (Rp):");
        double gajiPokok = input.nextDouble();

        System.out.print("Jumlah Jam Lembur:");
        int jamLembur = input.nextInt();
        double upahLemburPerJam = gajiPokok / 173;
        double totalUangLembur = jamLembur * upahLemburPerJam;
        double gajikotor = gajiPokok + totalUangLembur;
        double pajak = gajikotor * 0.05;
        double bpjs = gajiPokok * 0.01;
        double gajiBersih = gajikotor - pajak - bpjs;

        System.out.println("\n SLIP GAJI");
        System.out.println("Karyawan : " + nama);
        System.out.printf("Upah Lembur/Jam : Rp %.2f\n", upahLemburPerJam);
        System.out.printf("Total Uang Lembur : Rp %.2f\n", totalUangLembur);
        System.out.printf("Gaji Bruto : Rp %.2f\n", gajikotor);
        System.out.printf("Potongan Pajak : Rp %.2f\n", pajak);
        System.out.printf("Potongan BPJS : Rp %.2f\n", bpjs);
        System.out.printf("GAJI BERSIH : Rp %.2f\n", gajiBersih);
    

        input.close();
    }
}
