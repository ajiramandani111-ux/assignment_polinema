public class BukuMain15 {
    public static void main(String[] args) {

        BinarySearchTreeBuku15 bst = new BinarySearchTreeBuku15();

        bst.add(new Buku15("BK105", "Struktur Data", "Andi", 2020));
        bst.add(new Buku15("BK102", "Algoritma Dasar", "Budi", 2019));
        bst.add(new Buku15("BK108", "Basis Data", "Citra", 2021));
        bst.add(new Buku15("BK101", "Pemrograman Java", "Dewi", 2018));
        bst.add(new Buku15("BK104", "Sistem Operasi", "Eka", 2022));
        bst.add(new Buku15("BK107", "Jaringan Komputer", "Fajar", 2017));

        System.out.println("=== DATA BUKU IN ORDER ===");
        bst.traverseInOrder(bst.root);

        System.out.println("=== DATA BUKU PRE ORDER ===");
        bst.traversePreOrder(bst.root);

        System.out.println("Pencarian BK104 : "
                + (bst.find("BK104") ? "Ditemukan" : "Tidak Ditemukan"));

        System.out.println("Pencarian BK110 : "
                + (bst.find("BK110") ? "Ditemukan" : "Tidak Ditemukan"));

        System.out.println("Jumlah Buku : "
                + bst.hitungJumlahBuku(bst.root));

        System.out.println("\n=== BUKU TERTUA ===");
        Buku15 tertua = bst.cariBukuTertua(bst.root);
        tertua.tampilInformasi();
    }
}