public class BinaryTree15 {
    Node15 root;

    public BinaryTree15() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // Method untuk menambah Node baru secara Iteratif berdasarkan IPK
    public void add(Mahasiswa15 mahasiswa) {
        Node15 newNode = new Node15(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node15 current = root;
            while (true) {
                Node15 parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Method mencari data berdasarkan IPK
    public boolean find(double ipk) {
        boolean result = false;
        Node15 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    // Traversal: PreOrder
    public void traversePreOrder(Node15 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // Traversal: InOrder
    public void traverseInOrder(Node15 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    // Traversal: PostOrder
    public void traversePostOrder(Node15 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    // Method pembantu menghapus Node dengan 2 anak
    public Node15 getSuccessor(Node15 del) {
        Node15 successor = del.right;
        Node15 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    // Method menghapus Node berdasarkan IPK
    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node15 parent = root;
        Node15 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            // Kasus 1: Node daun (Leaf Node)
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            }
            // Kasus 2a: Hanya punya anak kanan
            else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            }
            // Kasus 2b: Hanya punya anak kiri
            else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            }
            // Kasus 3: Memiliki 2 anak
            else {
                Node15 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    // Method utama yang dipanggil di Main
    public void addRekursif(Mahasiswa15 mahasiswa) {
        root = addRekursifHelper(root, mahasiswa);
    }

    // Method helper untuk proses rekursif
    private Node15 addRekursifHelper(Node15 current, Mahasiswa15 mahasiswa) {
        if (current == null) {
            return new Node15(mahasiswa);
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursifHelper(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursifHelper(current.right, mahasiswa);
        }
        return current;
    }
    // Menampilkan data mahasiswa dengan IPK terkecil
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong.");
            return;
        }
        Node15 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.print("Mahasiswa IPK Terkecil -> ");
        current.mahasiswa.tampilInformasi();
    }

    // Menampilkan data mahasiswa dengan IPK terbesar
    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong.");
            return;
        }
        Node15 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.print("Mahasiswa IPK Terbesar -> ");
        current.mahasiswa.tampilInformasi();
    }
    // Method utama
public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
    System.out.println("Daftar Mahasiswa dengan IPK di atas " + ipkBatas + ":");
    tampilIPKdiAtasHelper(root, ipkBatas);
}

// Method helper untuk menelusuri tree
    private void tampilIPKdiAtasHelper(Node15 node, double ipkBatas) {
        if (node != null) {
            tampilIPKdiAtasHelper(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilIPKdiAtasHelper(node.right, ipkBatas);
        }
    }
}
