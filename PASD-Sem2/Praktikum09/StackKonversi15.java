class StackKonversi15 {
    int[] stack;
    int top;
    int size;

    StackKonversi15(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int data) {
        if (!isFull()) {
            top++;
            stack[top] = data;
        }
    }

    int pop() {
        if (!isEmpty()) {
            int data = stack[top];
            top--;
            return data;
        }
        return -1;
    }
}