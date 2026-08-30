package minggu5;

public class NilaiMahasiswa {

    int[] uts;
    int[] uas;
    int jumlah;

    NilaiMahasiswa(int jumlah) {
        this.jumlah = jumlah;
        uts = new int[jumlah];
        uas = new int[jumlah];
    }

    int utsTertinggi(int l, int r) {
        if (l == r) {
            return uts[l];
        }

        int mid = (l + r) / 2;

        int kiri = utsTertinggi(l, mid);
        int kanan = utsTertinggi(mid + 1, r);

        if (kiri > kanan) {
            return kiri;
        } else {
            return kanan;
        }
    }

    int utsTerendah(int l, int r) {
        if (l == r) {
            return uts[l];
        }

        int mid = (l + r) / 2;

        int kiri = utsTerendah(l, mid);
        int kanan = utsTerendah(mid + 1, r);

        if (kiri < kanan) {
            return kiri;
        } else {
            return kanan;
        }
    }

    double rataUAS() {
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            total += uas[i];
        }

        return (double) total / jumlah;
    }
}
