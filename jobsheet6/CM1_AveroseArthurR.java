package jobsheet6;
import java.util.Scanner;
public class CM1_AveroseArthurR {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String nama, nim, Huruf1, Huruf2, Status1, Status2, StatusSemester;
        int NilaiUts1, NilaiUts2, NilaiUas1, NilaiUas2, NilaiTugas1, NilaiTugas2;
        double NilaiAkhir1, NilaiAkhir2, RataRata;

        System.out.println("===== INPUT DATA MAHASISWA ====");
        System.out.print("nama :");
        nama = sc.nextLine();
        System.out.print("nim  :");
        nim = sc.nextLine();
        System.out.println("Mata Kuliah 1: Algoritma Pemograman");
        System.out.println("Masukkan Nilai UTS 1: ");
        NilaiUts1 = sc.nextInt();
        System.out.println("Masukkan Nilai UAS 1");
        NilaiUas1 = sc.nextInt();
        System.out.println("Masukkan Nilai Tugas 1");
        NilaiTugas1 = sc.nextInt();
        System.out.println("Mata Kuliah 2: Struktur Data");
        System.out.println("Masukkan Nilai UTS 2: ");
        NilaiUts2 = sc.nextInt();
        System.out.println("Masukkan Nilai UAS 2");
        NilaiUas2 = sc.nextInt();
        System.out.println("Masukkan Nilai Tugas 2");
        NilaiTugas2 = sc.nextInt();

        NilaiAkhir1 = (0.3 * NilaiUts1) + (0.35 * NilaiUas1) + (0.35 * NilaiTugas1);
        NilaiAkhir2 = (0.3 * NilaiUts2) + (0.35 * NilaiUas2) + (0.35 * NilaiTugas2);
        RataRata = (NilaiAkhir1 + NilaiAkhir2)/2;
 
        if (NilaiAkhir1 >= 81 && NilaiAkhir1 <= 100) {
            Huruf1 = "A";
            Status1 = "LULUS";
        } else if (NilaiAkhir1 >= 74 && NilaiAkhir1 <= 80) {
            Huruf1 = "B+";
            Status1 = "LULUS";
        } else if (NilaiAkhir1 >= 66 && NilaiAkhir1 <= 73) {
            Huruf1 = "B";
            Status1 = "LULUS";
        } else if (NilaiAkhir1 >= 61 && NilaiAkhir1 <= 65) {
            Huruf1 = "C+";
            Status1 = "LULUS";
        } else if (NilaiAkhir1 >= 51 && NilaiAkhir1 <= 60) {
            Huruf1 = "C";
            Status1 = "LULUS";
        } else if (NilaiAkhir1 >= 40 && NilaiAkhir1 <= 50) {
            Huruf1 = "D";
            Status1 = "TIDAK LULUS";
        } else if (NilaiAkhir1 >= 0 && NilaiAkhir1 <= 39) {
            Huruf1 = "E";
            Status1 = "TIDAK LULUS";
        } else {
            Huruf1 = "-";
            Status1 = "INVALID";
        }
        if (NilaiAkhir2 >= 81 && NilaiAkhir2 <= 100) {
            Huruf2 = "A";
            Status2 = "LULUS";
        } else if (NilaiAkhir2 >= 74 && NilaiAkhir2 <= 80) {
            Huruf2 = "B+";
            Status2 = "LULUS";
        } else if (NilaiAkhir2 >= 66 && NilaiAkhir2 <= 73) {
            Huruf2 = "B";
            Status2 = "LULUS";
        } else if (NilaiAkhir2 >= 61 && NilaiAkhir2 <= 65) {
            Huruf2 = "C+";
            Status2 = "LULUS";
        } else if (NilaiAkhir2 >= 51 && NilaiAkhir2 <= 60) {
            Huruf2 = "C";
            Status2 = "LULUS";
        } else if (NilaiAkhir2 >= 40 && NilaiAkhir2 <= 50) {
            Huruf2 = "D";
            Status2 = "TIDAK LULUS";
        } else if (NilaiAkhir2 >= 0 && NilaiAkhir2 <= 39) {
            Huruf2 = "E";
            Status2 = "TIDAK LULUS";
        } else {
            Huruf2 = "-";
            Status2 = "INVALID";
        }
      
        System.out.println("\n =====HASIL PENILAIAN AKADEMIK=====");
        System.out.println(nama);
        System.out.println(nim);
        System.out.println("Mata Kuliah \t\t UTS \t UAS \t Tugas \t Nilai Akhir \t Nilai Huruf \t Status");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println ("Algoritma pemograman\t "+ NilaiUts1  +"\t\t" + NilaiUas1 + "\t\t" + NilaiTugas1 + "\t" + NilaiAkhir1 + "\t\t" + Huruf1 + "\t" + Status1);
        System.out.println("Struktur Data\t\t "+ NilaiUts2 + "\t\t" + NilaiUas2 + "\t\t" + NilaiTugas2 + "\t" + NilaiAkhir2 + "\t\t" + Huruf2 + "\t" + Status2);

        if (NilaiAkhir1 >= 60 && NilaiAkhir2 >= 60) {
            StatusSemester = "LULUS";
        } else {
            StatusSemester = "TIDAK LULUS";
        }
        System.out.println("\nRata-rata Nilai Akhir\t: " + RataRata);
        System.out.println("Status Semester\t\t: " + StatusSemester);

}
}
