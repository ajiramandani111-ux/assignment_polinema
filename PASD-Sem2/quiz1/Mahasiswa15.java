public class Mahasiswa15 {

    String nim;
    String nama;
    int tahunMasuk;
    Matkul15[] mataKuliahDiambil;
    int jumlahMK;

    public Mahasiswa15(String nim, String nama, int tahunMasuk, int kapasitas) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.mataKuliahDiambil = new Matkul15[kapasitas];
        this.jumlahMK = 0;
    }

    public void tambahMataKuliah(Matkul15 mk) {
        if (jumlahMK < mataKuliahDiambil.length) {
            mataKuliahDiambil[jumlahMK] = mk;
            jumlahMK++;
        } else {
            System.out.println("Mata kuliah sudah penuh!");
        }
    }

    public int hitungTotalSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMK; i++) {
            total += mataKuliahDiambil[i].getSks();
        }
        return total;
    }

    public void tampilkanInfo() {
        System.out.println("===== DATA MAHASISWA =====");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("Daftar Mata Kuliah:");

        for (int i = 0; i < jumlahMK; i++) {
            mataKuliahDiambil[i].tampilkanInfo();
        }

        System.out.println("Total SKS   : " + hitungTotalSKS());
    }
}
