package minggu5;

import java.util.Scanner;

public class MainSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan: ");
        int elemen = sc.nextInt();

        Sum sm = new Sum(elemen);

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan bulan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = sc.nextInt();
        }

        System.out.println("---------------------------");

        System.out.println("Total keuntungan BF: " + sm.totalBF());
        System.out.println("Total keuntungan DC: " + sm.totalDC(0, elemen - 1));
    }
}