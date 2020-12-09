import java.util.Scanner;

public class Satusdn  {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        // 10. penggunaan while
        System.out.println("\nPenggunaan while\nkalimat / kata yang ingin diulang = ");
        String kat = kbd.nextLine();
        System.out.print("jumlah banyak pengulangan = ");
        int n = kbd.nextInt();
        int s = 1;
        while (s <= n) {
            System.out.println(s+"."+" "+kat);
            s++;
        }

        // 11. penggunaan do .. while
        int bilangan = 0;
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

        //12. penggunaan for        
        System.out.print("\n12. Pengunaan For\nmasukkan sebuah bilangan bulat = ");
        Scanner = kbd.nextInt();
        for (int a = 1; a <= n; a++) {
            System.out.println(a);
        }

        // array
        int hasila[] = new int[5]; // deklarasi array dengan 5 elemen
        // isi setiap elemen array
        hasila[0] = 70;
        hasila[1] = 80;
        hasila[2] = 75;
        hasila[3] = 90;
        hasila[4] = 65;
        // tampilkan isi array
        for (int k = 0; k < 5; k++)
            System.out.println(hasil[k]);
        // tampilkan perolehan jumlah array
        System.out.println("Jumlah total array = "+hasila.length);
    }
}
