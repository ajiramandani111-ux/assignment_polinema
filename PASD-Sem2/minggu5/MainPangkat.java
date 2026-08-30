package minggu5;

import java.util.Scanner;

public class MainPangkat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {

            System.out.print("Masukkan nilai yang dipangkatkan: ");
            int nilai = sc.nextInt();

            System.out.print("Masukkan nilai pangkat: ");
            int pangkat = sc.nextInt();

            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("--------------------");

        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil pangkat BF: " + png[i].pangkatBF());
            System.out.println("Hasil pangkat DC: " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}