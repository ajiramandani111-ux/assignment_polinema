public class TugasMainLL15 {
    public static void main(String[] args) {
        BinaryTree15 tree = new BinaryTree15();

        // 1. Menguji addRekursif
        tree.addRekursif(new Mahasiswa15("24416001", "Ahmad", "A", 3.25));
        tree.addRekursif(new Mahasiswa15("24416002", "Budi", "B", 3.88));
        tree.addRekursif(new Mahasiswa15("24416003", "Chandra", "A", 3.10));
        tree.addRekursif(new Mahasiswa15("24416004", "Dika", "C", 3.65));

        System.out.println("--- Hasil Traversal InOrder ---");
        tree.traverseInOrder(tree.root);
        System.out.println();

        // 2. Menguji cariMinIPK dan cariMaxIPK
        tree.cariMinIPK();
        tree.cariMaxIPK();
        System.out.println();

        // 3. Menguji tampilMahasiswaIPKdiAtas
        tree.tampilMahasiswaIPKdiAtas(3.50);
    }
}
