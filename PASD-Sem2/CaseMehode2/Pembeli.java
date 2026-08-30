public class Pembeli {
    int noAntrian;
    String nama;
    String noHp;
    Pembeli prev, next;

    // Konstruktor untuk inisialisasi data pembeli
    public Pembeli(int noAntrian, String nama, String noHp) {
        this.noAntrian = noAntrian;
        this.nama = nama;
        this.noHp = noHp;
        this.prev = null;
        this.next = null;
    }
}