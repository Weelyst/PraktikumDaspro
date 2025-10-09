import java.util.Scanner;
public class ifCetakKRS04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak Krs Siakad ---");
        System.out.println("Apakah UKT sudah lunas? (true/false):");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran Terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta Tanda tangan DPA");
        }
        else{
            System.out.println("Registrasi Ditolak, Silahkan lakukan pembayaran terlebih dahulu ya");
        }

        
    }
}
