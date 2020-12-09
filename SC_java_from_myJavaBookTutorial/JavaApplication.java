import java.util.*;

public class JavaApplication {
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        String nama;
        int panjang, lebar, Luas, Keliling;
        System.out.println("Masukan namamu = ");
        nama = nilai.nextLine();
        System.out.println("Masukan panjang = ");
        panjang = nilai.nextInt();
        System.out.println("Masukan lebar = ");
        lebar = nilai.nextInt();
        System.out.println("Nama anda = "+nama);
        Keliling = 2 * panjang + 2 * lebar;
        System.out.println("Keliling Persegi Panjang = " + Keliling);
        Luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + Luas);
        nilai.close();
    }
}