package jobsheet11;

public class Kafe04 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
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
    }
    public static void main(String[] args) {
        Menu("Andi", true, "NONPROMO" );
    }
}
