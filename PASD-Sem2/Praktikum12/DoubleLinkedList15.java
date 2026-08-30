public class DoubleLinkedList15 {
    Node15 head;
    Node15 tail;

    public DoubleLinkedList15() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa15 data) {
        Node15 newNode = new Node15(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa15 data) {
        Node15 newNode = new Node15(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void add(Mahasiswa15 data, int index) {
        if (index < 0) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node15 current = head;
        int i = 0;

        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Index melebihi panjang list");
        } else if (current.next == null) {
            addLast(data);
        } else {
            Node15 newNode = new Node15(current, data, current.next);
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node15 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

        public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            System.out.println("Data yang dihapus: ");
            head.data.tampil();

            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

            public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            System.out.println("Data yang dihapus: ");
            tail.data.tampil();

            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    public Node15 search(String nim) {
        Node15 current = head;

        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public void insertAfter(String keyNim, Mahasiswa15 data) {
        Node15 current = search(keyNim);

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }

        Node15 newNode = new Node15(current, data, current.next);

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }

        current.next = newNode;
    }

        public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node15 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }
}