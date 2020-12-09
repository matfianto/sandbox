public class RataRata {
    public static void main(String[] args) {
        // Inisialisasi array
        int hasil[] = {70, 80, 75, 90, 65, 66, 72, 81, 82};

        // Peroleh jumlah data
        int jum_data = hasil.length;

        // Hitung jumlah untuk semua nilai di hasil
        int total = 0;
        for (int i = 0; i < jum_data; i++)
            total += hasil[i];

        // Hitung nilai rata-rata
        double rerata = (double) total / jum_data;

        // Tampilkan nilai rata-rata
        System.out.println("Rata-rata = " + rerata);
    }
}
