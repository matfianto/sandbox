public class ArgArray {
    public static void main(String[] args) {
        int daftarBilangan[] = {
            11, 22, 33, 44, 55 
        };

        tampilkanArray(daftarBilangan, 5);
    }

    public static void tampilkanArray(int daftar[], int jum) {
        for (int i = 0; i < jum; i++)
            System.out.println(daftar[i]);
    }
}
