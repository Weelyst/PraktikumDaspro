import java.util.Scanner;

public class Percobaan3kafe04 {
    

    public static int hitungTotalHarga04(int pilihanMenu, int banyakItem){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        if (pilihanMenu >= 1 && pilihanMenu <= hargaItems.length) {
            int hargatotal = hargaItems[pilihanMenu - 1] * banyakItem;
            return hargatotal;
        } else {
            return 0; 
        }
    }

     public static int hitungTotalHargaDiskon04(int totalHargaAwal, String kodePromo) {
        double diskon = 0; 
        double jumlahDiskonRupiah = 0;
        
        System.out.println("\n[PROMO APLIKASI]");

         if (kodePromo.equals("DISKON50")) {
            diskon = 0.50; 
            jumlahDiskonRupiah = totalHargaAwal * diskon;
            System.out.println("Kode Promo: DISKON50 - Diskon 50% Diterapkan!");
            System.out.println("Diskon yang Anda dapatkan: Rp " + (int)jumlahDiskonRupiah);
        } else if (kodePromo.equals("DISKON30")) {
            diskon = 0.30; 
            jumlahDiskonRupiah = totalHargaAwal * diskon;
            System.out.println("Kode Promo: DISKON30 - Diskon 30% Diterapkan!");
            System.out.println("Diskon yang Anda dapatkan: Rp " + (int)jumlahDiskonRupiah);
        } else {
            System.out.println("Kode promo '" + kodePromo + "' tidak valid. Tidak ada pengurangan harga.");
        }
         int totalHargaAkhir = totalHargaAwal - (int)jumlahDiskonRupiah;
        return totalHargaAkhir;
    }
        

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember){
            System.out.println("Anda Adalah Member, Dapatkan diskon 10% untuk setiap Pembelian");
        }
        System.out.print("Status Promo: ");


        System.out.println("==== Menu Resto Kafe ====");
        System.out.println("1.KoTam     - Rp 15,000 ");
        System.out.println("2.Capucinno - Rp 20,000");
        System.out.println("3.Latte     - Rp 22,000");
        System.out.println("4.Teh Pull  - Rp 12,000");
        System.out.println("5.Rokar     - Rp 10,000");
        System.out.println("6.Migor     - Rp 18,000");
        System.out.println("=========================");
        System.out.println(" Silahkan Pilih Menu Yang di pesan ");
        
        int pilihanMenu = sc.nextInt();
        System.out.println("Masukkan Jumlah Dipesan");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga04(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan Rp" + totalHarga);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("~~~~~~~ ~~~~~~~");
       String namaPelanggan = "Arthur";
        boolean isMember = true;
        String kodePromoPelanggan = "DISKON50";
        
        Menu(namaPelanggan, isMember, kodePromoPelanggan); 
        
        System.out.println("~~~~~~~ ~~~~~~~");
        System.out.print("\n Masukkan nomor menu yang dipilih : ");
        int pilihanmenu = sc.nextInt();

        System.out.print(" Masukkan banyak item yang dibeli : ");
        int banyakitem = sc.nextInt();

        int totalHargaAwal = hitungTotalHarga04(pilihanmenu, banyakitem);
         System.out.println("~~~~~~~ ~~~~~~~-");
        System.out.println(" Total harga sebelum diskon: Rp " + totalHargaAwal);

        int totalHargaFinal = hitungTotalHargaDiskon04(totalHargaAwal, kodePromoPelanggan);
        
        System.out.println("\n Total harga yang harus dibayar : Rp " + totalHargaFinal);
        System.out.println("~~~~~~~ ~~~~~~~");
        
        sc.close();
    }
}

