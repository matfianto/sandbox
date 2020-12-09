public class UbahData {
    public static void main(String[] args) {
        int daftar_bilangan[] = { 
            11, 22, 33, 44, 55 
        };

        tampilkanArray(daftar_bilangan, 5);
        naikkan5(daftar_bilangan, 5);
        tampilkanArray(daftar_bilangan, 5);
    }

    public static void naikkan5(int daftar[], int jum) {
        for (int i = 0; i < jum; i++)
            daftar[i] += 5;
    }

    public static void tampilkanArray(int daftar[], int jum) {
        for (int i = 0; i < jum; i++)
            System.out.print(daftar[i] + " ");

        System.out.println();
    }
}
