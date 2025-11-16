package jobsheet9;

import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Program Pemesanan Kafe ===");
        System.out.print("Masukkan jumlah pesanan ");
        int jumlPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jumlPesanan];
        double[] hargaPesanan = new double[jumlPesanan];
        double totalBiaya = 0.0;

        for (int i = 0; i < jumlPesanan; i++) {
            System.out.println("\n--- Pesanan ke-" + (i + 1) + " ---");

            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan (Rp): ");
            hargaPesanan[i] = Double.parseDouble(sc.nextLine()); 
            totalBiaya += hargaPesanan[i];
        }
        
        System.out.println("\n========================================");
        System.out.println("         DAFTAR PESANAN ANDA            ");
        System.out.println("========================================");
        
        for (int i = 0; i < jumlPesanan; i++) {
            System.out.printf("%d. %-20s : Rp %.2f\n", (i + 1), namaPesanan[i], hargaPesanan[i]);
        }
        System.out.println("----------------------------------------");
        System.out.printf("Total Biaya Keseluruhan  : Rp %.2f\n", totalBiaya);
        System.out.println("========================================");

        sc.close();
    }
}