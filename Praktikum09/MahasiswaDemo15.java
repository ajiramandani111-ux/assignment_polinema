import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackTugasMahasiswa15 stack = new StackTugasMahasiswa15(5);

        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    Mahasiswa15 mhs = new Mahasiswa15(nim, nama, kelas);
                    stack.push(mhs);
                    break;

               case 2:
                    Mahasiswa15 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);

                        System.out.println("Nilai Tugas " + dinilai.nama + " adalah " + nilai);

                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai dalam biner: " + biner);
                    }
                    break;

                case 3:
                    Mahasiswa15 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa15 bawah = stack.lihatBawah();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                    } else {
                        System.out.println("Stack kosong");
                    }
                    break;
                
                case 6:
                System.out.println("Jumlah tugas saat ini: " + stack.jumlahTugas());
                break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih >= 1 && pilih <= 4);
    }
}