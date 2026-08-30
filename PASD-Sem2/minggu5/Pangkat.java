package minggu5;

public class Pangkat {

    int nilai;
    int pangkat;

    Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil = hasil * nilai;
        }
        return hasil;
    }

    int pangkatDC(int n, int p) {
        if (p == 1) {
            return n;
        } else {
            if (p % 2 == 1) {
                return pangkatDC(n, p/2) * pangkatDC(n, p/2) * n;
            } else {
                return pangkatDC(n, p/2) * pangkatDC(n, p/2);
            }
        }
    }
}