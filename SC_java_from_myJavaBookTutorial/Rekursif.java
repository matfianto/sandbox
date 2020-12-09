public class Rekursif {
    public static void main(String[] args) {
        long hasil = faktorial(4);
        System.out.println("4! = " + hasil);
        System.out.println("5! = " + faktorial(5));
    }

    public static long faktorial(long n) {
        if (n == 0)
            return (1);
        else
            return (n * faktorial(n-1));
    }
}
