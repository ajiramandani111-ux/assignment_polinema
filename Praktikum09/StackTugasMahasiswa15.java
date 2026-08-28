class StackTugasMahasiswa15 {
    Mahasiswa15[] stack;
    int size;
    int top;
    int jumlahTugas() {
    return top + 1;
    }

    StackTugasMahasiswa15(int size) {
        this.size = size;
        stack = new Mahasiswa15[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Mahasiswa15 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
            System.out.println("Tugas " + mhs.nama + " berhasil dikumpulkan");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    Mahasiswa15 pop() {
        if (!isEmpty()) {
            Mahasiswa15 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    Mahasiswa15 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    void print() {
        System.out.println("Nama\tNIM\tKelas");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
    }
        Mahasiswa15 lihatBawah() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            return null;
        }
    }
    String konversiDesimalKeBiner(int nilai) {
    StackKonversi15 stack = new StackKonversi15(32);
    String biner = "";

    while (nilai > 0) {
        int sisa = nilai % 2;
        stack.push(sisa);
        nilai = nilai / 2;
    }

    while (!stack.isEmpty()) {
        biner += stack.pop();
    }

    return biner;
}
}