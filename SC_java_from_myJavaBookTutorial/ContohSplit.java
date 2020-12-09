public class ContohSplit {
    public static void main(String[] args) {
        String st = "Paris:Jakarta:Amsterdam:Roma:Berlin";
        
        String[] kota = st.split(":");

        // Tampilkan isi array
        for (int j = 0; j < kota.length; j++)
             System.out.println(kota[j]);           
    }
}
