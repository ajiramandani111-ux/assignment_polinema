public class TugasMainArray15 {
    public static void main(String[] args) {
        BinaryTreeArray15 bta = new BinaryTreeArray15();

        // 4. Menguji method add() pada array secara berurutan
        bta.add(new Mahasiswa15("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa15("244160185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa15("244160221", "Badar", "B", 3.75));

        System.out.println("--- Hasil Traversal PreOrder Array ---");
        bta.traversePreOrder(0);
    }
}
