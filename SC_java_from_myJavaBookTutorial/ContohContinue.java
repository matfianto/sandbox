public class ContohContinue {
    public static void main(String[] args) {
        int i = 0;

        // Contoh dengan while
        while (i < 5) {
            if (i == 3) {
                i++;
                continue;
            }

            System.out.println(i);
            i++;
        }

        System.out.println("-------------------");

        // contoh dengan for
        for (i = 0; i < 5; i++) {
            if (i == 3)
                continue;

            System.out.println(i);
        }
    }
}
