package jobsheet8;
import java.util.Scanner;
public class NilaiKelompok04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println();

         int  nilai;
        float totalnilai;
        float ratanilai;

        int i = 1;
        while (i <= 6){
            System.out.println("kelompok " + i);

            totalnilai = 0;
            for (int j = 1; j<=5; j++){
                System.out.print(" Nilai dari kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalnilai += nilai;
                
            }
            ratanilai = totalnilai / 5;
              System.out.print("kelompok " + i);
            System.out.println(": nilai rata-rata = " + ratanilai);
            i++;
            
        }
        
        //sudah termodifikasi lupa committ
    }
    
}
