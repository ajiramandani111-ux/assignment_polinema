public class MainMahasiswa15 {

    public static void main(String[] args) {

        Matkul15 mk1 = new Matkul15("SI201", "Basis Data", 3);
        Matkul15 mk2 = new Matkul15("SI202", "PASD", 3);
        Matkul15 mk3 = new Matkul15("SI203", "ASD", 3);

        Mahasiswa15 mhs = new Mahasiswa15("254107060054", "Aji", 2025, 5);

        mhs.tambahMataKuliah(mk1);
        mhs.tambahMataKuliah(mk2);
        mhs.tambahMataKuliah(mk3);

        mhs.tampilkanInfo();
    }
}
