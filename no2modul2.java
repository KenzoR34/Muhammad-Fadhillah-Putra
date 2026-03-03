import java.util.Scanner;

public class no2modul2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: ");
        double c = input.nextDouble();

        double f = (c * 9/5) + 32;
        double k = c + 273.15;
        double r = c * 4/5;

        System.out.println("Fahrenheit: %.2f\n");
        System.out.println("Kelvin: %.2f\n");
        System.out.println("Reamur: %.2f\n");

        input.close();
    }
}
 