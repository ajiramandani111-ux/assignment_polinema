import java.util.Scanner;

public class KRSAntrianMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS15 antrian = new AntrianKRS15(10);

        int pilih;

        do {
            System.out.println("\n=== MENU KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil 2 Antrian");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Lihat Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Sudah KRS");
            System.out.println("8. Sisa Belum KRS");
            System.out.println("9. Kosongkan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    Mahasiswa15 m = new Mahasiswa15(nim, nama, prodi, kelas);
                    antrian.enqueue(m);
                    break;

                case 2:
                    antrian.dequeue2();
                    break;

                case 3:
                    antrian.print();
                    break;

                case 4:
                    antrian.peek2();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    antrian.jumlahSudah();
                    break;

                case 8:
                    antrian.belumProses();
                    break;

                case 9:
                    antrian.clear();
                    break;
            }

        } while (pilih != 0);

        sc.close();
    }
}