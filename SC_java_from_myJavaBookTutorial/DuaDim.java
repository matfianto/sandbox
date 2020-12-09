public class DuaDim {
    public static void main(String[] args) {
        int matriks[][] = new int [2][3];

        // Isi setiap elemen array
        matriks[0][0] = 1;
        matriks[0][1] = 2;
        matriks[0][2] = 3;

        matriks[1][0] = 4;
        matriks[1][1] = 5;
        matriks[1][2] = 6;

        // Tampilkan isi elemen array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matriks[i][j] + " ");

            System.out.println(); // Pindah baris
        }
    }
}
