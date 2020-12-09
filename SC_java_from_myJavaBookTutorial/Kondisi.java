import java.util.Scanner;

public class Kondisi {
    public static void main(String[] args) {
        System.out.print("Bilangan bulat: ");
        Scanner kbd = new Scanner(System.in);
        int bilangan = kbd.nextInt();
        kbd.close();

        System.out.println("Bilangan : " + bilangan);
        System.out.println("adalah bilangan " + 
                           (bilangan % 2 == 0 ? "genap" : "ganjil"));
    }
}
