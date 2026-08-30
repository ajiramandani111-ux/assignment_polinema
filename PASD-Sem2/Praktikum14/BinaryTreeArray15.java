public class BinaryTreeArray15 {
    Mahasiswa15[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray15() {
        // Menginisialisasi kapasitas awal array (misal 100 agar muat banyak cabang)
        this.dataMahasiswa = new Mahasiswa15[100];
        this.idxLast = -1; // -1 mengindikasikan array masih kosong
    }

    void populateData(Mahasiswa15 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    // Penambahan data dinamis ke dalam Tree Array sesuai urutan indeks level-order
    void add(Mahasiswa15 data) {
        if (idxLast + 1 < dataMahasiswa.length) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Tree Array sudah penuh!");
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // Method baru: Menampilkan data dengan urutan PreOrder (Parent -> Kiri -> Kanan)
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi(); // Cetak Parent
                traversePreOrder(2 * idxStart + 1);       // Ke anak kiri
                traversePreOrder(2 * idxStart + 2);       // Ke anak kanan
            }
        }
    }
}
