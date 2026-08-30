public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;
    Pesanan prev, next;

    // Konstruktor untuk inisialisasi pesanan
    public Pesanan(int kode, String nama, int harga) {
        this.kodePesanan = kode;
        this.namaPesanan = nama;
        this.harga = harga;
        this.prev = null;
        this.next = null;
    }
}