public class Buku {
    String kode;
    String judul;
    int tahun;

    public Buku(String kode, String judul, int tahun) {
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
    }

    public void tampil() {
        System.out.println(kode + " | " + judul + " | " + tahun);
    }
}