public class Deret {
    public static void main(String[] args) {
        int n = 60;
        int bil = 0;
        for (int i = 1; bil + i < n; i++) {
            System.out.println(bil + i);
            bil = bil + i;
        }
    }
}
