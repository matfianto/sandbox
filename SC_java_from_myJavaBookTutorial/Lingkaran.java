import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        System.out.print("Masukkan nilai jari-jari lingkaran: ");
        Scanner kbd = new Scanner(System.in);
        double radius = kbd.nextDouble();
        kbd.close();

        double luas = 3.14 * radius * radius;
        double keliling = 2 * 3.14 * radius;

        System.out.println("Luas lingkaran = " + luas);
        System.out.println("Keliling = " + keliling);
    }
}
