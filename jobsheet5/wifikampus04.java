import java.util.Scanner;

public class wifikampus04{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sistem Pengecekan Akses WiFi Kampus");
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lainnya): ");
        String jenisPengguna = input.nextLine();
        jenisPengguna = jenisPengguna.toLowerCase();
    
        if (jenisPengguna.equals("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
            
        } else if (jenisPengguna.equals("mahasiswa")) {
            
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = input.nextInt();
            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
        input.close();
    }
}