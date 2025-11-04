import java.util.Scanner;

public class SoalSedangno2 {
    static double VolumeTabung(double r, double t) {
        double hasil = 3.14*r*r*t;
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jari jari: ");
        double r = input.nextDouble();
        System.out.println("masukkan tinggi: ");
        double t = input.nextDouble();

        System.out.println("Volume Tabung adalah : " + VolumeTabung(r,t) + "cm3");
    }
}
