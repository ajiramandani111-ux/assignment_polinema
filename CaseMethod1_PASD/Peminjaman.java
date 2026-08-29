public class Peminjaman {
    Mahasiswa15 mhs;
    Buku buku;
    int lamaPinjam;
    int denda;

    public Peminjaman(Mahasiswa15 mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    public void hitungDenda() {
        if (lamaPinjam > 5) {
            int telat = lamaPinjam - 5;
            denda = telat * 2000;
        } else {
            denda = 0;
        }
    }

    public void tampil() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " + buku.judul + " | " + lamaPinjam + " | " + denda);
    }
}