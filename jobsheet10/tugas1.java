import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        int[][] dataSurvei = new int[jumlahResponden][jumlahPertanyaan];
        
        System.out.println("=== INPUT DATA SURVEI KEPUASAN PELANGGAN ===");
        System.out.println("Masukkan nilai kepuasan (Skala 1 - 5)");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                int nilaiInput;

                do {
                    System.out.print("  Pertanyaan " + (j + 1) + ": ");
                    nilaiInput = scanner.nextInt();
                    
                    if (nilaiInput < 1 || nilaiInput > 5) {
                        System.out.println("  [Error] Harap masukkan angka 1 s/d 5!");
                    }
                } while (nilaiInput < 1 || nilaiInput > 5);
                dataSurvei[i][j] = nilaiInput;
            }
            System.out.println();
        }
        double totalKeseluruhan = 0;
        int totalDataElement = jumlahResponden * jumlahPertanyaan;

        System.out.println("=== HASIL ANALISIS DATA ===");
        System.out.println("\n--- Rata-rata per Responden ---");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalPerResponden = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalPerResponden += dataSurvei[i][j];
            }
            totalKeseluruhan += totalPerResponden;
            
            double rataRata = totalPerResponden / jumlahPertanyaan;
            System.out.printf("Responden %d: %.2f%n", (i + 1), rataRata);
        }
        System.out.println("\n--- Rata-rata per Pertanyaan ---");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalPerPertanyaan += dataSurvei[i][j];
            }
            double rataRata = totalPerPertanyaan / jumlahResponden;
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), rataRata);
        }

        double rataRataTotal = totalKeseluruhan / totalDataElement;
        System.out.println("\n--- Kesimpulan ---");
        System.out.printf("Rata-rata Kepuasan Keseluruhan: %.2f / 5.00%n", rataRataTotal);
        
        scanner.close();
    }
}

    
