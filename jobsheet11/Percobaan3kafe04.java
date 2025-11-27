import java.util.Scanner;

public class Percobaan3kafe04 {
    

    public static int hitungTotalHarga04(int pilihanMenu, int banyakItem){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember){
            System.out.println("Anda Adalah Member, Dapatkan diskon 10% untuk setiap Pembelian");
        }
        System.out.print("Status Promo: ");

        
    if (kodePromo.equals("DISKON50")){
        System.out.println("Anda mendapatkan diskon 50%! 🎉");
    } else if (kodePromo.equals("DISKON30")){
        System.out.println("Anda mendapatkan diskon 30%! 🥳");
    } else {
        System.out.println("Kode promo invalid atau tidak digunakan.");
    }



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
        Menu("Andi", true, "NONPROMO" );
    }
}

