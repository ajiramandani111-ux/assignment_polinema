public class Antrian {
    Pembeli head, tail;
    int nomor = 0;

    //Method untuk menambah pembeli ke antrian (enqueue)
    public void tambah(String nama, String noHp) {
        nomor++; // auto increment nomor antrian
        Pembeli baru = new Pembeli(nomor, nama, noHp);

        if (head == null) {
            // jika kosong
            head = tail = baru;
        } else {
            // tambah di belakang
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }

        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomor);
    }

    //Method untuk mencetak seluruh antrian
    public void cetak() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Daftar Antrian:");
        Pembeli temp = head;

        while (temp != null) {
            System.out.println(
                temp.noAntrian + " | " +
                temp.nama + " | " +
                temp.noHp
            );
            temp = temp.next;
        }
    }

     // Method untuk menghapus antrian (dequeue)
     //Mengambil dari depan (FIFO)
    public Pembeli hapus() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return null;
        }

        Pembeli keluar = head;

        if (head == tail) {
            // hanya 1 data
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return keluar;
    }
}
