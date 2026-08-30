class Surat {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // S / I
    int durasi;

    Surat(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}