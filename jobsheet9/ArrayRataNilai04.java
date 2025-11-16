package jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai04 {
    public static void main(String[] args) {
        int[] nilaiMhs = new int [10];
        Scanner sc = new Scanner(System.in);
        double totallus = 0;
        double totalnolus = 0;
        double total = 0;
        double rata2_lus;
        double rata2_nolus;
        double rata2 = 0;
        int totlulus = 0;
        int totnolulus = 0;

        for (int i = 0; i <nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) +" : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70){
                totallus += nilaiMhs[i];
                totlulus++;
            } else {
                totalnolus += nilaiMhs[i];
                totnolulus++;

            }
        }
        rata2_lus = (totallus / totlulus);
        rata2_nolus = (totalnolus / totnolulus);

        System.out.println("jumlah lulus = " + totlulus);
        System.out.println(rata2_lus);
    
        System.out.println("jumlah tidak lulus = " + totnolulus);
        System.out.println(rata2_nolus);

        rata2 = ((totallus + totalnolus) / nilaiMhs.length);
        System.out.println("Rata-rata nilai = " + rata2);
    }

    
}
