import java.util.Scanner;

public class SoalMudahno1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();
        System.out.println("masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();
        System.out.println("masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();
        System.out.println("masukkan berat paket (kg): ");
        double berat = input.nextDouble();
        System.out.println("masukkan jarak tempuh paket (km): ");
        double jarak = input.nextDouble();
        
        // Volume Paket
        double volume = panjang*lebar*tinggi;

        // menentukan biaya per (Kg)
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        // menghitung biaya utama 

        double biayaUtama = berat*biayaPerKg;

        // apakah ada biaya tambahan?? jika ada maka:
        double biayaTambahan = 0;
        if (volume > 100) {
            biayaTambahan = 50000;
        }

        // total biaya 
        double totalBiaya = biayaUtama + biayaTambahan;
        
        System.out.println("volume paket: " + volume + "cm^3");
        System.out.println("biaya per (Kg): Rp " + biayaPerKg );
        System.out.println("biaya utama: Rp " + biayaUtama);
        System.out.println("biaya tambahan: Rp " + biayaTambahan);
        System.out.println("  ");
        System.out.println("total biaya: Rp " + totalBiaya);
    }
}
