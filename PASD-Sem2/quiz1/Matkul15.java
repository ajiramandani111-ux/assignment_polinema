public class Matkul15 {

    String kodeMK;
    String namaMK;
    int sks;

    public Matkul15(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;

        if (sks >= 2) {
            this.sks = sks;
        } else {
            this.sks = 2;
        }
    }

    public void tampilkanInfo() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK : " + namaMK);
        System.out.println("SKS     : " + sks);
        System.out.println("----------------------");
    }

    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }

    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2!");
        }
    }

    public int getSks() {
        return sks;
    }
}
