public class AntrianLayanan15 {
    Mahasiswa[] data;
    int front, rear, size, max;

    public AntrianLayanan15(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = mhs;
            size++;
        }
    }

    public Mahasiswa dequeue() {
        Mahasiswa mhs = null;
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            mhs = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return mhs;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Daftar Antrian:");
            int i = front;
            while (i != rear) {
                data[i].tampilkanData();
                i = (i + 1) % max;
            }
            data[i].tampilkanData();
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public int getJumlahAntrian() {
        return size;
        }
        public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        }
    }
}