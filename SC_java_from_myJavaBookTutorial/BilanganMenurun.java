import java.util.Arrays;
import java.util.Collections;

public class BilanganMenurun {
    public static void main(String[] args) {
        Integer bilangan[] = {
            2, 6, 90, 21, 33, 19
        };

        int jumData = bilangan.length;
 
        // Tampilkan data
        System.out.println("Data sebelum diurutkan:");
        for (int i = 0; i < jumData; i++)
            System.out.println(bilangan[i]);

        // Lakukan pengurutan data
        Arrays.sort(bilangan, Collections.reverseOrder());

        // Tampilkan data
        System.out.println();
        System.out.println("Data setelah diurutkan:");
        for (int i = 0; i < jumData; i++)
            System.out.println(bilangan[i]);
    }
}
