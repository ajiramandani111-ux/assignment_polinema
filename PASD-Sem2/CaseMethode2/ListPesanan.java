public class ListPesanan {
    Pesanan head, tail;

    
    //Method untuk menambah pesanan
    
    public void tambah(int kode, String nama, int harga) {
        Pesanan baru = new Pesanan(kode, nama, harga);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    
    //Method sorting (Bubble Sort)
    public void sort() {
        if (head == null) return;

        boolean swapped;

        do {
            swapped = false;
            Pesanan temp = head;

            while (temp.next != null) {
                if (temp.namaPesanan.compareTo(temp.next.namaPesanan) > 0) {

                    // tukar isi node
                    int kode = temp.kodePesanan;
                    String nama = temp.namaPesanan;
                    int harga = temp.harga;

                    temp.kodePesanan = temp.next.kodePesanan;
                    temp.namaPesanan = temp.next.namaPesanan;
                    temp.harga = temp.next.harga;

                    temp.next.kodePesanan = kode;
                    temp.next.namaPesanan = nama;
                    temp.next.harga = harga;

                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);
    }

    /*
     * Method menampilkan laporan pesanan
     */
    public void tampil() {
        if (head == null) {
            System.out.println("Belum ada pesanan!");
            return;
        }

        sort(); // wajib sorting

        System.out.println("LAPORAN PESANAN (URUT NAMA)");
        Pesanan temp = head;

        int total = 0;

        while (temp != null) {
            System.out.println(
                temp.kodePesanan + " | " +
                temp.namaPesanan + " | " +
                temp.harga
            );

            total += temp.harga;
            temp = temp.next;
        }

        System.out.println("Total Pendapatan: " + total);
    }
}