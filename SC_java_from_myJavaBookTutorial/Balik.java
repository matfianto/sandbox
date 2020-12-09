import java.util.Scanner;

public class Balik {
    public static void main(String[] args) {
        System.out.print("Masukkan string: ");
        Scanner kbd = new Scanner(System.in);
        String st = kbd.nextLine();
        kbd.close();

        System.out.println("Kebalikan " + st + " adalah:");

        for (int i = st.length() - 1; i >= 0;  i--)
            System.out.print(st.charAt(i));

        System.out.println(); // Pindah baris
    }
}
