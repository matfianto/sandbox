public class AdaString {
    public static void main(String[] args) {
        String sa = "Seputih kapas";
        String sb = "putih";
        String sc = "Putih";

        System.out.println("Apakah \"" + sb + "\" terdapat di \"" +
                           sa + "\"? " +
                           sa.contains(sb));
        System.out.println("Apakah \"" + sc + "\" terdapat di \"" +
                           sa + "\"? " +
                           sa.contains(sc));
    }
}
