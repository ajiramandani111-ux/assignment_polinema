class StackSurat {
    Surat[] stack;
    int top;
    int size;

    StackSurat(int size) {
        this.size = size;
        stack = new Surat[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Surat s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
            System.out.println("Surat berhasil ditambahkan");
        } else {
            System.out.println("Stack penuh");
        }
    }

    Surat pop() {
        if (!isEmpty()) {
            Surat s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    Surat peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return null;
    }

    boolean cari(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}