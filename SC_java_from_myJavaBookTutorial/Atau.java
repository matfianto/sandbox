import java.util.Scanner;

public class Atau  {
    public static void main(String[] args) {
        System.out.print("Masukkan 1, 2, atau 3: ");
        Scanner kbd = new Scanner(System.in);
        int pilihan = kbd.nextInt();
        kbd.close();

        if (pilihan >= 1 || pilihan <= 3)
            System.out.println("Trims. Anda memilih " + pilihan);
        else
        {
            System.out.println("Mestinya Anda memilih 1, 2, atau 3, ");
            System.out.println("tetapi Anda malah memilih " +
                               pilihan);
        }
    }
}
