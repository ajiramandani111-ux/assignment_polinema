public class Buku15 {
    // Atribut buku
    String kodeBuku;
    String judul;
    String penulis;
    int tahunTerbit;

    // konstruktor buku
    public Buku15(String kodeBuku, String judul, String penulis, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }
    // method menampilkan buku
    public void tampilInformasi() {
        System.out.println("Kode Buku   : " + kodeBuku);
        System.out.println("Judul       : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println();
    }
}
