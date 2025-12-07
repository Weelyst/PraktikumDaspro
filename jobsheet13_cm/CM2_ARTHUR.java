
package jobsheet13_cm;


import java.util.Scanner;

public class CM2_ARTHUR {


    static String[][] data = new String[250][6];
    static int jumlahData = 0;

    static Scanner gh = new Scanner(System.in);

       public static void main(String[] args) {
        int pilih;

        do {
            System.out.println("\n=== Sistem Pendaftaran Skripsi ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Semua");
            System.out.println("3. Cari Berdasarkan Dosen");
            System.out.println("4. Hitung Jumlah per Gelombang");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");

            pilih = gh.nextInt();
            System.out.println();

            switch (pilih) {
                case 1 -> tambahData();
                case 2 -> tampilSemua();
                case 3 -> cariDosen();
                case 4 -> hitungGelombang();
                case 5 -> System.out.println("Terima Kasih ! :D");
                default -> System.out.println("Invalid");
            }

        } while (pilih != 5);
    }


    static void tambahData() {
        gh.nextLine();

        System.out.print("Nama Mahasiswa: ");
        String nama = gh.nextLine();

        System.out.print("NIM: ");
        String nim = gh.nextLine();

        System.out.print("Judul Skripsi: ");
        String judul = gh.nextLine();

        System.out.print("Dosen Pembimbing: ");
        String dosen = gh.nextLine();

        int gel;
        do {
            System.out.print("Gelombang (1/2/3): ");
            gel = gh.nextInt();
            if (gel < 1 || gel > 3) System.out.println("Gelombang 1 - 3!");
        } while (gel < 1 || gel > 3);

        int log;
        do {
            System.out.print("Total log bimbingan (minimal 8): ");
            log = gh.nextInt();
            if (log < 8) System.out.println("Minimal 8!");
        } while (log < 8);

        // simpan
        data[jumlahData][0] = nama;
        data[jumlahData][1] = nim;
        data[jumlahData][2] = judul;
        data[jumlahData][3] = dosen;
        data[jumlahData][4] =  "" + gel;
        data[jumlahData][5] = "" + log;

        jumlahData++;
        System.out.println("Data tersimpan. Total pendaftar: " + jumlahData);
    }


    // Tampilkan Semua Data
    static void tampilSemua() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        System.out.printf("%-3s %-15s %-12s %-30s %-18s %-10s %-5s\n",
                "No", "Nama", "NIM", "Judul Skripsi", "Dosen", "Gel", "Log");

        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%-3d %-15s %-12s %-30s %-18s %-10s %-5s\n",
                    (i + 1),
                    data[i][0],
                    data[i][1],
                    data[i][2],
                    data[i][3],
                    data[i][4],
                    data[i][5]
            );
        }
    }

    // Cari Berdasarkan Dosen
    static void cariDosen() {
        gh.nextLine();

        System.out.print("Masukkan nama dosen: ");
        String cari = gh.nextLine();

        boolean ada = false;

        for (int i = 0; i < jumlahData; i++) {
            if (data[i][3].equalsIgnoreCase(cari)) {
                ada = true;
                System.out.println("\nNama Mahasiswa: " + data[i][0]);
                System.out.println("NIM: " + data[i][1]);
                System.out.println("Judul Skripsi: " + data[i][2]);
                System.out.println("Gelombang: " + data[i][4]);
                System.out.println("Log: " + data[i][5]);
            }
        }

        if (!ada) {
            System.out.println("Tidak ada mahasiswa dengan dosen tersebut.");
        }
    }

    // Hitung Gelombang
    static void hitungGelombang() {
        int ge1 = 0, G2 = 0, ge3 = 0;

        for (int i = 0; i < jumlahData; i++) {
            int g = Integer.parseInt(data[i][4]);
            if (g == 1) ge1++;
            else if (g == 2) G2++;
            else ge3++;
        }

        System.out.println("Gelombang 1: " + ge1);
        System.out.println("Gelombang 2: " + G2);
        System.out.println("Gelombang 3: " + ge3);
        System.out.println("Total pendaftar: " + jumlahData);
    }

}
