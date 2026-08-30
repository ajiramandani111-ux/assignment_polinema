import java.util.Scanner;

public class LayananAkademikSIAKAD15 {
    public static void menu() {
        System.out.println("\n=== MENU ANTRIAN AKADEMIK ===");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Panggil Antrian");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Tampilkan Semua Antrian");
        System.out.println("5. Kosongkan Antrian");
        System.out.println("6. Jumlah Antrian");
        System.out.println("7. Cek Antrian Paling Belakang");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas antrian: ");
        int n = sc.nextInt();
        sc.nextLine();

        AntrianLayanan15 antrian = new AntrianLayanan15(n);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    Mahasiswa keluar = antrian.dequeue();
                    if (keluar != null) {
                        System.out.println("Mahasiswa dipanggil:");
                        keluar.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.peek();
                    break;

                case 4:
                    antrian.print();
                    break;

                case 5:
                    antrian.clear();
                    break;

                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;

                case 7:
                    antrian.lihatAkhir();
                    break;
            }

        } while (pilih != 0);

        sc.close();
    }
}