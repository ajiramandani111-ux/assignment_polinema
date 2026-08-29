public class Mahasiswa15 {
    String nim;
    String nama;
    String prodi;

    public Mahasiswa15(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampil() {
        System.out.println(nim + " | " + nama + " | " + prodi);
    }
}