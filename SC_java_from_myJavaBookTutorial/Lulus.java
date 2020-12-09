import java.util.Scanner;

public class Lulus  {
    public static void main(String[] args) {

        System.out.print("Nilai (0-100): ");
        Scanner kbd = new Scanner(System.in);
        int nilai = kbd.nextInt();
        kbd.close();

        String hasil = "Tidak Lulus";
        if (nilai >= 60)
            hasil = "Lulus";

        System.out.println("Hasil: " + hasil);
    }
}
