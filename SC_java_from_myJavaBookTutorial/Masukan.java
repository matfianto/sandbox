import java.util.Scanner;

public class Masukan {
    public static void main(String[] args) {
        int daftar[] = {0, 0, 0, 0, 0, 0};
        int jum = daftar.length;

        jum = pemasukanData(daftar, jum);
        System.out.println("jum = " + jum);
        System.out.print("Data: ");
        tampil(daftar, jum);
    }

    public static int pemasukanData(int bil[], int jumlah) {
        // Nilai balik menyatakan jumlah data

 
        Scanner kbd = new Scanner(System.in);
        System.out.print("Cacah data: "); 
        int cacah = kbd.nextInt();

        if (cacah > jumlah) {
            System.out.println("Cacah data maksimal = " +
                               jumlah);
            System.exit(1); // Akhiri program
        }

        for (int i = 0; i < cacah; i++) {
            System.out.print("Data ke- " + (i + 1) + ": ");
            bil[i] = kbd.nextInt();
        }

        kbd.close();
        return cacah;
    }

    public static void tampil(int bil[], int jumlah) {
        for (int i = 0; i < jumlah; i++)
            System.out.print(bil[i] + " ");

        System.out.println();
    }
}
