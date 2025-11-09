package jobsheet8;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limitN ;
        String Ntetap = "";
        int jkdrt = 0;
        
        System.out.print("jumlah n : ");
        limitN = sc.nextInt();

        for (int n = 1; n <= limitN; n++){
            int angkskrng = n * n;
            jkdrt  += angkskrng;

            if (n == 1){
                Ntetap = String.valueOf(angkskrng);
            }else{
                Ntetap += " + " + angkskrng;
            }
            System.out.println("n = " + n + " -> jumlah kuadrat " + Ntetap + " = " + jkdrt);
        }
    }
}
