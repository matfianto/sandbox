public class Terbesar {
    public static void main(String[] args) {
        // Inisialisasi array
        int daftar[] = {2, 80, 5, 9, 5, 2, 9, 78, 83, 8};

        // Peroleh bilangan terbesar
        int terbesar = daftar[0];

        for (int i = 1; i < daftar.length; i++)
            if (terbesar < daftar[i])
                terbesar = daftar[i];

        // Tampilkan isi terbesar
        System.out.println("Bilangan terbesar di array: " + terbesar);
    }
}
