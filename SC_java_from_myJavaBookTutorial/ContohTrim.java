public class ContohTrim {
    public static void main(String[] args) {
        String st = "  \tABC\n  ";
              
        System.out.println("Jumlah karakter sebelum trim(): " + 
                           st.length());

        String hasil = st.trim();
        System.out.println("Jumlah karakter setelah trim(): " + 
                           hasil.length());
    }
}
