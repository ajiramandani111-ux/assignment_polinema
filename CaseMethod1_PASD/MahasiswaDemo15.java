import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemPeminjaman sp = new SistemPeminjaman();

        sp.tambah(new Peminjaman(sp.mhs[0], sp.buku[0], 7));
        sp.tambah(new Peminjaman(sp.mhs[1], sp.buku[1], 3));
        sp.tambah(new Peminjaman(sp.mhs[2], sp.buku[2], 10));
        sp.tambah(new Peminjaman(sp.mhs[2], sp.buku[3], 6));
        sp.tambah(new Peminjaman(sp.mhs[0], sp.buku[1], 4));

        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            if (pilih == 1) {
                sp.tampilMahasiswa();
            } else if (pilih == 2) {
                sp.tampilBuku();
            } else if (pilih == 3) {
                sp.tampilPeminjaman();
            } else if (pilih == 4) {
                sp.sortDenda();
                System.out.println("Setelah diurutkan (Denda terbesar):");
                sp.tampilPeminjaman();
            } else if (pilih == 5) {
                System.out.print("Masukkan NIM: ");
                String nim = sc.next();
                sp.cariNIM(nim);
            }

        } while (pilih != 0);
    }
}