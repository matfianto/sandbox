import java.util.Scanner;
public class tes2 {
    public static void main(String[] args) {
        // Menghitung Rata-Rata nilai
        // Menggunakan Scanner untuk membaca input dari keyboard
        Scanner sa = new Scanner(System.in);
    
        System.out.print("Nilai Biologi : ");
        // Membaca input berupa angka (Integer)
        int a = sa.nextInt();
    
        System.out.print("Nilai Fisika : ");
        // Membaca input berupa angka (Integer)
        int b = sa.nextInt();
    
        System.out.print("Nilai Kimia : ");
        // Membaca input berupa angka (Integer)
        int c = sa.nextInt();
    
        // Menghitung rata-rata nilai, menggunakan type double untuk menampung nilai pecahan
        double jawab = (a + b + c) / 3.0;
        System.out.println("Rata-Rata : " + jawab);
    }
}