public class Lebar {
    public static void main(String[] args) {
        String st = "123ABCD";
        int bil = 98;

        System.out.printf("%s\n", st);
        System.out.printf("%9s\n", st);
        System.out.printf("%10s\n", st);

        System.out.printf("%d\n", bil);
        System.out.printf("%4d\n", bil);
        System.out.printf("%5d\n", bil);
        System.out.printf("%4d%5d\n", bil, bil);
        System.out.printf("%d%d\n", bil, bil);
    }
}
