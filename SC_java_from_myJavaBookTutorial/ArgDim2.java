public class ArgDim2 {
    public static void main(String[] args) {
        int matriks[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        tambah2(matriks, 2, 3);

        // Tampilkan isi elemen array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matriks[i][j] + " ");

            System.out.println(); // Pindah baris
        }
    }

    public static void tambah2(int mat[][], int baris, int kolom) {
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                mat[i][j] += 2;
    }
}
