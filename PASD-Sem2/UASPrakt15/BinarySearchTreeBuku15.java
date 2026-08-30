public class BinarySearchTreeBuku15 {

    NodeBuku15 root;

    public BinarySearchTreeBuku15() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Buku15 data) {
        NodeBuku15 newNode = new NodeBuku15(data);

        if (isEmpty()) {
            root = newNode;
        } else {
            NodeBuku15 current = root;

            while (true) {
                if (data.kodeBuku.compareTo(current.data.kodeBuku) < 0) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                }
            }
        }
    }

    public boolean find(String kodeBuku) {
        NodeBuku15 current = root;

        while (current != null) {
            int hasil = kodeBuku.compareTo(current.data.kodeBuku);

            if (hasil == 0) {
                return true;
            } else if (hasil < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public void traverseInOrder(NodeBuku15 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(NodeBuku15 node) {
        if (node != null) {
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public int hitungJumlahBuku(NodeBuku15 node) {
        if (node == null) {
            return 0;
        }

        return 1 + hitungJumlahBuku(node.left)
                 + hitungJumlahBuku(node.right);
    }

    public Buku15 cariBukuTertua(NodeBuku15 node) {
        if (node == null) {
            return null;
        }

        Buku15 tertua = node.data;

        Buku15 kiri = cariBukuTertua(node.left);
        Buku15 kanan = cariBukuTertua(node.right);

        if (kiri != null && kiri.tahunTerbit < tertua.tahunTerbit) {
            tertua = kiri;
        }

        if (kanan != null && kanan.tahunTerbit < tertua.tahunTerbit) {
            tertua = kanan;
        }

        return tertua;
    }
}