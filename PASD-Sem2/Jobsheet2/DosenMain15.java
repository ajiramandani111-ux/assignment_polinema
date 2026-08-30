public class DosenMain15 {
    public static void main(String[] args) {

        Dosen15 d1 = new Dosen15();
        d1.idDosen = "D001";
        d1.nama = "Dr. Andi";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Pemrograman";

        d1.tampilInformasi();
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2025) + " tahun");

        System.out.println("====================");

        Dosen15 d2 = new Dosen15(
                "D002",
                "Prof. Budi",
                true,
                2010,
                "Basis Data"
        );

        d2.tampilInformasi();
        d2.ubahKeahlian("Artificial Intelligence");
        d2.setStatusAktif(false);

        System.out.println("Setelah perubahan:");
        d2.tampilInformasi();
        System.out.println("Masa Kerja: " + d2.hitungMasaKerja(2025) + " tahun");
    }
}
