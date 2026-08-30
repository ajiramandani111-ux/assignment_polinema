package minggu5;

import java.util.Scanner;

public class MainNilaiMahasiswa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();

        NilaiMahasiswa nm = new NilaiMahasiswa(jml);

        for (int i = 0; i < jml; i++) {

            System.out.print("Nilai UTS mahasiswa ke-" + (i + 1) + ": ");
            nm.uts[i] = sc.nextInt();

            System.out.print("Nilai UAS mahasiswa ke-" + (i + 1) + ": ");
            nm.uas[i] = sc.nextInt();
        }

        System.out.println("-------------------------");

        System.out.println("UTS tertinggi: " + nm.utsTertinggi(0, jml - 1));
        System.out.println("UTS terendah: " + nm.utsTerendah(0, jml - 1));
        System.out.println("Rata-rata UAS: " + nm.rataUAS());
    }
}