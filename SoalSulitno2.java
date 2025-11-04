import java.util.Scanner;

public class SoalSulitno2 {
    public static void main(String[] args) {
        int b, k;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jumlah baris: ");
        b = input.nextInt();
        System.out.println("masukkan jumlah kolom: ");
        k = input.nextInt();

        int A[][] = new int[b][k];
        int B[][] = new int[b][k];
        int C[][] = new int[b][k];

        System.out.println("\n=== Input Matriks A ===");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = input.nextInt();
            }
        }

         System.out.println("\n=== Input Matriks B ===");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = input.nextInt();
            }
        }

         // Proses penjumlahan
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("\nHasil penjumlahan matriks (A + B):");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
