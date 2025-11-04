import java.util.Scanner;

public class SoalSedangno1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan bilangan bulat postif: ");
        int n = input.nextInt();
         if (n < 0) {
            System.out.println("maaf bilangan harus positif!!!");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }
    }
}
