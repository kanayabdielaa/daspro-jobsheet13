import java.util.Scanner;

public class Tugas2 {

    static Scanner sc = new Scanner(System.in);
    static int jumlahMahasiswa;
    static int jumlahTugas;
    static String[] mahasiswa;
    static int[][] nilai;

    
    static void inputDataMahasiswa() {
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        sc.nextLine(); 

        mahasiswa = new String[jumlahMahasiswa];
        nilai = new int[jumlahMahasiswa][];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            mahasiswa[i] = sc.nextLine();
        }

        System.out.print("Masukkan jumlah tugas: ");
        jumlahTugas = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlahMahasiswa; i++) {
            nilai[i] = new int[jumlahTugas];
            System.out.println("Masukkan nilai untuk " + mahasiswa[i]);
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai tugas " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
            sc.nextLine(); 
        }
    }


    static void tampilkanNilaiMahasiswa() {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai " + mahasiswa[i] + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.println("Tugas " + (j + 1) + ": " + nilai[i][j]);
            }
            System.out.println();
        }
    }

    static void hariDenganNilaiTertinggi() {
        int[] maxNilai = new int[7];
        int[] hariMax = new int[7];

        for (int i = 0; i < 7; i++) {
            int max = -1;
            int index = -1;

            for (int j = 0; j < 5; j++) {
                if (nilai[j][i] > max) {
                    max = nilai[j][i];
                    index = j;
                }
            }

            maxNilai[i] = max;
            hariMax[i] = index;
        }

        int max = maxNilai[0];
        int hari = 0;
        for (int i = 1; i < 7; i++) {
            if (maxNilai[i] > max) {
                max = maxNilai[i];
                hari = i;
            }
        }

        System.out.println("Hari dengan nilai tertinggi dari keseluruhan mahasiswa adalah minggu ke-" + (hari + 1));
    }

    static void mahasiswaDenganNilaiTertinggi() {
        int[] maxNilai = new int[5];
        int[] mingguMax = new int[5];

        for (int i = 0; i < 5; i++) {
            int max = -1;
            int index = -1;

            for (int j = 0; j < 7; j++) {
                if (nilai[i][j] > max) {
                    max = nilai[i][j];
                    index = j;
                }
            }

            maxNilai[i] = max;
            mingguMax[i] = index;
        }

        int max = maxNilai[0];
        int index = 0;
        for (int i = 1; i < 5; i++) {
            if (maxNilai[i] > max) {
                max = maxNilai[i];
                index = i;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + mahasiswa[index] + " pada minggu ke-" + 
        (mingguMax[index] + 1) + " dengan nilai " + max);
    }

    public static void main(String[] args) {
        inputDataMahasiswa();
        tampilkanNilaiMahasiswa();
        hariDenganNilaiTertinggi();
        mahasiswaDenganNilaiTertinggi();
    }
}