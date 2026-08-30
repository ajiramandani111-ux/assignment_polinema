package minggu5;

import java.util.Scanner;

public class MainFaktorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        Faktorial fk = new Faktorial();

        System.out.println("Faktorial BF: " + fk.faktorialBF(n));
        System.out.println("Faktorial DC: " + fk.faktorialDC(n));
    }
}