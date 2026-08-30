public class SistemPeminjaman {
    Peminjaman[] data = new Peminjaman[10];
    int jumlah = 0;

    Mahasiswa15[] mhs = {
        new Mahasiswa15("22001", "Andi", "Teknik Informatika"),
        new Mahasiswa15("22002", "Budi", "Teknik Informatika"),
        new Mahasiswa15("22003", "Citra", "Sistem Informasi Bisnis")
    };

    Buku[] buku = {
        new Buku("B001", "Algoritma", 2020),
        new Buku("B002", "Basis Data", 2019),
        new Buku("B003", "Pemrograman", 2021),
        new Buku("B004", "Fisika", 2024)
    };

    public void tambah(Peminjaman p) {
        data[jumlah++] = p;
    }

    public void tampilMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("NIM: " + mhs[i].nim + " | Nama: " + mhs[i].nama + " | Prodi: " + mhs[i].prodi);
        }
    }

    public void tampilBuku() {
        System.out.println("Daftar Buku:");
        for (int i = 0; i < buku.length; i++) {
            System.out.println("Kode: " + buku[i].kode + " | Judul: " + buku[i].judul + " | Tahun: " + buku[i].tahun);
        }
    }

    public void tampilPeminjaman() {
        System.out.println("Data Peminjaman:");
        for (int i = 0; i < jumlah; i++) {
            int telat = data[i].lamaPinjam > 5 ? data[i].lamaPinjam - 5 : 0;
            System.out.println(data[i].mhs.nama + " | " + data[i].buku.judul +
                    " | Lama: " + data[i].lamaPinjam +
                    " | Terlambat: " + telat +
                    " | Denda: " + data[i].denda);
        }
    }

    public void sortDenda() {
        for (int i = 1; i < jumlah; i++) {
            Peminjaman temp = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].denda < temp.denda) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    public void sortNIM() {
        for (int i = 1; i < jumlah; i++) {
            Peminjaman temp = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    public void cariNIM(String nim) {
        sortNIM();
        int kiri = 0, kanan = jumlah - 1;
        boolean ketemu = false;

        while (kiri <= kanan) {
            int mid = (kiri + kanan) / 2;

            if (data[mid].mhs.nim.equals(nim)) {
                int telat = data[mid].lamaPinjam > 5 ? data[mid].lamaPinjam - 5 : 0;
                System.out.println(data[mid].mhs.nama + " | " + data[mid].buku.judul +
                        " | Lama: " + data[mid].lamaPinjam +
                        " | Terlambat: " + telat +
                        " | Denda: " + data[mid].denda);
                ketemu = true;
                break;
            } else if (data[mid].mhs.nim.compareTo(nim) < 0) {
                kiri = mid + 1;
            } else {
                kanan = mid - 1;
            }
        }

        if (!ketemu) {
            System.out.println("Data tidak ditemukan");
        }
    }
}