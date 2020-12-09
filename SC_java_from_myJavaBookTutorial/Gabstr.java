public class Gabstr {
    public static void main(String[] args) {
        String st = "Apa kabar";

        st.concat(", fren?"); // Tidak mengubah st

        System.out.println("st = " + st);

        System.out.println("Hasil concat() = " + st.concat(", fren?"));
    }
}
