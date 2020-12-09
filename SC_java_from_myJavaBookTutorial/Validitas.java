import java.util.Scanner;

public class Validitas {
    public static void main(String[] args) {

        int bilangan = 0;
        Scanner kbd = new Scanner(System.in);

        boolean ok;
        do {
            ok = true;

            System.out.print("\nPengunaan Do .. While\nmasukkan sebuah bilangan bulat = ");
            try {
                bilangan = kbd.nextInt();
            }
            catch (Exception e) {
                System.out.println("pemasukan data salah!");
                ok = false;
                kbd.nextLine(); // Buang data tersisa
            }
        } while (!ok);


        System.out.println("Oke. Anda memasukkan bilangan " +bilangan);
        kbd.close();       
    }
}
