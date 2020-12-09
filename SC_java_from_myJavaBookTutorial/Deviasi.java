public class Deviasi {
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

        // Hitung standar deviasi
        double sigma = 0;
        for (int i = 0; i < jum_data; i++)
            sigma += (hasil[i] - rerata) * (hasil[i] - rerata);

        double ds = Math.sqrt(sigma/(jum_data - 1));
 
        // Tampilkan nilai deviasi standar
        System.out.println("Deviasi standar = " + ds);
    }
}
