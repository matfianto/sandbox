public class Koma {
    public static void main(String[] args) {
        int n = 60;
        for (int i = 1, bil = 0; bil + i < n; i++, bil += i) {
            System.out.println(bil + i);
        }
    }
}
