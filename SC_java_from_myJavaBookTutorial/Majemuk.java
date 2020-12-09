import java.util.Scanner;

public class Majemuk  {
    public static void main(String[] args) {

        System.out.print("Bilangan bulat: ");
        Scanner kbd = new Scanner(System.in);
        int bilangan = kbd.nextInt();
        kbd.close();

        if (bilangan % 2 == 1) {
            System.out.println("Bilangan " + bilangan);
            System.out.println("adalah bilangan ganjil");
        }
        else {
            System.out.println("Bilangan " + bilangan);
            System.out.println("adalah bilangan genap");
        }
    }
}
