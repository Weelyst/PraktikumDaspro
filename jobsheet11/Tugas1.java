public class Tugas1 {
    public double hitungVolumeKubus(double sisi){
        return sisi*sisi*sisi;

    }
    public double hitungLuarPermukaankubus (double sisi){
        return 6*sisi*sisi;
    }
    public static void main(String[] args) {
        Tugas1 kubus = new Tugas1();
        double sisi = 5.0;

        double volume = kubus.hitungVolumeKubus(sisi);
        double luasPermukaan = kubus.hitungLuarPermukaankubus(sisi);

        System.out.println("Sisi Kubus: " + sisi);
        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }
    
}
