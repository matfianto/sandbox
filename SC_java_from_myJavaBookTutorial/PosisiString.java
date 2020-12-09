public class PosisiString {
    public static void main(String[] args) {
        String sa = "Seputih kapas";
        String sb = "putih";
        String sc = "Putih";
        String se = "Se";

        System.out.println("Posisi \"" + sb + "\"  di \"" +
                           sa + "\" ada di indeks " +
                           sa.indexOf(sb));
        System.out.println("Posisi \"" + sc + "\"  di \"" +
                           sa + "\" ada di indeks " +
                           sa.indexOf(sc));        
        System.out.println("Posisi \"" + se + "\"  di \"" +
                           sa + "\" ada di indeks " +
                           sa.indexOf(se));        
    }
}
