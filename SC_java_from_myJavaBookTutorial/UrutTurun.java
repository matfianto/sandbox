import java.util.Arrays;
import java.util.Collections;

public class UrutTurun {
    public static void main(String[] args) {
        String kota[] = {
            "Paris", "Solo", "Denpasar", "Makassar",
            "Amstredam", "Wina", "Bangkok", "New Delhi"
        };

        int jumData = kota.length;
 
        // Tampilkan data
        System.out.println("Data sebelum diurutkan:");
        for (int i = 0; i < jumData; i++)
            System.out.println(kota[i]);

        // Lakukan pengurutan data
        Arrays.sort(kota, Collections.reverseOrder());

        // Tampilkan data
        System.out.println();
        System.out.println("Data setelah diurutkan:");
        for (int i = 0; i < jumData; i++)
            System.out.println(kota[i]);
    }
}
