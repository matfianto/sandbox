import java.util.Scanner;

public class Piramida {
    public static void main(String[] args) {
        System.out.print("Tinggi: ");
        Scanner kbd = new Scanner(System.in);
        int tinggi = kbd.nextInt();
        kbd.close();

        for (int baris = 1; baris <= tinggi ; baris++) {
            // Buat sejumlah spasi
            for (int i = 1; i <= tinggi - baris; i++)
                System.out.print(' ');  // Karakter spasi

            // Tampilkan *
            for (int i = 1; i < 2 * baris; i++)
                System.out.print('*');

            // Pindah baris
            System.out.println();
        }
    }
}
