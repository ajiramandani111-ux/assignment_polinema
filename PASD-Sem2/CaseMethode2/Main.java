import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Antrian antrian = new Antrian();
        ListPesanan pesanan = new ListPesanan();

        int pilih;

        do {
            System.out.println("===========================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("===========================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    // tambah antrian
                    System.out.print("Nama Pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    String hp = sc.nextLine();

                    antrian.tambah(nama, hp);
                    break;

                case 2:
                    // cetak antrian
                    antrian.cetak();
                    break;

                case 3:
                    // hapus antrian + input pesanan
                    Pembeli p = antrian.hapus();

                    if (p != null) {
                        System.out.println("Melayani: " + p.nama);

                        System.out.print("Kode Pesanan: ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan: ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga: ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        pesanan.tambah(kode, namaPesanan, harga);

                        System.out.println(p.nama + " telah memesan " + namaPesanan);
                    }
                    break;

                case 4:
                    // laporan pesanan
                    pesanan.tampil();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilih != 0);

        sc.close();
    }
}