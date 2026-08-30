package minggu5;

public class Sum {

    int[] keuntungan;

    Sum(int elemen) {
        keuntungan = new int[elemen];
    }

    int totalBF() {
        int total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total += keuntungan[i];
        }
        return total;
    }

    int totalDC(int l, int r) {
        if (l == r) {
            return keuntungan[l];
        } else {
            int mid = (l + r) / 2;
            int lsum = totalDC(l, mid);
            int rsum = totalDC(mid + 1, r);
            return lsum + rsum;
        }
    }
}