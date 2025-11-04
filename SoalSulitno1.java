import java.util.Scanner;

public class SoalSulitno1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double totalNilai = 0;

        System.out.println("masukkan jumlah siswa: ");
        int JumlahSiswa = input.nextInt();
        for (int n = 1; n <= JumlahSiswa; n++) {
            System.out.println("masukkan nilai siswa ke " + n );
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }
        
        double rataRata =  totalNilai/JumlahSiswa;
        System.out.println("nilai  rata rata : " + rataRata);

    }
}
