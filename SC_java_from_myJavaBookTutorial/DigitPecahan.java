public class DigitPecahan {
    public static void main(String[] args) {
        double bil = 345.6789;

        System.out.println("Tanpa apa-apa  : " + bil);
        System.out.printf("0 digit pecahan: %.0f\n", bil);
        System.out.printf("1 digit pecahan: %.1f\n", bil);
        System.out.printf("2 digit pecahan: %.2f\n", bil);
        System.out.printf("3 digit pecahan: %.3f\n", bil);
        
        System.out.println("Lebar 10 digit:");
        System.out.printf("3 digit pecahan: %10.3f\n", bil);
    }
}
