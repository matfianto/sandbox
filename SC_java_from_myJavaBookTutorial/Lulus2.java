import java.util.Scanner;

public class Lulus2  {
    public static void main(String[] args) {

        System.out.print("Nilai (0-100): ");
        Scanner kbd = new Scanner(System.in);
        int nilai = kbd.nextInt();
        kbd.close();

        String hasil;
        if (nilai >= 60)
            hasil = "Lulus";
        else
            hasil = "Tidak Lulus";

        System.out.println("Hasil: " + hasil);
    }
}
