public class LokalDanGlobal {
    static int z = 99;

    public static void main(String[] args) {
        int x = 77; // Lokal

        System.out.println("Di main():");
        System.out.println("x = " + x);
        System.out.println("z = " + z);

        System.out.println("Di info():");
        info();

        System.out.println("Di main():");
        System.out.println("x = " + x);
        System.out.println("z = " + z);
    }

    public static void info() {
        int x = 88; // Lokal

        System.out.println("x = " + x);
        System.out.println("z = " + z);
   }
}
